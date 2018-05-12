package cn.novate.architect_day10;

import android.app.Application;

import cn.novate.architect_day10.simple1.PreferencesUtils;

/**
 * Created by Administrator on 2018/5/6.
 */

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        PreferencesUtils.getInstance().init(this);
    }
}
