package com.example.majoractivity1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager2 viewPager = findViewById(R.id.view_pager);
        TabLayout tabLayout = findViewById(R.id.tab_layout);

        ViewPagerAdapter adapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(adapter);

        new TabLayoutMediator(tabLayout, viewPager,
                (tab, position) -> {
                    switch (position) {
                        case 0:
                            tab.setIcon(R.drawable.ic_home);
                            break;
                        case 1:
                            tab.setIcon(R.drawable.ic_notifications);
                            break;
                        case 2:
                            tab.setIcon(R.drawable.ic_video);
                            break;
                        case 3:
                            tab.setIcon(R.drawable.ic_marketplace);
                            break;
                        case 4:
                            tab.setIcon(R.drawable.ic_gaming);
                            break;
                        case 5:
                            tab.setIcon(R.drawable.ic_menu);
                            break;
                    }
                    tab.setText(null);
                }).attach();
    }
}
