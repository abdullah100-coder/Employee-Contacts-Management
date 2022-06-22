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
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class add_info extends AppCompatActivity{
    EditText name, pnumber, designation, email;
    Spinner spinner, spinner2, spinner3;
    TextView save;

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
        setContentView(R.layout.activity_add_info);

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
                        Toast.makeText(add_info.this, "Logged Out", Toast.LENGTH_SHORT).show();
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


        name = findViewById(R.id.name);
        save = findViewById(R.id.save);
        spinner = findViewById(R.id.spinner5);
        spinner2 = findViewById(R.id.spinner2);
        spinner3= findViewById(R.id.spinner3);
        designation = findViewById(R.id.fc);
        pnumber = findViewById(R.id.pnumber);
        email = findViewById(R.id.email);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.category_name, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.Department_name, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this, R.array.Campus_name, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter4);


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = spinner3.getSelectedItem().toString();
                name.setText(text);
            }
        });

    }


}