package com.example.alex.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText userInput;
    private Button   calculate;
    private TextView wordCountOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userInput = findViewById(R.id.input_text);
        calculate = findViewById(R.id.wordcount_button);
        wordCountOutput = findViewById(R.id.word_count);
    }

    public void onCalculateButtonClick(View clickView){

        String sentence = userInput.getText().toString();
        WordCount wordCount = new WordCount(sentence);
        wordCountOutput.setText("word count: " + wordCount.getWordCount());


    }

}
