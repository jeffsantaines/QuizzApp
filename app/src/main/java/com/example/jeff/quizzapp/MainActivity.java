package com.example.jeff.quizzapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<QuestionAnswer> questionAnswers = new ArrayList<>();

    QuestionAnswer questionAnswer1 = new QuestionAnswer("What type of roof is this?", "Hip");
    QuestionAnswer questionAnswer2 = new QuestionAnswer("What is the minimum pitch for most high rib profile roof?", "3");
    QuestionAnswer questionAnswer3 = new QuestionAnswer("Select the part of the roof that is highlighted in the drawing below", "eaves");
    QuestionAnswer questionAnswer4 = new QuestionAnswer("The recommended minimum pitch for Corrugate longrun roofing is?", "8 degrees");
    QuestionAnswer questionAnswer5 = new QuestionAnswer("Wind Zone is a factor to consider in roof construction.", "True");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionAnswers.add(questionAnswer1);
        questionAnswers.add(questionAnswer2);
        questionAnswers.add(questionAnswer3);
        questionAnswers.add(questionAnswer4);
        questionAnswers.add(questionAnswer5);

        for (QuestionAnswer s : questionAnswers)
            Log.v("Questionaire", s.getQuestion().toString() + " : " + s.getAnswer().toString() );
    }

    public void onRadioButtonClicked(View view) {
        //TODO
    }
}
