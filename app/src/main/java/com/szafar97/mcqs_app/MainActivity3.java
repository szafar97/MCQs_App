package com.szafar97.mcqs_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView text;
    int score;
    int totalMCQs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent = getIntent();
        score = intent.getIntExtra("score", 0);
        totalMCQs = intent.getIntExtra("total", 0);

        text = findViewById(R.id.score);
        text.setText(String.valueOf(score));

        String remarks = "";

        if (score > 0)
            remarks = "You have answered " + score + " MCQs correctly out of " + totalMCQs + " MCQs ";
        else
            remarks = "You haven't answer any MCQ correctly out of " + totalMCQs + " MCQs.";

        text = findViewById(R.id.remarks);
        text.setText(remarks);
    }

    public void Start_Again(View view)
    {
        finish();
        return;
    }
}