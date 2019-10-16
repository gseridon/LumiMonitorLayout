package com.n01281453.lumimonitorlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    // Button Declarations
    ImageButton lightButton;
    ImageButton musicButton;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        findAllViews();
        configureLightsButton();
        configureMusicButton();
        backMainMenu();

    }

    private void findAllViews() {
        lightButton = findViewById(R.id.LightButton);
        musicButton = findViewById(R.id.MusicButton);
        backButton = findViewById(R.id.BackButton);
    }

    private void configureLightsButton() {
        lightButton.setOnClickListener(new View.OnClickListener () {

            @Override
            public void onClick(View v) {
                Intent lightIntent = new Intent(MainActivity.this, LightActivity.class);
                startActivity(lightIntent);
            }
        });
    }

    private void configureMusicButton() {
        musicButton.setOnClickListener(new View.OnClickListener () {

            @Override
            public void onClick(View v) {
                Intent musicIntent = new Intent(MainActivity.this, MusicActivity.class);
                startActivity(musicIntent);
            }
        });
    }

    private void backMainMenu() {
        backButton.setOnClickListener(new View.OnClickListener () {

            @Override
            public void onClick(View v) {
                Intent menuIntent = new Intent(MainActivity.this, MainMenuActivity.class);
                startActivity(menuIntent);
            }
        });
    }

}
