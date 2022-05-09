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

public class MainActivityTelugu extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfigurationTelugu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_telugu);
        Toolbar toolbar_telugu = findViewById(R.id.toolbar_telugu);
        setSupportActionBar(toolbar_telugu);
        FloatingActionButton fab_telugu = findViewById(R.id.fab_telugu);
        fab_telugu.setOnClickListener(view -> Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show());
        DrawerLayout drawer_telugu = findViewById(R.id.drawer_layout_telugu);
        NavigationView navigationView_telugu = findViewById(R.id.nav_view_telugu);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfigurationTelugu = new AppBarConfiguration.Builder(
                R.id.nav_home_telugu, R.id.nav_gallery_telugu, R.id.nav_slideshow_telugu, R.id.nav_window_telugu)
                .setDrawerLayout(drawer_telugu)
                .build();
        NavController navController_telugu = Navigation.findNavController(this, R.id.nav_host_fragment_content_main_telugu);
        NavigationUI.setupActionBarWithNavController(this, navController_telugu, mAppBarConfigurationTelugu);
        NavigationUI.setupWithNavController(navigationView_telugu, navController_telugu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity_telugu, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController_telugu = Navigation.findNavController(this, R.id.nav_host_fragment_content_main_telugu);
        return NavigationUI.navigateUp(navController_telugu, mAppBarConfigurationTelugu)
                || super.onSupportNavigateUp();
    }
}