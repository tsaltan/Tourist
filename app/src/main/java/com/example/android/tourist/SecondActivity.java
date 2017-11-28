package com.example.android.tourist;

import android.os.PersistableBundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    public int currentTab;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*
         * check if savedinstance state is null
         */
        if (savedInstanceState != null) {
            currentTab = savedInstanceState.getInt("selected_tab");
            String message = savedInstanceState.getString("message");
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        } else {
            currentTab =0;
        }

        // Set the content of the activity to use the activity_second.xml layout file
        setContentView(R.layout.activity_second);

        // Find the view pager that will allow the user to swipe between fragments
        viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);


        tabLayout.setupWithViewPager(viewPager);
        viewPager.setCurrentItem(currentTab);

    }


    // override saved instance to keep selected tab
    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        outState.putInt("selected_tab", viewPager.getCurrentItem());
        outState.putString("message", "This is my message to be reloaded");
        super.onSaveInstanceState(outState, outPersistentState);
    }
}


