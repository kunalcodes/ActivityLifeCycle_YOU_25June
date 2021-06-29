package com.example.activity_lifecycle_you;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button mBtn_Launch2;
    private String TAG2 = "Main Activity2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        mBtn_Launch2 = findViewById(R.id.btn_launch2);
        mBtn_Launch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
        Log.d(TAG2, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG2, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG2, "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG2, "onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG2, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG2, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG2, "onDestroy");
    }
}