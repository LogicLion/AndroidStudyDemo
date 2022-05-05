package com.study.androidstudydemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.study.androidstudydemo.R;

/**
 * @author wzh
 * @date 2022/5/5
 */
public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_first);

        Log.v("FirstActivity", "FirstActivity:"+this.toString());
        Log.v("FirstActivity", "taskid:"+getTaskId()+"");

        TextView tv = findViewById(R.id.tv);
        tv.setOnClickListener(v -> {
            startActivity(new Intent(this, SecondActivity.class));

        });

    }
}
