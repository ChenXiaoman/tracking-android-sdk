package com.visenze.usertrackingsdk;

import android.annotation.SuppressLint;
import android.os.Build;
import android.provider.Settings;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.provider.Settings.Secure;


public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @SuppressLint("MissingPermission")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String android_id = Secure.getString(this.getContentResolver(),
                Secure.ANDROID_ID);
        System.out.println(android_id+" android id here!!!!");
    }
}
