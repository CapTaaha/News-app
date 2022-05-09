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

public class MainActivityHindi extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfigurationHindi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_hindi);
        Toolbar toolbar_hindi = findViewById(R.id.toolbar_hindi);
        setSupportActionBar(toolbar_hindi);
        FloatingActionButton fab_hindi = findViewById(R.id.fab_hindi);
        fab_hindi.setOnClickListener(view -> Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show());
        DrawerLayout drawer_hindi = findViewById(R.id.drawer_layout_hindi);
        NavigationView navigationView_hindi = findViewById(R.id.nav_view_hindi);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfigurationHindi = new AppBarConfiguration.Builder(
                R.id.nav_home_hindi, R.id.nav_gallery_hindi, R.id.nav_slideshow_hindi, R.id.nav_window_hindi)
                .setDrawerLayout(drawer_hindi)
                .build();
        NavController navController_hindi = Navigation.findNavController(this, R.id.nav_host_fragment_content_main_hindi);
        NavigationUI.setupActionBarWithNavController(this, navController_hindi, mAppBarConfigurationHindi);
        NavigationUI.setupWithNavController(navigationView_hindi, navController_hindi);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity_hindi, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController_hindi = Navigation.findNavController(this, R.id.nav_host_fragment_content_main_hindi);
        return NavigationUI.navigateUp(navController_hindi, mAppBarConfigurationHindi)
                || super.onSupportNavigateUp();
    }
}