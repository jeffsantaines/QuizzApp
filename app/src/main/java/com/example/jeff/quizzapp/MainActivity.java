package com.example.jeff.quizzapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // for future use only!
  /*  ArrayList<QuestionAnswer> questionAnswers = new ArrayList<>();

    QuestionAnswer questionAnswer1 = new QuestionAnswer("What type of roof is this?", "Hip");
    QuestionAnswer questionAnswer2 = new QuestionAnswer("What is the minimum pitch for most high rib profile roof?", "3");
    QuestionAnswer questionAnswer3 = new QuestionAnswer("Select the part of the roof that is highlighted in the drawing below", "eaves");
    QuestionAnswer questionAnswer4 = new QuestionAnswer("The recommended minimum pitch for Corrugate longrun roofing is?", "8 degrees");
    QuestionAnswer questionAnswer5 = new QuestionAnswer("Wind Zone is a factor to consider in roof construction.", "True");*/

    int testScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//for future use only!
/*      questionAnswers.add(questionAnswer1);
        questionAnswers.add(questionAnswer2);
        questionAnswers.add(questionAnswer3);
        questionAnswers.add(questionAnswer4);
        questionAnswers.add(questionAnswer5);

        for (QuestionAnswer s : questionAnswers)
            Log.v("Questionaire", s.getQuestion().toString() + " : " + s.getAnswer().toString() );*/
    }

    public void onSubmitButton1Clicked(View view) {
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.question1_rb2);
        if (radioButton2.isChecked()) {
            testScore = testScore + 1;
            Toast.makeText(this, "Your answer is CORRECT! Score: " + testScore + "/4", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "Your answer is WRONG! Score: " + testScore + "/4", Toast.LENGTH_SHORT).show();
        }

    }

    public void onSubmitButton2Clicked(View view) {

        EditText edit = findViewById(R.id.editTextAnswer2);
        String result = edit.getText().toString();

        if (result.equals("3")) {
            testScore = testScore + 1;
            Toast.makeText(this, "Your answer is CORRECT! Score: " + testScore + "/4", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Your answer is WRONG! Score: " + testScore + "/4", Toast.LENGTH_SHORT).show();
        }
    }

    public void onSubmitButton3Clicked(View view) {
        CheckBox checkbox_DD400 = findViewById(R.id.checkbox_dd400);
        CheckBox checkbox_Kliplock = findViewById(R.id.checkbox_kliplock);
        CheckBox checkbox_Trimdek = findViewById(R.id.checkbox_trimdek);

        if (checkbox_DD400.isChecked() && checkbox_Kliplock.isChecked() && !(checkbox_Trimdek.isChecked())) {
            testScore = testScore + 1;
            Toast.makeText(this, "Your answer is CORRECT! Score: " + testScore + "/4", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Your answer is WRONG! Score: " + testScore + "/4", Toast.LENGTH_SHORT).show();
        }
    }

    public void onSubmitButton4Clicked(View view) {
        RadioButton radioButton_true = (RadioButton) findViewById(R.id.question4_rb1);
        if (radioButton_true.isChecked()) {
            testScore = testScore + 1;
            Toast.makeText(this, "Your answer is CORRECT! Score: " + testScore + "/4", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "Your answer is WRONG! Score: " + testScore + "/4", Toast.LENGTH_SHORT).show();
        }

    }

}
