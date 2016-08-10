package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * global variable
     * @param savedInstanceState
     */
    int scoreTeamA=0;
    int scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * teamA3
     */
    public void teamA3(View v){
        scoreTeamA = scoreTeamA + 3;
        displayScoreA(scoreTeamA);
    }
    /**
     * teamA2
     */
    public void teamA2(View v){
        scoreTeamA = scoreTeamA + 2;
        displayScoreA(scoreTeamA);
    }
    /**
     * teamAfree
     */
    public void teamAfree(View v){
        scoreTeamA = scoreTeamA + 1;
        displayScoreA(scoreTeamA);
    }
    /**
     * displayScoreA
     */
    public void displayScoreA(int scoreTeamA){
        TextView txtView = (TextView) findViewById(R.id.teamA);
        txtView.setText(String.valueOf(scoreTeamA));
    }

    /**
     * teamB3
     * @param v
     */
    public void teamB3(View v){
        scoreTeamB = scoreTeamB + 3;
        displayScoreB(scoreTeamB);
    }
    /**
     * teamB2
     */
    public void teamB2(View v){
        scoreTeamB = scoreTeamB + 2;
        displayScoreB(scoreTeamB);
    }
    /**
     * teamBfree
     */
    public void teamBfree(View v){
        scoreTeamB = scoreTeamB + 1;
        displayScoreB(scoreTeamB);
    }
    /**
     * displayScoreA
     */
    public void displayScoreB(int scoreTeamA){
        TextView txtView = (TextView) findViewById(R.id.teamB);
        txtView.setText(String.valueOf(scoreTeamB));
    }
    /**
     * reset values
     */
    public void resetScore(View v){
        scoreTeamA=0;
        scoreTeamB=0;
        displayScoreA(scoreTeamA);
        displayScoreB(scoreTeamB);
    }
}
