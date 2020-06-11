package com.example.whatsappclone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    ViewPager vp;
    TabLayout tl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vp = findViewById(R.id.pager);
        vp.setAdapter(new MyAdapter(getSupportFragmentManager()));

        tl=findViewById(R.id.tab);
        tl.setupWithViewPager(vp);
        tl.getTabAt(0).setIcon(R.drawable.ic_chat_black_24dp);
        tl.getTabAt(1).setIcon(R.drawable.ic_camera_alt_black_24dp);
        tl.getTabAt(2).setIcon(R.drawable.ic_call_black_24dp);
    }
    class MyAdapter extends FragmentStatePagerAdapter{


        public MyAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:return new Chats();
                case 1:return new Status();
                case 2:return new Calls();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }

        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Chats";
                case 1:
                    return "status";
                case 2:
                    return "Calls";
            }
            return super.getPageTitle(position);
        }
    }

}
