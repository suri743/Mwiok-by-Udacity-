package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Create array of Words by Word type --> Word.java
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?","minto wuksus"));
        words.add(new Word("What is your name?","tinnә oyaase'nә"));
        words.add(new Word("My name is...", "oyaaset..."));
        words.add(new Word("How are you feeling?", "michәksәs?"));
        words.add(new Word("I’m feeling good.", "kuchi achit"));
        words.add(new Word("Are you coming?", "әәnәs'aa?"));
        words.add(new Word("Yes, I’m coming.", "hәә’ әәnәm"));
        words.add(new Word("I’m coming.", "әәnәm"));
        words.add(new Word("Lets go.", "yoowutis"));
        words.add(new Word("Come here.", "әnni'nem"));

        WordAdapter phraseAdapter = new WordAdapter(this, words);

        ListView phrasesView = findViewById(R.id.lView);

        phrasesView.setAdapter(phraseAdapter);
    }
}