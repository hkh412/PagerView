/*
 * Copyright (c) 2012 Wireless Designs, LLC
 * 
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 * 
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.hkh.example.pager;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * source from https://gist.github.com/devunwired/8cbe094bb7a783e37ad1
 * @author hkh
 *
 */
public class MainActivity extends Activity 
	implements OnClickListener, OnPageChangeListener {

    PagerContainer mContainer = null;
    ViewPager mPager = null;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContainer = (PagerContainer) findViewById(R.id.pager_container);
        mPager = mContainer.getViewPager();
        
        PagerAdapter adapter = new MyPagerAdapter(MainActivity.this);
        mPager.setAdapter(adapter);
        //Necessary or the pager will only have one extra page to show
        // make this at least however many pages you can see
        mPager.setOffscreenPageLimit(adapter.getCount());
        //A little space between pages
        mPager.setPageMargin(15);

//        mPager.setOnPageChangeListener(this);
//        mPager.setOnClickListener(this);
        
        //If hardware acceleration is enabled, you should also remove
        // clipping on the pager for its children.
        mPager.setClipChildren(false);
        
    }

	@Override
	public void onPageScrollStateChanged(int arg0) {
		
	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
		
	}

	@Override
	public void onPageSelected(int position) {
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}