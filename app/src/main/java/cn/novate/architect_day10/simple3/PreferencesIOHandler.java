package cn.novate.architect_day10.simple3;

import cn.novate.architect_day10.simple1.PreferencesUtils;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/5/6 19:20
 * Version 1.0
 * Params:
 * Description:    本地SP缓存
*/

public class PreferencesIOHandler implements IOHandler {
    @Override
    public void save(String key, String value) {
        PreferencesUtils.getInstance().saveString(key , value) ;
    }

    @Override
    public void save(String key, double value) {

    }

    @Override
    public void save(String key, int value) {

    }

    @Override
    public void save(String key, long value) {

    }

    @Override
    public void save(String key, boolean value) {

    }

    @Override
    public void save(String key, Object value) {

    }

    @Override
    public String getString(String key) {
        return PreferencesUtils.getInstance().getString(key);
    }

    @Override
    public double getDouble(String key, double defaultValue) {
        return 0;
    }

    @Override
    public int getInt(String key, int defaultValue) {
        return 0;
    }

    @Override
    public long getLong(String key, long defaultValue) {
        return 0;
    }

    @Override
    public boolean getBoolean(String key, boolean defaultValue) {
        return false;
    }

    @Override
    public Object getObject(String key) {
        return null;
    }
}
