package cn.novate.architect_day10.simple4;

import cn.novate.architect_day10.simple4.PreferencesIOHandler;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/5/6 19:04
 * Version 1.0
 * Params:
 * Description: 工厂设计模式 - 简单工厂设计模式
 *              用于创建数据存储
*/

public class IOHandlerFactory {


    public static IOHandler createIOHandler(Class<? extends IOHandler> ioHandlerClass){
        try {
            return ioHandlerClass.newInstance() ;
        } catch (Exception e) {
            e.printStackTrace();
        }
            return new PreferencesIOHandler();
    }


    /**
     * 获取运行内存存储
     */
    public static IOHandler getMemoryIOHandler(){
        return createIOHandler(MemoryIOHandler.class) ;
    }

    /**
     * 获取SP存储
     */
    public static IOHandler getPreferenceIOHandler(){
        return createIOHandler(PreferencesIOHandler.class) ;
    }

    /**
     * 获取磁盘存储
     */
    public static IOHandler getDiskIOHandler(){
        return createIOHandler(DiskIOHandler.class) ;
    }


    /**
     * 获取默认存储 - 默认是 SP存储
     * 搞一个默认存储的原因：
     *      有时候代码写完了，但是网上有很多高效的或者本来就是用别人的，但是某些人出了更好的，这样方便切换这3种存储方式
     */
    public static IOHandler getDefaultIOHandler(){
        return getPreferenceIOHandler() ;
    }

    /**
     * 以后如果需要新增存储方式，只需要在下边新增方法就可以，其实新增类和新增方法都是一样的
     */
}
