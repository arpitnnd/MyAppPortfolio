package com.arpitnnd.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonOnClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                Toast.makeText(MainActivity.this, "This will launch Spotify Streamer!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button2:
                Toast.makeText(MainActivity.this, "This will launch Super Duo!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button3:
                Toast.makeText(MainActivity.this, "This will launch Build It Bigger!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button4:
                Toast.makeText(MainActivity.this, "This will launch XYZ Reader!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button5:
                Toast.makeText(MainActivity.this, "This will launch My Capstone Project!", Toast.LENGTH_SHORT).show();
                break;
        }

    }

}
