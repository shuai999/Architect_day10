package cn.novate.architect_day10.simple2;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/5/6 19:04
 * Version 1.0
 * Params:
 * Description: 工厂设计模式 - 简单工厂设计模式
 *              用于创建数据存储
*/

public class IOHandlerFactory {

    public enum IOType{
        MEMORY , PREFERENCES , DISK
    }

    public static IOHandler createIOHandler(IOType ioType){
        switch (ioType){
            case MEMORY:
                // 在这里只是返回一个对象，有时候我们需要一系列的初始化参数
                // 这里边直接返回一个对象，做到了解耦，比如你不想用MemoryIOHandler，想用 MemoryIOHandler，可以直接把MemoryIOHandler 写好，
                // 然后直接返回 MemoryIOHandler对象即可
                 return new MemoryIOHandler() ;
            case PREFERENCES:
                 return new PreferencesIOHandler() ;
            case DISK:  // 新增case语句，新增磁盘 DISK存储
                return new DiskIOHandler() ;
            default:
                return null ;
        }
    }
}
