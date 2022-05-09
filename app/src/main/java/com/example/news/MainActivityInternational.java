package com.example.news;

import android.os.Bundle;
import android.view.Menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

public class MainActivityInternational extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfigurationInternational;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_international);
        Toolbar toolbar_international = findViewById(R.id.toolbar_international);
        setSupportActionBar(toolbar_international);
        FloatingActionButton fab_international = findViewById(R.id.fab_international);
        fab_international.setOnClickListener(view -> Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show());
        DrawerLayout drawer_international = findViewById(R.id.drawer_layout_international);
        NavigationView navigationView_international = findViewById(R.id.nav_view_international);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfigurationInternational = new AppBarConfiguration.Builder(
                R.id.nav_home_international, R.id.nav_gallery_international, R.id.nav_slideshow_international, R.id.nav_window_international)
                .setDrawerLayout(drawer_international)
                .build();
        NavController navController_international = Navigation.findNavController(this, R.id.nav_host_fragment_content_main_international);
        NavigationUI.setupActionBarWithNavController(this, navController_international, mAppBarConfigurationInternational);
        NavigationUI.setupWithNavController(navigationView_international, navController_international);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity_international, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController_international = Navigation.findNavController(this, R.id.nav_host_fragment_content_main_international);
        return NavigationUI.navigateUp(navController_international, mAppBarConfigurationInternational)
                || super.onSupportNavigateUp();
    }
}