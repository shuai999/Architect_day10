package cn.novate.architect_day10.simple5;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import cn.novate.architect_day10.R;
import cn.novate.architect_day10.simple5.IOHandler;
import cn.novate.architect_day10.simple5.IOHandlerFactory;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/5/12 9:23
 * Version 1.0
 * Params:
 * Description:    抽象工厂测试 - 单例设计模式写法
*/

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.test_tv);
        IOHandler ioHandler = IOHandlerFactory.getInstance().getDefaultIOHandler() ;
        ioHandler.save("userName" , "北京 - Novate");
        ioHandler.save("userAge" , "920925");
    }

    public void click(View view){
        IOHandler ioHandler = IOHandlerFactory.getInstance().getDefaultIOHandler() ;
        String userName = ioHandler.getString("userName") ;
        String userAge = ioHandler.getString("userAge") ;
        mTextView.setText("userName = " + userName + " , userAge = " + userAge) ;
    }
}
