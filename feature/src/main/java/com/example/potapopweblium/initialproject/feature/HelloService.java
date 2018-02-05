package com.example.potapopweblium.initialproject.feature;

import android.app.Service;
import android.os.IBinder;
import android.content.Intent;
import android.os.Bundle;

public class HelloService extends Service{

    int mStartMode;

    IBinder mBinder;

    boolean mAllowRebind;

    @Override
    public void onCreate(){

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        return mStartMode;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    @Override
    public void onRebind(Intent intent) {

    }

    @Override
    public void onDestroy() {

    }
}
