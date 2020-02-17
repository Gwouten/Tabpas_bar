package be.ehb.tabpasbar.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import be.ehb.tabpasbar.fragments.InfoFragment;
import be.ehb.tabpasbar.fragments.OrderFragment;
import be.ehb.tabpasbar.fragments.PrefFragment;

/**
 * Created by Banaan on 20/01/2038. ;)
 */
public class TabPagerAdapter extends FragmentPagerAdapter {

    private Fragment[] fragments = { InfoFragment.newInstance(), OrderFragment.newInstance(), PrefFragment.newInstance()};

    public TabPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @Override
    public int getCount() {
        return fragments.length;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0)
            return "Info";
        if(position == 1)
            return "Order";
        return "Settings";
    }
}
