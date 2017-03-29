package me.wenlong.swipeback;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import me.guowenlong.swipeback.SwipeBackActivity;

/**
 * samples 还未完成
 */
public class MainActivity extends SwipeBackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(me.wenlong.swipeback.R.layout.activity_main);
        findViewById(me.wenlong.swipeback.R.id.btn_start).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MainActivity.class));
            }
        });
//        setSwipeBackEnable(false);
    }
}
