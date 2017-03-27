package me.guowenlong.swipeback;


import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import me.guowenlong.swipeback.common.SwipeBackLayout;
import me.guowenlong.swipeback.common.SwipeListener;
import me.guowenlong.swipeback.common.SwipeUtils;


/**
 * des   : 滑动返回的activity
 * author: Gavin
 * email : guowenlong20000@gmail.com
 * time  : 2017年03月17日 下午 3:44.
 */
public class SwipeBackActivity extends AppCompatActivity {

  private SwipeBackLayout swipe;
  private boolean isSlideEnable = true;
  @Override
  protected void onPostCreate(@Nullable Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);
    getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    getWindow().getDecorView().setBackgroundDrawable(null);
    ViewGroup decor = (ViewGroup) getWindow().getDecorView();
    TypedArray a = getTheme().obtainStyledAttributes(new int[]{
        android.R.attr.windowBackground
    });
    int background = a.getResourceId(0, 0);
    a.recycle();
    ViewGroup decorChild = (ViewGroup) decor.getChildAt(0);
    decorChild.setBackgroundResource(background);
    decor.removeView(decorChild);
    swipe = (SwipeBackLayout) LayoutInflater.from(this).inflate(R.layout.swipeback_layout, null);
    swipe.setmSwipeListener(new SwipeListener() {
      @Override
      public void onEdgeTouch() {

      }

      @Override
      public void onScroll(float f, int i) {
        SwipeUtils.getSwipeBackLayout(swipe).setX(Math.min(-500 * Math.max(1 - f, 0) + 40, 0));
        if (f == 0) {
          SwipeUtils.getSwipeBackLayout(swipe).setX(0);
        }
      }
    });
    swipe.setSlideEnable(isSlideEnable);
    swipe.addView(decorChild);
    decor.addView(swipe);
    SwipeUtils.onCreate(swipe);
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    SwipeUtils.onDestory(swipe);
  }

  public void setSlideEnable(boolean isSlideEnable){
    this.isSlideEnable = isSlideEnable;
  }
}