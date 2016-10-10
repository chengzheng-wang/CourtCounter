package com.example.android.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int score_a=0, score_b=0;
    public void onSubmit3a(View view){
        score_a+=3;
        displayTeamA(score_a);
    }
    public void onSubmit3b(View view){
        score_b+=3;
        displayTeamB(score_b);
    }
    public void onSubmit2a(View view){
        score_a+=2;
        displayTeamA(score_a);
    }
    public void onSubmit2b(View view){
        score_b+=2;
        displayTeamB(score_b);
    }
    public void onSubmit1a(View view){
        score_a+=1;
        displayTeamA(score_a);
    }
    public void onSubmit1b(View view){
        score_b+=1;
        displayTeamB(score_b);
    }
    public void onSubmitReset(View view){
        score_a=score_b=0;
        displayTeamA(score_a);
        displayTeamB(score_b);

    }
    public void displayTeamA(int number){
        TextView teamA = (TextView)findViewById(R.id.text_view_a);
        teamA.setText(String.valueOf(number));
    }
    public void displayTeamB(int number){
        TextView teamA = (TextView)findViewById(R.id.text_view_b);
        teamA.setText(String.valueOf(number));
    }
}
