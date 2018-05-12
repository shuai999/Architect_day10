package cn.novate.architect_day10.simple3;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/5/6 19:06
 * Version 1.0
 * Params:
 * Description:    数据存储的一些规范
*/

public interface IOHandler {
    /*************save data start***************/
    void save(String key, String value);
    void save(String key, double value);
    void save(String key, int value);
    void save(String key, long value);
    void save(String key, boolean value);
    void save(String key, Object value);
    /*************end data start***************/

    /*************get data start***************/
    String getString(String key);
    double getDouble(String key, double defaultValue);
    int getInt(String key, int defaultValue);
    long getLong(String key, long defaultValue);
    boolean getBoolean(String key, boolean defaultValue);
    Object getObject(String key);
    /*************get data end***************/
}
