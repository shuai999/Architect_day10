package cn.novate.architect_day10.simple1;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/5/6 18:53
 * Version 1.0
 * Params:
 * Description:
*/

public class PreferencesUtils {

    private volatile static PreferencesUtils mInstance ;
    private SharedPreferences mPreferences;
    private SharedPreferences.Editor mEditor;


    private PreferencesUtils(){

    }

    public static PreferencesUtils getInstance(){
        if (mInstance == null){
            synchronized (PreferencesUtils.class){
                if (mInstance == null){
                    mInstance = new PreferencesUtils() ;
                }
            }
        }
        return mInstance ;
    }


    /**
     * 这里不会内存泄露：因为这里调用的是 context的getApplicationContext() ，而不是调用的是Activity
     */
    public void init(Context context){
        mPreferences = context.getApplicationContext().getSharedPreferences("cache",Context.MODE_PRIVATE);
        mEditor = mPreferences.edit();
    }


    public PreferencesUtils saveString(String key,String value){
        mEditor.putString(key,value);
        return this;
    }

    public void commit(){
        mEditor.commit();
    }

    public String getString(String key){
        return mPreferences.getString(key,"");
    }
}
