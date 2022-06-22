package com.example.gubcontacts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class academics extends AppCompatActivity {
    DBhelper DB;

    View cse, eee, tex, bus, law, eng, soc, jmc;

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
        setContentView(R.layout.activity_academics);

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
                        Toast.makeText(academics.this, "You are not logged in", Toast.LENGTH_SHORT).show();
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

        cse = findViewById(R.id.cse);
        eee = findViewById(R.id.eee);
        tex = findViewById(R.id.tex);
        bus = findViewById(R.id.bus);
        law = findViewById(R.id.law);
        eng = findViewById(R.id.eng);
        soc = findViewById(R.id.soc);
        jmc = findViewById(R.id.jmc);

        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value="CSE";
                Intent i = new Intent(getApplicationContext(), faculty_and_dco.class);
                i.putExtra("key",value);
                startActivity(i);
            }
        });
        eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value="EEE";
                Intent i = new Intent(getApplicationContext(), faculty_and_dco.class);
                i.putExtra("key",value);
                startActivity(i);
            }
        });
        tex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value="TEX";
                Intent i = new Intent(getApplicationContext(), faculty_and_dco.class);
                i.putExtra("key",value);
                startActivity(i);
            }
        });
        bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value="GBS";
                Intent i = new Intent(getApplicationContext(), faculty_and_dco.class);
                i.putExtra("key",value);
                startActivity(i);
            }
        });
        law.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value="LAW";
                Intent i = new Intent(getApplicationContext(), faculty_and_dco.class);
                i.putExtra("key",value);
                startActivity(i);
            }
        });
        eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value="ENG";
                Intent i = new Intent(getApplicationContext(), faculty_and_dco.class);
                i.putExtra("key",value);
                startActivity(i);
            }
        });
        soc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value="SOC";
                Intent i = new Intent(getApplicationContext(), faculty_and_dco.class);
                i.putExtra("key",value);
                startActivity(i);
            }
        });
        jmc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value="JMC";
                Intent i = new Intent(getApplicationContext(), faculty_and_dco.class);
                i.putExtra("key",value);
                startActivity(i);
            }
        });


    }
}