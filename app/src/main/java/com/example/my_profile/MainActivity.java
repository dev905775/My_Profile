package com.example.my_profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.my_profile.menu.menu;

public class MainActivity extends AppCompatActivity {


//  my start .............


    LinearLayout btn, btnn, btnnn, btnnnn;

    ImageView menu;


// my end ...................

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// my start ...................



        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, profile.class);

                startActivity(intent);

            }
        });



        btnn = findViewById(R.id.btnn);

        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, profile.class);

                startActivity(intent);

            }
        });



        btnnn = findViewById(R.id.btnnn);

        btnnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, profile.class);

                startActivity(intent);

            }
        });



        btnnnn = findViewById(R.id.btnnnn);

        btnnnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, profile.class);

                startActivity(intent);

            }
        });


       // .................

        menu = findViewById(R.id.menu);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.my_profile.menu.menu.class);
                startActivity(intent  );

            }
        });


//  my end ..........................



    }
}