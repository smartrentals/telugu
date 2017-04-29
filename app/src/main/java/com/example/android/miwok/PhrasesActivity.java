package com.example.android.miwok;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import com.example.android.miwok.R;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> phrases = new ArrayList<Word>();
        phrases.add(new Word("Where are you going?", "Ekkadiki velthunav"));
        phrases.add(new Word("What is your name?", "Mee perenti?"));
        phrases.add(new Word("My name is..", "Na peru.."));
        phrases.add(new Word("How are you?", "Ella unnaru"));
        phrases.add(new Word("I'm doing good.", "Nenu baagunanu"));
        phrases.add(new Word("Are you coming?", "Meeru vasthunara"));
        phrases.add(new Word("Yes, I'm coming", "Avunu Vasthunanu"));
        phrases.add(new Word("Not coming", "Ravatamledhu"));
        phrases.add(new Word("Hi", "Namasthe"));
        phrases.add(new Word("Thank you", "Dhanya-vaadhamu"));

        WordAdapter adapter = new WordAdapter(this, phrases);
        ListView wordsListView = (ListView) findViewById(R.id.list);
        wordsListView.setAdapter(adapter);
    }

}
