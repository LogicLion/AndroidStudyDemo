package com.study.androidstudydemo.fragment;

import android.view.View;

import com.study.androidstudydemo.R;
import com.study.androidstudydemo.base.BaseFragment;

/**
 * 服务service
 */
public class Test7Fragment extends BaseFragment {
    @Override
    protected int setupLayoutId() {
        return R.layout.fragment_test;
    }

    @Override
    protected void initView(View view) {

        view.findViewById(R.id.tv_skip).setOnClickListener(v -> {
            //执行代码：
            //1.跳转至ThirdActivity
            //2.创建一个service，并打印生命周期
            //2.点击“执行”分别用start方式和bind方式启动service，并观察生命周期

        });
    }
}
