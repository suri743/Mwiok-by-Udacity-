package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the view that shows Numbers Category
        TextView numbers = findViewById(R.id.numbers);

        //Set a click listener on Numbers View
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, Numbers.class);
                startActivity(numbersIntent);
            }
        });

        //Find the view that shows Family Category
        TextView familyMembers = findViewById(R.id.family);

        //Set a click listener
        familyMembers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyMembers.class);
                startActivity(familyIntent);
            }
        });

        //Find the view that shows Colors Category
        TextView colors = findViewById(R.id.colors);

        //Set a click listener
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent familyIntent = new Intent(MainActivity.this, colors.class);
                startActivity(familyIntent);
            }
        });

        //Find the view that shows Phrases Category
        TextView phrases = findViewById(R.id.phrases);

        //Set a click listener
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent familyIntent = new Intent(MainActivity.this, Phrases.class);
                startActivity(familyIntent);
            }
        });

    }
}