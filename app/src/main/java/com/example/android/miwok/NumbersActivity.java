package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "okkati"));
        words.add(new Word("two", "rendu"));
        words.add(new Word("three", "moodu"));
        words.add(new Word("four", "naalugu"));
        words.add(new Word("five", "aidhu"));
        words.add(new Word("six", "aaru"));
        words.add(new Word("seven", "aedu"));
        words.add(new Word("eight", "aenimidhi"));
        words.add(new Word("nine", "thomidi"));
        words.add(new Word("ten", "padhi"));

        Log.i("NumbersActivity", "word at index[2]" + words.get(2));
        Log.i("NumbersActivity", "size of words" + words.size());

//        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, R.layout.simple_list_item_1, words); //for one textview
        WordAdapter adapter = new WordAdapter(this, words);
        ListView numbersListView = (ListView) findViewById(R.id.list);
        numbersListView.setAdapter(adapter);
/*
* How to add views to layout from java*/
//        LinearLayout rootView = (LinearLayout) findViewById(R.id.numbersRootView);
//        for (int index =0; index <words.size(); index++){
//            TextView wordView = new TextView(this);
//            rootView.addView(wordView);
//            wordView.setText(words.get(index));
//        }
    }


}
