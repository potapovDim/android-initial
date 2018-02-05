package com.example.potapopweblium.initialproject.feature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String ms = "android";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(ms, "onCreate method called");
        Log.d(ms, "----------------------");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(ms, "onStart method called");
        Log.d(ms, "----------------------");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(ms, "onResume method called");
        Log.d(ms, "----------------------");
    }
}
