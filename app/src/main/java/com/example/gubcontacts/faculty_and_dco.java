package com.example.gubcontacts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class faculty_and_dco extends AppCompatActivity {
    View faculty, dco, LA;
    ImageView dept_image;

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
        setContentView(R.layout.activity_faculty_and_dco);

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
                        Intent intent2 = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent2);
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
                        Intent intent10 = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent10);
                        Toast.makeText(faculty_and_dco.this, "Logged Out", Toast.LENGTH_SHORT).show();
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
        LA = findViewById(R.id.LA);
        faculty = findViewById(R.id.faculty);
        dco = findViewById(R.id.dco);
        dept_image = findViewById(R.id.dept_image);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("key");
            if(value.equals("CSE")){
                dept_image.setImageResource(R.drawable.cse);

                faculty.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String value="Faculty of CSE";
                        Intent i = new Intent(getApplicationContext(), show_data.class);
                        i.putExtra("key",value);
                        startActivity(i);
                    }
                });
                dco.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String value="Coordinators of CSE";
                        Intent i = new Intent(getApplicationContext(), show_data.class);
                        i.putExtra("key",value);
                        startActivity(i);
                    }
                });
                LA.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String value="Lab assistants of CSE";
                        Intent i = new Intent(getApplicationContext(), show_data.class);
                        i.putExtra("key",value);
                        startActivity(i);
                    }
                });
            }else if(value.equals("EEE")){
                dept_image.setImageResource(R.drawable.eee);

                faculty.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String value="Faculty of EEE";
                        Intent i = new Intent(getApplicationContext(), show_data.class);
                        i.putExtra("key",value);
                        startActivity(i);
                    }
                });
                dco.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String value="Coordinators of EEE";
                        Intent i = new Intent(getApplicationContext(), show_data.class);
                        i.putExtra("key",value);
                        startActivity(i);
                    }
                });
                LA.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String value="Lab assistants of EEE";
                        Intent i = new Intent(getApplicationContext(), show_data.class);
                        i.putExtra("key",value);
                        startActivity(i);
                    }
                });
            }else if(value.equals("TEX")){
                dept_image.setImageResource(R.drawable.tex);

                faculty.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String value="Faculty of Textile";
                        Intent i = new Intent(getApplicationContext(), show_data.class);
                        i.putExtra("key",value);
                        startActivity(i);
                    }
                });
                dco.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String value="Coordinators of Textile";
                        Intent i = new Intent(getApplicationContext(), show_data.class);
                        i.putExtra("key",value);
                        startActivity(i);
                    }
                });
                LA.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String value="Lab assistants of Textile";
                        Intent i = new Intent(getApplicationContext(), show_data.class);
                        i.putExtra("key",value);
                        startActivity(i);
                    }
                });
            }else if(value.equals("GBS")){
                dept_image.setImageResource(R.drawable.bus);

                faculty.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String value="Faculty of GBS";
                        Intent i = new Intent(getApplicationContext(), show_data.class);
                        i.putExtra("key",value);
                        startActivity(i);
                    }
                });
                dco.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String value="Coordinators of GBS";
                        Intent i = new Intent(getApplicationContext(), show_data.class);
                        i.putExtra("key",value);
                        startActivity(i);
                    }
                });
                LA.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String value="Lab assistants of GBS";
                        Intent i = new Intent(getApplicationContext(), show_data.class);
                        i.putExtra("key",value);
                        startActivity(i);
                    }
                });
            }else if(value.equals("LAW")){
                dept_image.setImageResource(R.drawable.law);

                faculty.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String value="Faculty of LAW";
                        Intent i = new Intent(getApplicationContext(), show_data.class);
                        i.putExtra("key",value);
                        startActivity(i);
                    }
                });
                dco.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String value="Coordinators of LAW";
                        Intent i = new Intent(getApplicationContext(), show_data.class);
                        i.putExtra("key",value);
                        startActivity(i);
                    }
                });
                LA.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String value="Lab assistants of LAW";
                        Intent i = new Intent(getApplicationContext(), show_data.class);
                        i.putExtra("key",value);
                        startActivity(i);
                    }
                });
            }else if(value.equals("ENG")){
                dept_image.setImageResource(R.drawable.eng);

                faculty.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String value="Faculty of English";
                        Intent i = new Intent(getApplicationContext(), show_data.class);
                        i.putExtra("key",value);
                        startActivity(i);
                    }
                });
                dco.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String value="Coordinators of English";
                        Intent i = new Intent(getApplicationContext(), show_data.class);
                        i.putExtra("key",value);
                        startActivity(i);
                    }
                });
                LA.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String value="Lab assistants of ENG";
                        Intent i = new Intent(getApplicationContext(), show_data.class);
                        i.putExtra("key",value);
                        startActivity(i);
                    }
                });
            }else if(value.equals("SOC")){
                dept_image.setImageResource(R.drawable.soc);

                faculty.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String value="Faculty of Sociology";
                        Intent i = new Intent(getApplicationContext(), show_data.class);
                        i.putExtra("key",value);
                        startActivity(i);
                    }
                });
                dco.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String value="Coordinators of Sociology";
                        Intent i = new Intent(getApplicationContext(), show_data.class);
                        i.putExtra("key",value);
                        startActivity(i);
                    }
                });
                LA.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String value="Lab assistants of SOC";
                        Intent i = new Intent(getApplicationContext(), show_data.class);
                        i.putExtra("key",value);
                        startActivity(i);
                    }
                });
            }else if(value.equals("JMC")){
                dept_image.setImageResource(R.drawable.jmc);

                faculty.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String value="Faculty of JMC";
                        Intent i = new Intent(getApplicationContext(), show_data.class);
                        i.putExtra("key",value);
                        startActivity(i);
                    }
                });
                dco.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String value="Coordinators of JMC";
                        Intent i = new Intent(getApplicationContext(), show_data.class);
                        i.putExtra("key",value);
                        startActivity(i);
                    }
                });
                LA.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String value="Lab assistants of JMC";
                        Intent i = new Intent(getApplicationContext(), show_data.class);
                        i.putExtra("key",value);
                        startActivity(i);
                    }
                });
            }


        }



    }
}