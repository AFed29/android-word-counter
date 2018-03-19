package com.example.alex.wordcounter;

import android.annotation.TargetApi;

import java.util.HashMap;

/**
 * Created by Alex on 19/03/2018.
 */

public class WordCount {
    String string;

    public WordCount(String string) {
        this.string = string;
    }

    public void sanitise() {
        string = string.replaceAll("[^a-zA-Z\\s]","");
        string = string.toLowerCase();
    }

    public String[] getArrayOfWords() {
        return string.split("\\s+");
    }

    public int getWordCount() {
        sanitise();
        return getArrayOfWords().length;
    }

    public String getString() {
        return string;
    }

    public String getIndividualWordCount() {
        HashMap<String, Integer> individualWordCounts = new HashMap<>();
        sanitise();
        String[] words = getArrayOfWords();
        for (String word : words) {
            if (individualWordCounts.containsKey(word)) {
                Integer value = individualWordCounts.get(word);
                value ++;
                individualWordCounts.put(word, value);
            } else {
                individualWordCounts.put(word, 1);
            }
        }
        StringBuilder result = new StringBuilder();
        for (String word : individualWordCounts.keySet()) {
            if (result.length() != 0) {
                result.append(", ");
            }
            result.append(word).append(" : ").append(individualWordCounts.get(word));
        }
        return result.toString();
    }
}
