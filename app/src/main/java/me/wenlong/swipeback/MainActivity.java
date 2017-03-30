package me.wenlong.swipeback;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import me.guowenlong.swipeback.SwipeBackActivity;

/**
 * des   : 首页
 * author: Gavin
 * email : guowenlong20000@gmail.com
 * time  : 2017年03月31日 上午 2:43.
 */
public class MainActivity extends SwipeBackActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(me.wenlong.swipeback.R.layout.activity_main);
    findViewById(R.id.btn_start_default).setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, SecondActivity.class));
      }
    });
    findViewById(R.id.btn_start_viewpager).setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, ViewpagerActivity.class));
      }
    });
    //第一个activity不要滑动返回了
    setSwipeBackEnable(false);
  }
}
