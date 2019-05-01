package com.example.moduleframe;

import com.example.corelib.constants.BaseApplication;
import com.example.module_home.BuildConfig;
import com.example.routerlib.config.ARouterConfig;

/**
 * @描述 ${应用的application}
 */
public class MainApplication extends BaseApplication {

    private static MainApplication mainApplication;
    //初始化
    public static MainApplication getInstance() {
        return mainApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mainApplication = this ;

        //ARouter初始化
        ARouterConfig.init(this,BuildConfig.DEBUG);
    }
}
