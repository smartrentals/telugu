package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        

        ArrayList<Word> colors = new ArrayList<Word>();
        colors.add(new Word("red", "Aerupu"));
        colors.add(new Word("green", "Akupacha"));
        colors.add(new Word("brown", "Goduma"));
        colors.add(new Word("gray", "budida"));
        colors.add(new Word("black", "nalupu"));
        colors.add(new Word("white", "telupu"));
        colors.add(new Word("yellow", "pasupu"));
        colors.add(new Word("blue", "Nilam"));
        colors.add(new Word("orange", "Narinja"));
        colors.add(new Word("pink", "gulabi"));

        WordAdapter adapter = new WordAdapter(this, colors);
        ListView wordsListView = (ListView) findViewById(R.id.list);
        wordsListView.setAdapter(adapter);
    }
}
