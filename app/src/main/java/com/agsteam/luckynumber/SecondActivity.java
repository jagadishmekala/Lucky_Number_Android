package com.agsteam.luckynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    TextView lucky,name;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        lucky= findViewById(R.id.lucky);
        name =findViewById(R.id.name);
        Intent i=getIntent();
        String un = i.getStringExtra("name");
        int random_num=generaterandomNumber();
        lucky.setText(""+random_num);
        name.setText(""+un);


    }
    public int generaterandomNumber(){
        Random r=new Random();
        int upper_limit=10;
        int randomNumberGenerated = r.nextInt(upper_limit);

        return randomNumberGenerated;
    }
}