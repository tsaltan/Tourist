package com.example.android.tourist;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

    /**
     * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
     * each list item based on a data source which is a list of {@link Attraction} objects.
     */
    public class CategoryAdapter extends FragmentPagerAdapter {
        private Context mContext;


        /**
         * Create a new {@link CategoryAdapter} object.
         *
         * @param fm is the fragment manager that will keep each fragment's state in the adapter
         *           across swipes.
         */
        public CategoryAdapter(Context context, FragmentManager fm) {
            super(fm);
            mContext = context;
        }

        /**
         * Return the {@link Fragment} that should be displayed for the given page number.
         */
        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return new DrinkFragment();
            } else if (position == 1) {
                return new FoodFragment();
            } else  {
                return new SeeFragment();
            }
        }

        /**
         * Return the total number of pages.
         */
        @Override
        public int getCount() {
            return 3;
        }

        // Display title

        @Override
        public CharSequence getPageTitle(int position) {
            if (position == 0) {
                return mContext.getString(R.string.category_drink);
            } else if (position == 1) {
                return mContext.getString(R.string.category_food);
            } else {
                return mContext.getString(R.string.category_see);
            }
        }


    }

