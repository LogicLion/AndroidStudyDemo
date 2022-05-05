package com.study.androidstudydemo.fragment;

import android.view.View;

import com.study.androidstudydemo.R;
import com.study.androidstudydemo.base.BaseFragment;

/**
 * Activity通过intent传递参数
 */
public class Test2Fragment extends BaseFragment {
    @Override
    protected int setupLayoutId() {
        return R.layout.fragment_test;
    }

    @Override
    protected void initView(View view) {

        view.findViewById(R.id.tv_skip).setOnClickListener(v -> {

            //相关知识点：intent

            //代码执行：
            //1.跳到FirstActivity
            //2.在FirstActivity定义一个int类型和一个String类型的全局变量
            //3.在FirstActivity的按钮设置点击，点击跳转SecondActivity，跳转时通过intent传递上面两个变量
            //4.在SecondActivity通过intent接收这两个变量
            //5.并通过log打印出来
        });
    }
}
