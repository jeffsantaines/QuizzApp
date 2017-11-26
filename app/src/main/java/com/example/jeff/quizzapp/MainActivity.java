package com.example.jeff.quizzapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    int testScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
