package me.wenlong.swipeback;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.View.OnClickListener;
import me.guowenlong.swipeback.SwipeBackActivity;

/**
 * des   : 展示Demo的页面
 * author: Gavin
 * email : guowenlong20000@gmail.com
 * time  : 2017年03月31日 上午 2:43.
 */

public class SecondActivity extends SwipeBackActivity {

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_second);
    findViewById(R.id.btn_start).setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(new Intent(SecondActivity.this, SecondActivity.class));
      }
    });
    setSwipeBackEnable(true);//默认就是true 可以忽略不写
  }
}
