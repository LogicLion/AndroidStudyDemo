package com.study.androidstudydemo.fragment;

import android.view.View;

import com.study.androidstudydemo.R;
import com.study.androidstudydemo.base.BaseFragment;

/**
 * 切换Fragment
 */
public class Test6Fragment extends BaseFragment {
    @Override
    protected int setupLayoutId() {
        return R.layout.fragment_test;
    }

    @Override
    protected void initView(View view) {

        view.findViewById(R.id.tv_skip).setOnClickListener(v -> {
            //执行代码：
            //1.跳转至ThirdActivity
            //2.创建任意两个fragment,例如Test1Fragment和Test2Fragment，打印这两个fragment的生命周期
            //3.在ThirdActivity里初始化第一个fragment，点击“切换fragment”,分别用replace和hide/show两种方式实现切换到第二个fragment，并观察生命周期

        });
    }
}
