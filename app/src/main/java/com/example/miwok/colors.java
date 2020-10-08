package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Objects;

public class colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true); //To show back button on toolbar

        //Create array of Words by Word type --> Word.java
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Red","weṭeṭṭi"));
        words.add(new Word("Green", "chokokki"));
        words.add(new Word("Brown", "ṭakaakki"));
        words.add(new Word("Gray", "ṭopoppi"));
        words.add(new Word("Black", "kululli"));
        words.add(new Word("White", "kelelli"));
        words.add(new Word("Dusty Yellow", "ṭopiisә"));
        words.add(new Word("Mustard Yellow", "chiwiiṭә"));

        WordAdapter colorAdapter = new WordAdapter(this, words);

        ListView colorView = findViewById(R.id.lView);

        colorView.setAdapter(colorAdapter);
    }
}