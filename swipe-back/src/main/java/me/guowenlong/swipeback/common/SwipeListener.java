package me.guowenlong.swipeback.common;

/**
 * des   : 滑动接口
 * author: Gavin
 * email : guowenlong20000@gmail.com
 * time  : 2017年03月17日 下午 3:44.
 */

public interface SwipeListener {

  void onEdgeTouch();

  void onScroll(float f, int i);
}