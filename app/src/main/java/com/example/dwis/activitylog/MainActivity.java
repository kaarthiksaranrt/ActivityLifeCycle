package com.example.dwis.activitylog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG=MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"in method onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"in method onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"in method onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"in method onPause");

    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"in method onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"in method onDestory");
    }

}
