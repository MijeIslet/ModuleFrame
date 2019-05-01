package com.example.corelib.constants;

import android.app.Application;

/**
 * @描述 ${保存全局变量设计的基本类application}
 */
public class BaseApplication extends Application {

    private static BaseApplication mBaseApplication ;
    //Activity管理
    private ActivityControl mActivityControl;


    @Override
    public void onCreate() {
        super.onCreate();
        mActivityControl = new ActivityControl();

    }

    /**
     * 获取全局context
     * @return 全局context
     */
    public static BaseApplication getAppContext(){
        return mBaseApplication;
    }

    /**
     * 程序终止的时候执行
     */
    @Override
    public void onTerminate() {
        super.onTerminate();
        exitApp();
    }

    /**
     * 退出应用
     */
    public void exitApp() {
        mActivityControl.finishiAll();
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }

    /**
     * 低内存的时候执行
     */
    @Override
    public void onLowMemory() {
        super.onLowMemory();

    }

    // 程序在内存清理的时候执行
    /**
     * 程序在内存清理的时候执行
     */
    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);

    }



}
