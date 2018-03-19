package com.example.alex.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Alex on 19/03/2018.
 */

public class WordCountTest {
    WordCount wordCount;

    @Before
    public void before() {
        String string = "Down the rabbit hole";
        wordCount = new WordCount(string);
    }

    @Test
    public void canGetWordCount() {
        assertEquals(4, wordCount.getWordCount());
    }


}
