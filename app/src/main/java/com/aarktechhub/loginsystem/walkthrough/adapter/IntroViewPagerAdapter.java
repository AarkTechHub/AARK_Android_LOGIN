package com.aarktechhub.loginsystem.walkthrough.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.aarktechhub.loginsystem.R;

import java.util.ArrayList;

public class IntroViewPagerAdapter extends PagerAdapter {
    ArrayList<WalkthroughItem> screenItems;
    Context context;

    public IntroViewPagerAdapter(ArrayList<WalkthroughItem> screenItems, Context context){
        this.screenItems = screenItems;
        this.context = context;
    }
    @Override
    public int getCount() {
        return screenItems.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v=inflater.inflate(R.layout.walkthru_item_layout,null);
        ImageView imageView=v.findViewById(R.id.image_name);
        TextView title=v.findViewById(R.id.title);
        TextView description=v.findViewById(R.id.desrciption);

        title.setText(screenItems.get(position).Title);
        description.setText(screenItems.get(position).Description);
        imageView.setImageResource(screenItems.get(position).img);

        container.addView(v);
        return v;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

}
