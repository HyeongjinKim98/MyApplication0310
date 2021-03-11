package com.example.myapplication0310;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //레이아웃을 뿌려줌(activity_main.xml 이용)
        //onCreate on : ~할때, callback함수 or handler(처리기) ,자동호출 only
    }
}