package cn.novate.architect_day10.simple2;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import cn.novate.architect_day10.R;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/5/12 9:23
 * Version 1.0
 * Params:
 * Description:    简单工厂测试
*/

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.test_tv);
        // 通过IOHandlerFactory工厂，传如对应缓存的名称，比如MEMORY、PREFERENCES、DISK，就可以切换对应的缓存方式
        IOHandler ioHandler = IOHandlerFactory.createIOHandler(IOHandlerFactory.IOType.MEMORY);
        ioHandler.save("userName" , "北京 - Novate");
        ioHandler.save("userAge" , "920925");
    }

    public void click(View view){
        IOHandler ioHandler = IOHandlerFactory.createIOHandler(IOHandlerFactory.IOType.MEMORY);
        String userName = ioHandler.getString("userName") ;
        String userAge = ioHandler.getString("userAge") ;
        mTextView.setText("userName = " + userName + " , userAge = " + userAge) ;

    }
}
