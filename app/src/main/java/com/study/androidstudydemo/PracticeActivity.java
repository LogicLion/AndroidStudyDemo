package com.study.androidstudydemo;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.study.androidstudydemo.bean.Target;

/**
 * @author wzh
 * @date 2022/5/4
 */
public class PracticeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_practice);

        TextView tvTitle = findViewById(R.id.tv_title);


        Target target = (Target) getIntent().getSerializableExtra("target");

        tvTitle.setText(target.getTitle());

        try {
            Fragment fragment = (Fragment) Class.forName(target.getFragmentTag()).newInstance();
            getSupportFragmentManager().beginTransaction().add(R.id.fl_content,fragment).commit();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
