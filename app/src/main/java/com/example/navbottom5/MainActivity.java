package com.example.navbottom5;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNav;
    FragmentManager manager;

  ImageView imghome,imgAccountLeft,imgSetting,imgAccountRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        imghome = findViewById(R.id.img_home);
//        imgAccountLeft= findViewById(R.id.img_accountLeft);
//        imgSetting = findViewById(R.id.img_setting);
//        imgAccountRight = findViewById(R.id.img_accountRight);



        bottomNav = findViewById(R.id.bottom_nav);
        manager = getSupportFragmentManager();


        //set as default
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout, new Fragment1())
                .commit();
//        imghome.setVisibility(View.VISIBLE);
//        imgSetting.setVisibility(View.GONE);
//        imgAccountLeft.setVisibility(View.GONE);
//        imgAccountRight.setVisibility(View.GONE);





//        bottomNav.setSelectedItemId(R.id.item_1);
        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {

                    case R.id.item_1:
                        manager.beginTransaction().replace(R.id.frame_layout, new Fragment1()).commit();
//                        imghome.setVisibility(View.VISIBLE);
//                        imgSetting.setVisibility(View.GONE);
//                        imgAccountLeft.setVisibility(View.GONE);
//                        imgAccountRight.setVisibility(View.GONE);
                        return true;

                    case R.id.item_2:
                        manager.beginTransaction().replace(R.id.frame_layout, new Fragment2()).commit();
//                        imghome.setVisibility(View.GONE);
//                        imgSetting.setVisibility(View.VISIBLE);
//                        imgAccountLeft.setVisibility(View.GONE);
//                        imgAccountRight.setVisibility(View.GONE);
                        return true;

                    case R.id.item_3:
                        manager.beginTransaction().replace(R.id.frame_layout, new Fragment1()).commit();
//                        imghome.setVisibility(View.GONE);
//                        imgSetting.setVisibility(View.GONE);
//                        imgAccountLeft.setVisibility(View.VISIBLE);
//                        imgAccountRight.setVisibility(View.GONE);
                        return true;

                    case R.id.item_4:
                        manager.beginTransaction().replace(R.id.frame_layout, new Fragment2()).commit();
//                        imghome.setVisibility(View.GONE);
//                        imgSetting.setVisibility(View.GONE);
//                        imgAccountLeft.setVisibility(View.GONE);
//                        imgAccountRight.setVisibility(View.VISIBLE);
                        return true;

                }

                return false;
            }
        });

    }

}
