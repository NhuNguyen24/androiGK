package com.example.demobaocao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnOpenActivity1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ánh xạ
        btnOpenActivity1 = findViewById(R.id.buttonOpenActivity1);
        btnOpenActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        MainActivity.this,
                        SecondActivity.class);
                startActivity(intent);
            }
        });
        Log.d("MYLOG","onCreate Activity 1");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MYLOG", "onStart Activity 1");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MYLOG", "onRestart Activity 1");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MYLOG", "onResume Activity 1");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MYLOG", "onPause Activity 1");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MYLOG", "onStop Activity 1");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MYLOG", "onDestroy Activity 1");
    }
}