package com.example.bundleactivity;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class ImageAdapter extends PagerAdapter {

    Context mcontext;
    ImageAdapter(Context context)
    {
        this.mcontext=context;
    }

    private int[] sliderImageId = new int[]{
            R.drawable.p, R.drawable.pr, R.drawable.pro,
    };

    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(mcontext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(sliderImageId[position]);
        ((ViewPager) container).addView(imageView, 0);
        return imageView;
    }

    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((ImageView) object);
    }

    @Override
    public int getCount() {
        return sliderImageId.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == ((ImageView) object);
    }
}
