package com.nefu.order_system;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MenuActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        drawerLayout=findViewById(R.id.drawer_layout);
        navigationView=findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(MenuActivity.this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.nav_lu:
                Intent intent=new Intent(MenuActivity.this,ListActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_chuan:
                Intent intent1=new Intent(MenuActivity.this,ListActivity.class);
                startActivity(intent1);
                break;
            case R.id.nav_menu:
                Intent intent2=new Intent(MenuActivity.this,PayActivity.class);
                startActivity(intent2);
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

}
