package com.study.androidstudydemo.fragment;

import android.view.View;

import com.study.androidstudydemo.R;
import com.study.androidstudydemo.base.BaseFragment;

/**
 * Fragment的生命周期
 */
public class Test4Fragment extends BaseFragment {
    @Override
    protected int setupLayoutId() {
        return R.layout.fragment_test;
    }

    @Override
    protected void initView(View view) {

        view.findViewById(R.id.tv_skip).setOnClickListener(v -> {
            //熟悉Fragment的生命周期
            //执行代码：
            //1.跳转ThirdActivity，把ThirdActivity里的frameLayout替换成任意fragment
            //2.打印ThirdActivity和该fragment的生命周期
            //观察界面进入，界面退出时，生命周期的调用情况

        });
    }
}
