package com.hkh.example.pager;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

//Nothing special about this adapter, just throwing up colored views for demo
public class MyPagerAdapter extends PagerAdapter {

	Context mContext = null;
	public MyPagerAdapter(Context context) {
		super();
		this.mContext = context;
	}
	
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        TextView view = new TextView(mContext);
        view.setText("Item "+position);
        view.setGravity(Gravity.CENTER);
        view.setBackgroundColor(Color.argb(255, position * 50, position * 10, position * 50));

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View)object);
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == object);
    }
}