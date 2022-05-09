package com.example.news;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Languages extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_languages);
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener((View.OnClickListener) this); // calling onClick() method
        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener((View.OnClickListener) this);
        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener((View.OnClickListener) this);
        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener((View.OnClickListener) this);
        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener((View.OnClickListener) this);
    }



    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:
                // do your code
                Toast.makeText(this, "You pressed English", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, MainActivityEnglish.class);
                startActivity(intent);
                break;
            case R.id.button3:
                // do your code
                Toast.makeText(this, "You pressed Hindi", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(this, MainActivityHindi.class);
                startActivity(intent1);
                break;
            case R.id.button4:
                // do your code
                Toast.makeText(this, "You pressed Bengali", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(this, MainActivityBengali.class);
                startActivity(intent2);
                break;
            case R.id.button5:
                // do your code
                Toast.makeText(this, "You pressed Telugu", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(this, MainActivityTelugu.class);
                startActivity(intent3);
                break;
            case R.id.button6:
                // do your code
                Toast.makeText(this, "You pressed International", Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(this, MainActivityInternational.class);
                startActivity(intent4);
                break;
            default:
                break;
        }
    }
}

