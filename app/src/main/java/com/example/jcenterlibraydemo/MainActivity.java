package com.example.jcenterlibraydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.testlibrary.PrintLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        PrintLog printLog = new PrintLog();


        printLog.PrintError("test");
    }
}