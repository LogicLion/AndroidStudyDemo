package com.study.androidstudydemo.bean;

import java.io.Serializable;

/**
 * @author wzh
 * @date 2022/5/4
 */
public class Target implements Serializable {

    String title;
    String fragmentTag;
    boolean finished;

    public Target(String title) {
        this.title = title;
    }

    public Target(String title, String fragmentTag) {
        this.title = title;
        this.fragmentTag = fragmentTag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFragmentTag() {
        return fragmentTag;
    }

    public void setFragmentTag(String fragmentTag) {
        this.fragmentTag = fragmentTag;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }
}
