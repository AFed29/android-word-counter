package com.example.alex.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Alex on 19/03/2018.
 */

public class WordCountTest {
    WordCount wordCount;
    String string;

    @Before
    public void before() {
        string = "Down the rabbit hole";
        wordCount = new WordCount(string);
    }

    @Test
    public void canGetWordCount() {
        assertEquals(4, wordCount.getWordCount());
    }

    @Test
    public void canGetWordCountDoubleSpaces() {
        string = "Down  the  deeper rabbit hole";
        wordCount = new WordCount(string);
        assertEquals(5, wordCount.getWordCount());
    }

    @Test
    public void canGetWordCountSpecialCharacters() {
        string = "Down the even   deeper rabbit hole ...";
        wordCount = new WordCount(string);
        assertEquals(6, wordCount.getWordCount());
    }

    @Test
    public void canSanatize() {
        string = "Down the even...   deeper, rabbit hole ...";
        wordCount = new WordCount(string);
        wordCount.sanitise();
        assertEquals("Down the even   deeper rabbit hole ", wordCount.getString());
    }

    @Test
    public void canGetIndividualWordCounts() {
        string = "Down the great deep rabbit hole that the great rabbit lives in. This rabbit is huge!";
        wordCount = new WordCount(string);
        String expectedResult = "rabbit : 3, the : 2, great : 2, down : 1, deep : 1, hole : 1, that : 1, lives : 1, in : 1, this : 1, is : 1, huge : 1";
        assertEquals(expectedResult, wordCount.getIndividualWordCount());
    }

}
