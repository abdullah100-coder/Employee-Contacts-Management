package com.example.gubcontacts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class second_phase extends AppCompatActivity {

    View mgt, academics, admin, SA;
    //CONTENTS FOR NAV
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;
    Toolbar toolbar;
    NavigationView nav;
    DrawerLayout drawer_layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_phase);


        //ONLY FOR NAVIGATION MENU (START)
        drawer_layout = findViewById(R.id.drawer_layout);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_view);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_open, R.string.navigation_close);
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        nav = findViewById(R.id.navigation_view);
        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();
                switch (id){
                    case R.id.home:
                        Intent intent66 = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent66);
                        break;

                    case R.id.speed_dail:
                        Intent inte = new Intent(getApplicationContext(),speed_dail.class);
                        startActivity(inte);
                        break;
                    case R.id.search:
                        Intent inten = new Intent(getApplicationContext(),search.class);
                        startActivity(inten);
                        break;

                    case R.id.login:
                        Intent intent = new Intent(getApplicationContext(),login_activity.class);
                        startActivity(intent);
                        break;
                    case R.id.logout:
                        Toast.makeText(second_phase.this, "You are not logged in", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.help:
                        Intent inte10 = new Intent(getApplicationContext(),help.class);
                        startActivity(inte10);
                        break;
                    case R.id.about:
                        Intent inte0 = new Intent(getApplicationContext(),about_us.class);
                        startActivity(inte0);
                        break;
                }
                return true;
            }
        });
        //ONLY FOR NAVIGATION MENU (END)

        mgt = findViewById(R.id.mgt);
        admin = findViewById(R.id.admin);
        academics = findViewById(R.id.academics);
        SA = findViewById(R.id.SA);
        academics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(getApplicationContext(),academics.class);
                startActivity(intent3);
            }
        });
        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(getApplicationContext(),adminstration.class);
                startActivity(intent4);
            }
        });
        mgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value="Management";
                Intent i = new Intent(getApplicationContext(), show_data.class);
                i.putExtra("key",value);
                startActivity(i);
            }
        });
        SA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(getApplicationContext(),support_staff.class);
                startActivity(intent6);
            }
        });
    }
}