package com.example.majoractivity1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new NewsFeedFragment();
            case 1:
                return new NotificationFragment();
            case 2:
                return new VideoFragment();
            case 3:
                return new MarketplaceFragment();
            case 4:
                return new GamingFragment();
            case 5:
                return new MenuFragment();
            default:
                return new NewsFeedFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
