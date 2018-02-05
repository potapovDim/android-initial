package com.example.potapopweblium.initialproject.feature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import android.app.Activity;
import android.view.View;

public class MainActivity extends Activity {
    String ms = "android say :";

    @Override
    public void onCreate(Bundle savedInstanseState) {
        super.onCreate(savedInstanseState);
        setContentView(R.layout.activity_main);
        Log.d(ms,"onCreate was runned");
    }

    public void startService(View view){
        startService(new Intent(getBaseContext(), HelloService.class));
    }

    public void stopService(){
        stopService(new Intent(getBaseContext(), HelloService.class));
    }

    //    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Log.d(ms, "onCreate method called");
//        Log.d(ms, "----------------------");
//    }
//    @Override
//    protected void onStart(){
//        super.onStart();
//        Log.d(ms, "onStart method called");
//        Log.d(ms, "----------------------");
//    }
//    @Override
//    protected void onResume(){
//        super.onResume();
//        Log.d(ms, "onResume method called");
//        Log.d(ms, "----------------------");
//    }
}
