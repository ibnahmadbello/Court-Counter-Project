package com.practice.ayrash.courtcounterproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreNewYorkGiant = 0;
    int scoreNewYorkJet = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayNewYorkGiantScore(int score){
        TextView scoreView = (TextView) findViewById(R.id.newYorkGiantScore);
        scoreView.setText(String.valueOf(score));
    }

    public void displayNewYorkJetScore(int score){
        TextView scoreView = (TextView) findViewById(R.id.newYorkJetScore);
        scoreView.setText(String.valueOf(score));
    }

    public void plusSixToNewYorkGiant(View view){
        scoreNewYorkGiant = scoreNewYorkGiant + 6;
        displayNewYorkGiantScore(scoreNewYorkGiant);
    }

    public void plusOneBonusToNewYorkGiant(View view){
        scoreNewYorkGiant = scoreNewYorkGiant + 1;
        displayNewYorkGiantScore(scoreNewYorkGiant);
    }

    public void plusTwoBonusToNewYorkGiant(View view){
        scoreNewYorkGiant = scoreNewYorkGiant + 2;
        displayNewYorkGiantScore(scoreNewYorkGiant);
    }

    public void plusThreeToNewYorkGiant(View view){
        scoreNewYorkGiant = scoreNewYorkGiant + 3;
        displayNewYorkGiantScore(scoreNewYorkGiant);
    }

    public void plusTwoToNewYorkGiant(View view){
        scoreNewYorkGiant = scoreNewYorkGiant + 2;
        displayNewYorkGiantScore(scoreNewYorkGiant);
    }

    public void plusSixToNewYorkJet(View view){
        scoreNewYorkJet = scoreNewYorkJet + 6;
        displayNewYorkJetScore(scoreNewYorkJet);
    }

    public void plusOneBonusToNewYorkJet(View view){
        scoreNewYorkJet = scoreNewYorkJet + 1;
        displayNewYorkJetScore(scoreNewYorkJet);
    }

    public void plusTwoBonusToNewYorkJet(View view){
        scoreNewYorkJet = scoreNewYorkJet + 2;
        displayNewYorkJetScore(scoreNewYorkJet);
    }

    public void plusThreeToNewYorkJet(View view){
        scoreNewYorkJet = scoreNewYorkJet + 3;
        displayNewYorkJetScore(scoreNewYorkJet);
    }

    public void plusTwoToNewYorkJet(View view){
        scoreNewYorkJet = scoreNewYorkJet + 2;
        displayNewYorkJetScore(scoreNewYorkJet);
    }

    public void clearScore(View view){
        scoreNewYorkGiant = 0;
        scoreNewYorkJet = 0;
        displayNewYorkGiantScore(scoreNewYorkGiant);
        displayNewYorkJetScore(scoreNewYorkJet);
    }
}
