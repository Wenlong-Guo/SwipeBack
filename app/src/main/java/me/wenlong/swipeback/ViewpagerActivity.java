package me.wenlong.swipeback;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;
import me.guowenlong.swipeback.SwipeBackActivity;

/**
 * des   : 描述
 * author: Administrator
 * email : guowenlong20000@gmail.com
 * time  : 2017年03月31日 上午 2:57.
 */

public class ViewpagerActivity extends SwipeBackActivity {

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_viewpager);
    findViewById(R.id.btn_finish).setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        finish();
      }
    });
    setSwipeBackEnable(true);//默认就是true 可以忽略不写
    ViewPager viewPager = (ViewPager) findViewById(R.id.vp_vp);
    ArrayList<View> views = new ArrayList<>();
    ImageView imageView1 = new ImageView(this);
    ImageView imageView2 = new ImageView(this);
    ImageView imageView3 = new ImageView(this);
    imageView1.setBackgroundColor(getResources().getColor(R.color.red));
    imageView2.setBackgroundColor(getResources().getColor(R.color.green));
    imageView3.setBackgroundColor(getResources().getColor(R.color.blue));
    views.add(imageView1);
    views.add(imageView2);
    views.add(imageView3);
    ViewPagerAdapter adapter = new ViewPagerAdapter(views);
    viewPager.setAdapter(adapter);
  }

  public class ViewPagerAdapter extends PagerAdapter {

    List<View> viewLists;

    public ViewPagerAdapter(List<View> lists) {
      viewLists = lists;
    }

    @Override
    public int getCount() {
      return viewLists.size();
    }

    @Override
    public boolean isViewFromObject(View arg0, Object arg1) {
      // TODO Auto-generated method stub
      return arg0 == arg1;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
      container.removeView(viewLists.get(position));
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
      container.addView(viewLists.get(position), 0);
      return viewLists.get(position);
    }
  }
}
