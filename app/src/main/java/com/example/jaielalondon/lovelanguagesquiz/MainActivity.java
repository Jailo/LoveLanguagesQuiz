package com.example.jaielalondon.lovelanguagesquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    //Keeps count of what question the user is on
    int currentQuestionCount = 1;

    //Scores for each type of love language
    int wordsOfAffirmationScore = 0;
    int qualityTimeScore = 0;
    int receivingGiftsScore = 0;
    int actsOfServiceScore = 0;
    int physicalTouchScore = 0;

    TextView questionText;
    RadioGroup radioGroup;
    RadioButton radioButton;
    RadioButton wordsOfAffirmationRadioBtn;
    RadioButton qualityTimeRadioBtn;
    RadioButton receivingGiftsRadioBtn;
    RadioButton actsOfServiceRadioBtn;
    RadioButton physicalTouchRadioBtn;
    Button submitButton;
    TextView questionCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionText = findViewById(R.id.textView);
        radioGroup = findViewById(R.id.radioGroup);
        submitButton = findViewById(R.id.submit);
        questionCounter = findViewById(R.id.questionsCounter);

        //Resources for all the love languages radio buttons
        wordsOfAffirmationRadioBtn = findViewById(R.id.wordsOfAffirmation);
        qualityTimeRadioBtn = findViewById(R.id.qualityTime);
        receivingGiftsRadioBtn = findViewById(R.id.receivingGifts);
        actsOfServiceRadioBtn = findViewById(R.id.actsOfService);
        physicalTouchRadioBtn = findViewById(R.id.physicalTouch);


    }

    //calculate score results
    public void results(View v) {

        //gets the id of the radio button that the user chose
        int radioId = radioGroup.getCheckedRadioButtonId();
        //Creates resource for the radio button the user chose
        radioButton = findViewById(radioId);

        if (radioId == -1) {
            Toast.makeText(this, "Please select an answer", Toast.LENGTH_SHORT).show();
        } else {
        /*
         *  checks which of the love language answers the user checked
         *  and adds one point to that languages score
         */
            if (radioButton.isChecked() && wordsOfAffirmationRadioBtn.isChecked()) {
                wordsOfAffirmationScore = wordsOfAffirmationScore + 1;
            } else if (qualityTimeRadioBtn.isChecked() && radioButton.isChecked()) {
                qualityTimeScore += 1;
            } else if (radioButton.isChecked() && receivingGiftsRadioBtn.isChecked()) {
                receivingGiftsScore += 1;
            } else if (radioButton.isChecked() && actsOfServiceRadioBtn.isChecked()) {
                actsOfServiceScore += 1;
            } else if (radioButton.isChecked() && physicalTouchRadioBtn.isChecked()) {
                physicalTouchScore += 1;
            }
            currentQuestionCount = currentQuestionCount + 1;
            questionCounter.setText(currentQuestionCount + "/10");

            nextQuestion();
        }
    }

    //Changes question and answer text to the next question
    public void nextQuestion() {
        //Changes the all text on screen depending on what question the user is on
        if (currentQuestionCount == 2) {
            //Set Question label and answers text to question 2
            questionText.setText(R.string.question2);
            wordsOfAffirmationRadioBtn.setText(R.string.words_of_affirmation_q2);
            qualityTimeRadioBtn.setText(R.string.quality_time_q2);
            physicalTouchRadioBtn.setText(R.string.physical_touch_q2);
            receivingGiftsRadioBtn.setText(R.string.receiving_gifts_q2);
            actsOfServiceRadioBtn.setText(R.string.acts_of_service_q2);
            radioGroup.clearCheck();

        } else if (currentQuestionCount == 3) {
            //Set Question label and answers text to question 3
            questionText.setText(R.string.question3);
            wordsOfAffirmationRadioBtn.setText(R.string.words_of_affirmation_q3);
            qualityTimeRadioBtn.setText(R.string.quality_time_q3);
            physicalTouchRadioBtn.setText(R.string.physical_touch_q3);
            receivingGiftsRadioBtn.setText(R.string.receiving_gifts_q3);
            actsOfServiceRadioBtn.setText(R.string.acts_of_service_q3);
            radioGroup.clearCheck();

        } else if (currentQuestionCount == 4) {
            //Set Question label and answers text to question 4
            questionText.setText(R.string.question4);
            wordsOfAffirmationRadioBtn.setText(R.string.words_of_affirmation_q4);
            qualityTimeRadioBtn.setText(R.string.quality_time_q4);
            physicalTouchRadioBtn.setText(R.string.physical_touch_q4);
            receivingGiftsRadioBtn.setText(R.string.receiving_gifts_q4);
            actsOfServiceRadioBtn.setText(R.string.acts_of_service_q4);
            radioGroup.clearCheck();

        } else if (currentQuestionCount == 5) {
            //Set Question label and answers text to question 5
            questionText.setText(R.string.question5);
            wordsOfAffirmationRadioBtn.setText(R.string.words_of_affirmation_q5);
            qualityTimeRadioBtn.setText(R.string.quality_time_q5);
            physicalTouchRadioBtn.setText(R.string.physical_touch_q5);
            receivingGiftsRadioBtn.setText(R.string.receiving_gifts_q5);
            actsOfServiceRadioBtn.setText(R.string.acts_of_service_q5);
            radioGroup.clearCheck();

        } else if (currentQuestionCount == 6) {
            //Set Question label and answers text to question 6
            questionText.setText(R.string.question6);
            wordsOfAffirmationRadioBtn.setText(R.string.words_of_affirmation_q6);
            qualityTimeRadioBtn.setText(R.string.quality_time_q6);
            physicalTouchRadioBtn.setText(R.string.physical_touch_q6);
            receivingGiftsRadioBtn.setText(R.string.receiving_gifts_q6);
            actsOfServiceRadioBtn.setText(R.string.acts_of_service_q6);
            radioGroup.clearCheck();

        } else if (currentQuestionCount == 7) {
            //Set Question label and answers text to question 7
            questionText.setText(R.string.question7);
            wordsOfAffirmationRadioBtn.setText(R.string.words_of_affirmation_q7);
            qualityTimeRadioBtn.setText(R.string.quality_time_q7);
            physicalTouchRadioBtn.setText(R.string.physical_touch_q7);
            receivingGiftsRadioBtn.setText(R.string.receiving_gifts_q7);
            actsOfServiceRadioBtn.setText(R.string.acts_of_service_q7);
            radioGroup.clearCheck();

        } else if (currentQuestionCount == 8) {
            //Set Question label and answers text to question 8
            questionText.setText(R.string.question8);
            wordsOfAffirmationRadioBtn.setText(R.string.words_of_affirmation_q8);
            qualityTimeRadioBtn.setText(R.string.quality_time_q8);
            physicalTouchRadioBtn.setText(R.string.physical_touch_q8);
            receivingGiftsRadioBtn.setText(R.string.receiving_gifts_q8);
            actsOfServiceRadioBtn.setText(R.string.acts_of_service_q8);
            radioGroup.clearCheck();

        } else if (currentQuestionCount == 9) {
            //Set Question label and answers text to question 9
            questionText.setText(R.string.question9);
            wordsOfAffirmationRadioBtn.setText(R.string.words_of_affirmation_q9);
            qualityTimeRadioBtn.setText(R.string.quality_time_q9);
            physicalTouchRadioBtn.setText(R.string.physical_touch_q9);
            receivingGiftsRadioBtn.setText(R.string.receiving_gifts_q9);
            actsOfServiceRadioBtn.setText(R.string.acts_of_service_q9);
            radioGroup.clearCheck();

        } else if (currentQuestionCount == 10) {
            //Set Question label and answers text to question 10 and set button text to finish
            questionText.setText(R.string.question10);
            wordsOfAffirmationRadioBtn.setText(R.string.words_of_affirmation_q10);
            qualityTimeRadioBtn.setText(R.string.quality_time_q10);
            physicalTouchRadioBtn.setText(R.string.physical_touch_q10);
            receivingGiftsRadioBtn.setText(R.string.receiving_gifts_q10);
            actsOfServiceRadioBtn.setText(R.string.acts_of_service_q10);
            radioGroup.clearCheck();
            submitButton.setText(R.string.finish);

        } else if (currentQuestionCount == 11) {
            //Display quiz result and set button text to restart
            questionCounter.setText("10/10");
            submitButton.setText(R.string.restart);
            //compare scores
            int loveLanguagesArray[] = {wordsOfAffirmationScore, physicalTouchScore, qualityTimeScore, receivingGiftsScore, actsOfServiceScore};
            Toast.makeText(this, "Your Love language is: " + calculateHighestScore(loveLanguagesArray, loveLanguagesArray.length), Toast.LENGTH_LONG).show();
            submitButton.setText(R.string.restart);
        } else if (currentQuestionCount == 12) {
            //Starts quiz over
            currentQuestionCount = 1;
            questionCounter.setText(currentQuestionCount + "/10");
            submitButton.setText(R.string.next);
            radioGroup.clearCheck();
            questionText.setText(R.string.question1);
            wordsOfAffirmationRadioBtn.setText(R.string.words_of_affirmation_q1);
            qualityTimeRadioBtn.setText(R.string.quality_time_q1);
            physicalTouchRadioBtn.setText(R.string.physical_touch_q1);
            receivingGiftsRadioBtn.setText(R.string.receiving_gifts_q1);
            actsOfServiceRadioBtn.setText(R.string.acts_of_service_q1);
        }
    }


    //calculates which love language has the highest score
    public String calculateHighestScore(int[] loveLangsArray, int total) {
        //sort array lowest to highest
        Arrays.sort(loveLangsArray);
        //set highest score to variable
        int highestScore = loveLangsArray[total - 1];
        String loveLanguage = "";

        //find which love language score is equal to the highest score
        //then return that love language
        if (highestScore == wordsOfAffirmationScore) {
            loveLanguage = getString(R.string.words_of_affirmation);
        } else if (highestScore == qualityTimeScore) {
            loveLanguage = getString(R.string.quality_time);
        } else if (highestScore == physicalTouchScore) {
            loveLanguage = getString(R.string.physical_touch);
        } else if (highestScore == actsOfServiceScore) {
            loveLanguage = getString(R.string.acts_of_service);
        } else if (highestScore == receivingGiftsScore) {
            loveLanguage = getString(R.string.receiving_gifts);
        }

        return loveLanguage;
    }

}
