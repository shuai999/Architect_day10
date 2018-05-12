package cn.novate.architect_day10.simple1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import cn.novate.architect_day10.R;


public class MainActivity extends AppCompatActivity {
    private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.test_tv);

        // 下边把数据存储到SP中，然后点击之后从SP中取出数据来显示
        // 这里就有一个问题，就是为了保证app的性能，可以清除缓存，但是有些数据是我们不想要去清理的，
        // 这个时候，我们可以采取 磁盘存储缓存、数据库存储都是可以的
        PreferencesUtils.getInstance()
                .saveString("userName","Novate")
                .saveString("userAge","921228")
                .commit();
    }

    public void click(View view){
        String userName = PreferencesUtils.getInstance().getString("userName");
        String userAge = PreferencesUtils.getInstance().getString("userAge");
        mTextView.setText("userName = "+userName+" userAge = "+userAge);
    }
}
