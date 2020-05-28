package com.example.textrecognition;


import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Fill_in extends AppCompatActivity {
    private ArrayList<message_controller> mExampleList;
    private RecyclerView mRecycleView;
    private ExampleAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private Button buttonInsert;
    private String myName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_in);

        buttonInsert = findViewById(R.id.b_insert);

        Intent intent = getIntent();
        myName = intent.getStringExtra("names");

        EditText edittext = (EditText) findViewById(R.id.edit_text_insert);
        edittext.setFilters(new InputFilter[] {
                new InputFilter() {
                    @Override
                    public CharSequence filter(CharSequence source, int start,
                                               int end, Spanned dest, int dstart, int dend) {
                        if(source.equals("")){ // for backspace
                            return source;
                        }
                        if(source.toString().matches("[a-zA-Zа-яА-Я 0-9-]+")){
                            return source;
                        }
                        return "";
                    }
                }
        });

        createExampleList();
        buildRecycleview();
        setButtons();
    }

    public void insertItem() {
        int position=mExampleList.size();
        String pos=((EditText)findViewById(R.id.edit_text_insert)).getText().toString();
        String price=((EditText)findViewById(R.id.edit_text_remove)).getText().toString();
        mExampleList.add(position, new message_controller(pos, price, myName));
        mAdapter.notifyItemInserted(position);
        ((EditText)findViewById(R.id.edit_text_insert)).setText("");
        ((EditText)findViewById(R.id.edit_text_remove)).setText("");
    }

    public void removeItem(int position) {
        mExampleList.remove(position);
        mAdapter.notifyItemRemoved(position);
    }
    public void changeItem(int position, String text, String text_2) {
        mExampleList.get(position).changeText1(text, text_2);
        mAdapter.notifyItemChanged(position);
    }
    // функция для выбора
    public void getItem(int position) {
        ((EditText)findViewById(R.id.edit_text_insert)).setText(mExampleList.get(position).getText1());
        ((EditText)findViewById(R.id.edit_text_remove)).setText(mExampleList.get(position).getText2());
        mExampleList.get(position).getName();
    }
    // функция регистрации нажатых флажочков
    public void checkItem(int position, String names) {
        mExampleList.get(position).changeStringName(names);
    }
    public void createExampleList(){
        mExampleList = new ArrayList<>();
    }
    public void setButtons(){
        buttonInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertItem();
            }
        });
    }
    public void buildRecycleview(){
        mRecycleView = findViewById(R.id.recyclerView);
        mRecycleView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(mExampleList);

        mRecycleView.setLayoutManager(mLayoutManager);
        mRecycleView.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(new ExampleAdapter.OnItemClickListener() {
            @Override
            public void onDeleteClick(int position) {
                removeItem(position);
            }
            @Override
            public void onChangeClick(int position) {
                getItem(position);
                removeItem(position);
            }
            @Override
            public void onCheckClick(int position, String names) {
                checkItem(position, names);

            }
        });
    }
    // кнопка рассчитать
    public void onButtonCountClick(View view){
        Bill check1=new Bill();
        int position=0;
        // добавление всех имен в Bill
        check1.addPersonAll(myName.split(","));
        // цикл для перебора всех пунктов списка
        for (position=0; position<mExampleList.size(); position++){
            check1.addPosition(mExampleList.get(position).getText1(), Double.parseDouble(mExampleList.get(position).getText2()));
            check1.addPerson2(mExampleList.get(position).getStringName().split(","));
        }
        // расчет чека
        check1.count();
        Intent intent = new Intent(Fill_in.this, ResultActivity.class);
        intent.putExtra("it", Integer.toString(check1.getNumPerson()));
        ArrayList<String> array = new ArrayList<>();
        String tem_name;
        Double temp_cost;
        for (int k=0; k<check1.getNumPerson(); k++){
            tem_name=check1.getStringPerson().get(k);
            array.add(tem_name);
            temp_cost=check1.printResult(check1.getStringPerson().get(k));
            array.add(Double.toString(temp_cost));
        }
        intent.putExtra("list", array);
        startActivity(intent);
    }

    public void onMyButtonClick(View view){
        Intent i = new Intent(Fill_in.this, RecognizeText.class);
        startActivityForResult(i, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode){
            case 1:
                if(resultCode == RESULT_OK){
                }
                break;

            default:
                super.onActivityResult(requestCode, resultCode, data);
                break;
        }
    }
}
