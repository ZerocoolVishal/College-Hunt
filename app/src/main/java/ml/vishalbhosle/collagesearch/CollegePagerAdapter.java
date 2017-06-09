package ml.vishalbhosle.collagesearch;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import layout.CollegeFragment;
import layout.SearchFragment;

/**
 * Created by vishal on 16/1/17.
 */

public class CollegePagerAdapter extends FragmentPagerAdapter {

    CollegePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new CollegeFragment();
            case 1:
                return new  SearchFragment();
        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return  "Explore";
            case 1:
                return "Search";
        }
        return null;
    }
}
