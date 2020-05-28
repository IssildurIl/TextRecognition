package com.example.textrecognition;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        int iterator=0;

        Intent intent = getIntent();
        iterator = Integer.parseInt(intent.getStringExtra("it"));
        ArrayList<String> arrayFromIntent = (ArrayList<String>) intent.getSerializableExtra("list");
        if (iterator>8){
            iterator=8;
        }
        String getInf="";
        String getInf2="";
        switch (iterator) {
            case 8:
                getInf=arrayFromIntent.get(15);
                ((TextView)findViewById(R.id.resCost8)).setText(getInf);
                getInf=arrayFromIntent.get(14);
                ((TextView)findViewById(R.id.resName8)).setText(getInf);
                ((LinearLayout)findViewById(R.id.linearLayout8)).setVisibility(View.VISIBLE);
            case 7:
                getInf=arrayFromIntent.get(13);
                ((TextView)findViewById(R.id.resCost7)).setText(getInf);
                getInf=arrayFromIntent.get(12);
                ((TextView)findViewById(R.id.resName7)).setText(getInf);
                ((LinearLayout)findViewById(R.id.linearLayout7)).setVisibility(View.VISIBLE);
            case 6:
                getInf=arrayFromIntent.get(11);
                ((TextView)findViewById(R.id.resCost6)).setText(getInf);
                getInf=arrayFromIntent.get(10);
                ((TextView)findViewById(R.id.resName6)).setText(getInf);
                ((LinearLayout)findViewById(R.id.linearLayout6)).setVisibility(View.VISIBLE);
            case 5:
                getInf=arrayFromIntent.get(9);
                ((TextView)findViewById(R.id.resCost5)).setText(getInf);
                getInf=arrayFromIntent.get(8);
                ((TextView)findViewById(R.id.resName5)).setText(getInf);
                ((LinearLayout)findViewById(R.id.linearLayout5)).setVisibility(View.VISIBLE);
            case 4:
                getInf=arrayFromIntent.get(7);
                ((TextView)findViewById(R.id.resCost4)).setText(getInf);
                getInf=arrayFromIntent.get(6);
                ((TextView)findViewById(R.id.resName4)).setText(getInf);
                ((LinearLayout)findViewById(R.id.linearLayout4)).setVisibility(View.VISIBLE);
            case 3:
                getInf=arrayFromIntent.get(5);
                ((TextView)findViewById(R.id.resCost3)).setText(getInf);
                getInf=arrayFromIntent.get(4);
                ((TextView)findViewById(R.id.resName3)).setText(getInf);
                ((LinearLayout)findViewById(R.id.linearLayout3)).setVisibility(View.VISIBLE);
            default:
                getInf=arrayFromIntent.get(3);
                ((TextView)findViewById(R.id.resCost2)).setText(getInf);
                getInf=arrayFromIntent.get(2);
                ((TextView)findViewById(R.id.resName2)).setText(getInf);
                getInf=arrayFromIntent.get(1);
                ((TextView)findViewById(R.id.resCost1)).setText(getInf);
                getInf=arrayFromIntent.get(0);
                ((TextView)findViewById(R.id.resName1)).setText(getInf);

        }
    }
}
