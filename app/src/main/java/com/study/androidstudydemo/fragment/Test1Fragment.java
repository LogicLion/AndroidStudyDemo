package com.study.androidstudydemo.fragment;

import android.content.Intent;
import android.view.View;

import com.study.androidstudydemo.R;
import com.study.androidstudydemo.activity.FirstActivity;
import com.study.androidstudydemo.base.BaseFragment;

/**
 * Activity的生命周期
 */
public class Test1Fragment extends BaseFragment {
    @Override
    protected int setupLayoutId() {
        return R.layout.fragment_test;
    }

    @Override
    protected void initView(View view) {

        view.findViewById(R.id.tv_skip).setOnClickListener(v -> {
            //代码执行：
            //1.跳到FirstActivity
            //2.打印FirstActivity所有的生命周期
            //3.在FirstActivity的按钮设置点击，点击跳转SecondActivity
            //4.打印SecondActivity所有的生命周期
            //5.通过log观察在
            //进入FirstActivity时，
            //进入SecondActivity时，
            //退出FirstActivity时，
            //退出SecondActivity时
            //屏幕息屏时
            //屏幕亮屏时
            //两个Activity的生命周期方法的调用情况


            Intent intent = new Intent(getActivity(), FirstActivity.class);
            startActivity(intent);
        });
    }
}
