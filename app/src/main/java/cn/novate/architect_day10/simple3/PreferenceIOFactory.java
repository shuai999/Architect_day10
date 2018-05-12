package cn.novate.architect_day10.simple3;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/5/12 10:07
 * Version 1.0
 * Params:
 * Description:    本地SP缓存的工厂类
*/

public class PreferenceIOFactory implements IOFactory {
    @Override
    public IOHandler createIOHandler() {
        return new PreferencesIOHandler();
    }
}
