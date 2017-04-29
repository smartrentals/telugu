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

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> family = new ArrayList<Word>();
        family.add(new Word("mother", "Amma"));
        family.add(new Word("father", "Naana"));
        family.add(new Word("daughter", "Kuthuru"));
        family.add(new Word("son", "koduku"));
        family.add(new Word("older brother", "Anna"));
        family.add(new Word("younger brother", "Tammudu"));
        family.add(new Word("older sister", "Akka"));
        family.add(new Word("younger sister", "Chelli"));
        family.add(new Word("grand father", "Tathaya"));
        family.add(new Word("grand mother", "Naanamma"));

        WordAdapter adapter = new WordAdapter(this, family);
        ListView wordsListView = (ListView) findViewById(R.id.list);
        wordsListView.setAdapter(adapter);
        
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

}
