package com.aarktechhub.loginsystem.walkthrough;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.aarktechhub.loginsystem.MainActivity;
import com.aarktechhub.loginsystem.R;
import com.aarktechhub.loginsystem.dashboard.DashboardActivity;
import com.aarktechhub.loginsystem.walkthrough.adapter.IntroViewPagerAdapter;
import com.aarktechhub.loginsystem.walkthrough.adapter.WalkthroughItem;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Intro_walkthrough_Activity extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tab_indicator;
    Button moveButton, getstart_button;
    int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //see the page on full screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        //getSupportActionBar().hide();
        setContentView(R.layout.activity_intro_walkthrough);
        viewPager = findViewById(R.id.pager_view);
        tab_indicator = findViewById(R.id.tab_layout);
        moveButton = findViewById(R.id.next_button);
        getstart_button = findViewById(R.id.getstart_button);

        final ArrayList<WalkthroughItem> items = new ArrayList<>();
        items.add(new WalkthroughItem("Introduction", "typesetting industry.Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown.", R.drawable.walk_thru_img1));
        items.add(new WalkthroughItem("Setup", "typesetting industry.Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown.", R.drawable.walk_thru_img2));
        items.add(new WalkthroughItem("Documentation", "typesetting industry.Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown.", R.drawable.walk_thru_img3));

        IntroViewPagerAdapter pagerAdapter = new IntroViewPagerAdapter(items, Intro_walkthrough_Activity.this);

        viewPager.setAdapter(pagerAdapter);
        tab_indicator.setupWithViewPager(viewPager);

        moveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                position = viewPager.getCurrentItem();
                if (position < items.size()) {
                    position++;
                    viewPager.setCurrentItem(position);
                }
                if (position == items.size() - 1) {

                    loadLastScreen();
                }else{
                    unloadLastScreen();
                }
            }
        });

        ///add tabselect lisener

        tab_indicator.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == items.size() - 1) {
                    loadLastScreen();
                }else{
                    unloadLastScreen();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        getstart_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intro_walkthrough_Activity.this, DashboardActivity.class));
                finish();

            }
        });

    }

    private void loadLastScreen() {
        moveButton.setVisibility(View.INVISIBLE);
        getstart_button.setVisibility(View.VISIBLE);
        //tab_indicator.setVisibility(View.INVISIBLE);
    }

    private void unloadLastScreen(){
        moveButton.setVisibility(View.VISIBLE);
        getstart_button.setVisibility(View.INVISIBLE);

    }
}
