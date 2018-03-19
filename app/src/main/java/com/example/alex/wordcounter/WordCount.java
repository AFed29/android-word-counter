package com.example.alex.wordcounter;

import java.util.ArrayList;

/**
 * Created by Alex on 19/03/2018.
 */

public class WordCount {
    String string;

    public WordCount(String string) {
        this.string = string;
    }

    public int getWordCount() {
//        ArrayList<String> words = new ArrayList<>();
        String[] words = string.split(" ");
        return words.length;

    }
}
