package cn.novate.architect_day10.simple3;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/5/12 10:05
 * Version 1.0
 * Params:
 * Description:    运行内存缓存的工厂类
*/

public class MemoryIOFactory implements IOFactory{

    @Override
    public IOHandler createIOHandler() {
        return new MemoryIOHandler();
    }
}
