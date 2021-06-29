package com.example.activity_lifecycle_you;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {

    private String TAG3 = "Main Activity3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        Log.d(TAG3, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG3, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG3, "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG3, "onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG3, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG3, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG3, "onDestroy");
    }
}