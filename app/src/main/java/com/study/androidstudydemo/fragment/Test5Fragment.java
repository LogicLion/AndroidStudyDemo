package com.study.androidstudydemo.fragment;

import android.view.View;

import com.study.androidstudydemo.R;
import com.study.androidstudydemo.base.BaseFragment;

/**
 * Activity给Fragment传值
 */
public class Test5Fragment extends BaseFragment {
    @Override
    protected int setupLayoutId() {
        return R.layout.fragment_test;
    }

    @Override
    protected void initView(View view) {

        view.findViewById(R.id.tv_skip).setOnClickListener(v -> {
            //接Test4Fragment
            //执行代码：
            //1.在ThirdActivity定义int和String两个变量，传递给fragment，在fragment里接收这两个变量

        });
    }
}
