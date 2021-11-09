package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int r;
    int guessNum;
    int guesstimes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        r = intent.getIntExtra("r",0);
        guessNum = intent.getIntExtra("guessNum",0);
        guesstimes = intent.getIntExtra("guesstimes",0);
        if(r == 0){
            r = getNum(1,10);
        }
    }
    //get random number for startNum(not include endNum)
        public static  int getNum(int startNum,int endNum){
        if(startNum<endNum){
          Random random=new Random();
          return random.nextInt(endNum-startNum)+startNum;
         }
        return 0;
        }


    public void guessjudge (){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, MainActivity2.class);
        intent.putExtra("result", 3);
        intent.putExtra("guesstimes", guesstimes);
        intent.putExtra("r", r);
        if (guessNum == r) {
            intent.putExtra("result", 1);
        } else {
            if (guessNum < r) {
                intent.putExtra("result", 2);
            }
            if (guessNum > r) {
                intent.putExtra("result", 3);
            }
        }
        startActivity(intent);
    }
    public void restart_guess (View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, MainActivity.class);
        startActivity(intent);
    }
        public void guess1 (View view){
            guessNum=1;
            guesstimes+=1;
            guessjudge();
        }
        public void guess2 (View view){
            guessNum=2;
            guesstimes+=1;
            guessjudge();
        }
        public void guess3 (View view){
            guessNum=3;
            guesstimes+=1;
            guessjudge();
        }
        public void guess4 (View view){
            guessNum=4;
            guesstimes+=1;
            guessjudge();
        }
        public void guess5 (View view){
            guessNum=5;
            guesstimes+=1;
            guessjudge();
        }
        public void guess6 (View view){
            guessNum=6;
            guesstimes+=1;
            guessjudge();
        }
        public void guess7 (View view){
            guessNum=7;
            guesstimes+=1;
            guessjudge();
        }
        public void guess8 (View view){
            guessNum=8;
            guesstimes+=1;
            guessjudge();
        }
        public void guess9 (View view){
            guessNum=9;
            guesstimes+=1;
            guessjudge();
        }

}