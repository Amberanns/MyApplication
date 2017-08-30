package com.bawei.myapplication;

import android.app.Application;

import org.xutils.x;

/**
 * @author 郭丽君
 *         类的作用：
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(false);
    }
}
