package cn.novate.architect_day10.simple5;

import cn.novate.architect_day10.simple5.DiskIOHandler;
import cn.novate.architect_day10.simple5.IOFactory;
import cn.novate.architect_day10.simple5.IOHandler;
import cn.novate.architect_day10.simple5.MemoryIOHandler;
import cn.novate.architect_day10.simple5.PreferencesIOHandler;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/5/12 10:57
 * Version 1.0
 * Params:
 * Description:    工厂设计模式 - 单例写法
*/
public class IOHandlerFactory implements IOFactory {

    private static volatile  IOHandlerFactory mInstance;
    private IOHandler mMemoryIOHandler,mPreferencesIOHandler;

    private IOHandlerFactory(){

    }

    public static IOHandlerFactory getInstance(){
        if(mInstance == null){
            synchronized (IOHandlerFactory.class){
                if(mInstance == null){
                    mInstance = new IOHandlerFactory();
                }
            }
        }
        return mInstance;
    }

    /**
     * 创建IOHandler
     */
    public IOHandler createIOHandler(Class<? extends IOHandler> ioHandlerClass){
        try {
            return ioHandlerClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new PreferencesIOHandler();
    }

    /**
     * 获取 运行内存 存储
     */
    public IOHandler getMemoryIOHandler(){
        if(mMemoryIOHandler == null){
            mMemoryIOHandler = createIOHandler(MemoryIOHandler.class);
        }
        return mMemoryIOHandler;
    }

    /**
     * 获取 磁盘 存储
     */
    public IOHandler getDiskIOHandler(){
        return createIOHandler(DiskIOHandler.class);
    }

    /**
     * 获取 SP 存储
     */
    public IOHandler getPreferencesIOHandler(){
        if(mPreferencesIOHandler == null){
            mPreferencesIOHandler = createIOHandler(PreferencesIOHandler.class);
        }
        return mPreferencesIOHandler;
    }

    /**
     * 获取默认存储 - 默认是 SP存储
     * 搞一个默认存储的原因：
     *      有时候代码写完了，但是网上有很多高效的或者本来就是用别人的，但是某些人出了更好的，这样方便切换这3种存储方式
     */
    public IOHandler getDefaultIOHandler(){
        return getMemoryIOHandler();
    }
}

