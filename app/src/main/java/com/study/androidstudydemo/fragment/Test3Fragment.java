package com.study.androidstudydemo.fragment;

import android.content.Intent;
import android.view.View;

import com.study.androidstudydemo.R;
import com.study.androidstudydemo.activity.FirstActivity;
import com.study.androidstudydemo.base.BaseFragment;

/**
 * Activity的4种启动模式
 */
public class Test3Fragment extends BaseFragment {
    @Override
    protected int setupLayoutId() {
        return R.layout.fragment_test;
    }

    @Override
    protected void initView(View view) {

        view.findViewById(R.id.tv_skip).setOnClickListener(v -> {
            //前置知识点：activity任务栈，理解即可
            //Activity的4种启动模式:standard：标准模式， singleTop：栈顶复用模式，singleTask：栈内复用模式，singleInstance：单实例模式，较难，理解为主

            //先把FirstActivity和SecondActivity的对象和任务栈id打印出来，重写FirstActivity的onNewIntent()方法，并打印出来
            //1.先把FirstActivity设置为4种模式之一
            //2.代码执行：跳转到FirstActivity,从FirstActivity中跳转SecondActivity，再从SecondActivity跳转到FirstActivity
            //3.观察此过程中的log打印情况,然后反推这两个界面在任务栈的情况

            startActivity(new Intent(getActivity(), FirstActivity.class));
        });
    }
}
