package com.example.textrecognition;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {
    EditText name1,name2,name3,name4,name5,name6,name7,name8;
    Button buttonback;
    int name_iterator=2;
    String names = "";

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_start);
    buttonback = findViewById(R.id.next);
    name1 = findViewById(R.id.name1);
    name2 = findViewById(R.id.name2);
    name3 = findViewById(R.id.name3);
    name4 = findViewById(R.id.name4);
    name5 = findViewById(R.id.name5);
    name6 = findViewById(R.id.name6);
    name7 = findViewById(R.id.name7);
    name8 = findViewById(R.id.name8);

    name1.addTextChangedListener(named);
    name2.addTextChangedListener(named);
    name3.addTextChangedListener(named);
    name4.addTextChangedListener(named);
    name5.addTextChangedListener(named);
    name6.addTextChangedListener(named);
    name7.addTextChangedListener(named);
    name8.addTextChangedListener(named);



}
private TextWatcher named = new TextWatcher() {
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {if(s.length() == 0){
        buttonback.setEnabled(false);
    }else{
        buttonback.setEnabled(true);
    }
    }

    @Override
    public void afterTextChanged(Editable s) {

    }
    };
public void addNameClick(View view){
        name_iterator++;
        switch (name_iterator) {
            case 3:
                ((EditText)findViewById(R.id.name3)).setVisibility(View.VISIBLE);
                break;
            case 4:
                ((EditText)findViewById(R.id.name4)).setVisibility(View.VISIBLE);
                break;
            case 5:
                ((EditText)findViewById(R.id.name5)).setVisibility(View.VISIBLE);
                break;
            case 6:
                ((EditText)findViewById(R.id.name6)).setVisibility(View.VISIBLE);
                break;
            case 7:
                ((EditText)findViewById(R.id.name7)).setVisibility(View.VISIBLE);
                break;
            case 8:
                ((EditText)findViewById(R.id.name8)).setVisibility(View.VISIBLE);
                break;
            default:
                break;
        }
    }
public void nextClick(View view){
        if (name_iterator>8){
            name_iterator=8;
        }
        switch (name_iterator) {
            case 8:
                names+=((EditText)findViewById(R.id.name8)).getText().toString()+",";
            case 7:
                names+=((EditText)findViewById(R.id.name7)).getText().toString()+",";
            case 6:
                names+=((EditText)findViewById(R.id.name6)).getText().toString()+",";
            case 5:
                names+=((EditText)findViewById(R.id.name5)).getText().toString()+",";
            case 4:
                names+=((EditText)findViewById(R.id.name4)).getText().toString()+",";
            case 3:
                names+=((EditText)findViewById(R.id.name3)).getText().toString()+",";
            default:
                names+=((EditText)findViewById(R.id.name2)).getText().toString()+",";
                names+=((EditText)findViewById(R.id.name1)).getText().toString()+",";
        }
        Intent i = new Intent(StartActivity.this, Fill_in.class);
        i.putExtra("names", names);
        startActivity(i);
    }
    public void exit(View view) {
        moveTaskToBack(true); android.os.Process.killProcess(android.os.Process.myPid()); System.exit(1);}
}