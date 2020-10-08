package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Create array of Words by Word type --> Word.java
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Mother","әṭa"));
        words.add(new Word("Father","әpa"));
        words.add(new Word("Daughter", "tune"));
        words.add(new Word("Son", "angsi"));
        words.add(new Word("Older Brother", "taachi"));
        words.add(new Word("Younger Brother", "chalitti"));
        words.add(new Word("Older Sister", "teṭe"));
        words.add(new Word("Younger Sister", "kolliti"));
        words.add(new Word("Grandmother", "ama"));
        words.add(new Word("Grandfather", "paapa"));

        WordAdapter familyAdapter = new WordAdapter(this, words);

        ListView familyView = findViewById(R.id.lView);

        familyView.setAdapter(familyAdapter);
    }
}