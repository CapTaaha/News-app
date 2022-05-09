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

public class MainActivityBengali extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfigurationBengali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bengali);
        Toolbar toolbar_bengali = findViewById(R.id.toolbar_bengali);
        setSupportActionBar(toolbar_bengali);
        FloatingActionButton fab_bengali = findViewById(R.id.fab_bengali);
        fab_bengali.setOnClickListener(view -> Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show());
        DrawerLayout drawer_bengali = findViewById(R.id.drawer_layout_bengali);
        NavigationView navigationView_bengali = findViewById(R.id.nav_view_bengali);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfigurationBengali = new AppBarConfiguration.Builder(
                R.id.nav_home_bengali, R.id.nav_gallery_bengali, R.id.nav_slideshow_bengali, R.id.nav_window_bengali)
                .setDrawerLayout(drawer_bengali)
                .build();
        NavController navController_bengali = Navigation.findNavController(this, R.id.nav_host_fragment_content_main_bengali);
        NavigationUI.setupActionBarWithNavController(this, navController_bengali, mAppBarConfigurationBengali);
        NavigationUI.setupWithNavController(navigationView_bengali, navController_bengali);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity_bengali, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController_bengali = Navigation.findNavController(this, R.id.nav_host_fragment_content_main_bengali);
        return NavigationUI.navigateUp(navController_bengali, mAppBarConfigurationBengali)
                || super.onSupportNavigateUp();
    }
}