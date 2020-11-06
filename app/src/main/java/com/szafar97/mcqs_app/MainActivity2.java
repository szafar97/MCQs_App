 package com.szafar97.mcqs_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

 public class MainActivity2 extends AppCompatActivity {

     ArrayList<List<String>> arrayList; //It will contain MCQs along with their options
     final int maxMCQNo = 30; //Highest MCQ number in XML file
     final int totalMCQs = 10; //Total MCQs in a single quiz
     int score; //It will count the score (number of correctly attempted MCQs)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        List<Integer> randomList = new ArrayList<Integer>();

        for (int i = 1; i <= 4; i++)
            randomList.add(i);

        arrayList = new ArrayList<List<String>>();
        String []data;
        int mcqID;

        for (int i = 0; i <= 30; i++)
        {
            mcqID = this.getResources().getIdentifier("mcq"+i, "array", this.getPackageName());
            data = getResources().getStringArray(mcqID);
            arrayList.add(asList(data));
        }

        Collections.shuffle(arrayList); //It will shuffle the MCQs randomly
    }


 }