package cn.novate.architect_day10.simple5;

import android.util.LruCache;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/5/6 19:08
 * Version 1.0
 * Params:
 * Description:    内存缓存
*/

public class MemoryIOHandler implements IOHandler {

    // 存在 运行内存中，LruCache原理其实就是 HashMap集合 ，存储图片或者其他类型都是可以的
    private static LruCache<String , Object> mCache = new LruCache<>(10*1024*1024) ;  // 运行内存一般为app大小的 1/8

    @Override
    public void save(String key, String value) {
        mCache.put(key , value) ;
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
        return (String) mCache.get(key);
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
