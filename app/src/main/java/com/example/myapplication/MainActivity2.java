package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    int guesstimes; //猜測次數
    int result;     //判斷
    int r;          //答案數字
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        TextView display1= findViewById(R.id.textView);// 取得目標物件
        TextView display2= findViewById(R.id.textView2);// 取得目標物件
        TextView display3= findViewById(R.id.textView3);// 取得目標物件
        result = intent.getIntExtra("result",0);
        guesstimes = intent.getIntExtra("guesstimes",0);
        r = intent.getIntExtra("r",0);
        display3.setText("已經猜了:"+guesstimes+"次");
        if(result==1){
            display1.setText("答對了");
            display2.setText("O");
        }
        if(result==2){
            display1.setText("太小了");
            display2.setText("X");
        }
        if(result==3){
            display1.setText("太大了");
            display2.setText("X");
        }
    }
    public void continue_guess (View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity2.this, MainActivity.class);
        intent.putExtra("guesstimes", guesstimes);
        intent.putExtra("r", r);
        startActivity(intent);
    }
    public void restart_guess (View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity2.this, MainActivity.class);
        startActivity(intent);
    }
}