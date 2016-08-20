package com.example.siddique.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int teamA_points = 0 , teamB_points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void plusThreeA(View view) {
        teamA_points +=3;
        displayA(teamA_points);
    }
    public void plusTwoA(View view) {
        teamA_points +=2;
        displayA(teamA_points);
    }
    public void plusOneA(View view) {
        teamA_points +=1;
        displayA(teamA_points);
    }
    public void plusThreeB(View view) {
        teamB_points +=3;
        displayB(teamB_points);
    }
    public void plusTwoB(View view) {
        teamB_points +=2;
        displayB(teamB_points);
    }
    public void plusOneB(View view) {
        teamB_points +=1;
        displayB(teamB_points);
    }
    private void displayA(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.teamAScore);
        quantityTextView.setText("" + number);
    }
    private void displayB(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.teamBScore);
        quantityTextView.setText("" + number);
    }
    public void reset(View view){
        teamA_points = 0;
        teamB_points = 0;
        displayA(teamA_points);
        displayB(teamB_points);
    }
}
