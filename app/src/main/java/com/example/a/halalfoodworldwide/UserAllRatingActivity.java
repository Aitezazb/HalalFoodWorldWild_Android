package com.example.a.halalfoodworldwide;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.a.halalfoodworldwide.Helper.RatingItemAdapter;
import com.example.a.halalfoodworldwide.Models._User;

public class UserAllRatingActivity extends AppCompatActivity {

    private ListView ratingListView;
    private BottomNavigationView bottomNavigationView;
    String restaurantName[] = {"My burger","Burger king","fucking burger"};
    String rating[] = {"1.2","1.1","3.3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_all_rating);

        //Getting references
        ratingListView = (ListView) findViewById(R.id.RatingListView);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomMenu);

        //Adding click listener
        bottomNavigationView.setOnNavigationItemSelectedListener(nav_Listener);

        //Adding selected default item
        bottomNavigationView.setSelectedItemId(R.id.nav_Ratings);


        RatingItemAdapter ratingItemAdapter = new RatingItemAdapter(this,restaurantName,rating);

        ratingListView.setAdapter(ratingItemAdapter);

        ratingListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Item Clicked",Toast.LENGTH_LONG).show();
            }
        });
    }

    //bottom Navigation Onclick method
    private BottomNavigationView.OnNavigationItemSelectedListener nav_Listener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            switch (menuItem.getItemId()){
                case R.id.nav_home:{
                    Intent mainActivity  =  new Intent(UserAllRatingActivity.this,MainActivity.class);
                    startActivity(mainActivity);
                    finish();
                    break;
                }
                case R.id.nav_Ratings:{
                    break;
                }
                case R.id.nav_tag:{
                    break;
                }
                case R.id.nav_setting :{
                    break;
                }
            }
            return true;
        }
    };
}
