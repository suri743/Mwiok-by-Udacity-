package com.example.miwok;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Objects;
/**
 * Created by Surish on 06-10-2020
 */
public class Numbers extends AppCompatActivity {

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true); //To show back button on toolbar

        //Create array of Words by Word type --> Word.java
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One","lutti"));
        words.add(new Word("two", "otiiko"));
        words.add(new Word("three", "tolookosu"));
        words.add(new Word("four", "oyyisa"));
        words.add(new Word("five", "massokka"));
        words.add(new Word("six", "temmokka"));
        words.add(new Word("seven", "kenekaku"));
        words.add(new Word("eight", "kawinta"));
        words.add(new Word("nine", "wo’e"));
        words.add(new Word("ten", "na’aacha"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView lView = findViewById(R.id.lView);

        lView.setAdapter(adapter);
    }
}