package com.example.activitylifecycletest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button startNormalActivity = (Button)findViewById(R.id.start_normal_activity);
        Button startDialogActivity = (Button)findViewById(R.id.start_dialog_activity);

        startNormalActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,NormalActivity.class);
                startActivity(intent);
            }
        });

        startDialogActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,DialogActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "OnStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "OnResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "OnPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "OnStop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, "onRestart");
    }


}
