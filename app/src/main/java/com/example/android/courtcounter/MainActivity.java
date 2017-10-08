

package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Main class for CourtCounter app
 *
 * @author igoratf
 *         <p>
 *         The whole code is based on Udacity's Android Course project for Court Counter app.
 *         However, I've made the methods myself by looking only at the design and didn't follow the instructions for building it, which may cause differences between the codes.
 */

public class MainActivity extends AppCompatActivity {
    int teamAScore;
    int teamBScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamAScore = 0;
        teamBScore = 0;
    }

    /**
     * Displays Team A score
     *
     * @param numberA is the Team A score
     */
    public void displayA(int numberA) {
        TextView t = (TextView) findViewById(R.id.team_a_score);
        t.setText(String.valueOf(numberA));
    }

    /**
     * Displays Team B score
     *
     * @param number is Team B score
     */
    public void displayB(int number) {
        TextView t = (TextView) findViewById(R.id.team_b_score);
        t.setText(String.valueOf(number));
    }

    /**
     * Adds 2 points to the Team Counter
     */
    public void addTwoPoints(View view) {
        if (view.equals(findViewById(R.id.two_points_a))) {
            teamAScore += 2;
            displayA(teamAScore);
        } else if (view.equals(findViewById(R.id.two_points_b))) {
            teamBScore += 2;
            displayB(teamBScore);
        }

    }

    /**
     * Adds 3 points to the Team Counter
     */
    public void addThreePoints(View view) {
        if (view.equals(findViewById(R.id.three_points_a))) {
            teamAScore += 3;
            displayA(teamAScore);
        } else if (view.equals(findViewById(R.id.three_points_b))) {
            teamBScore += 3;
            displayB(teamBScore);
        }

    }

    /**
     * Adds 1 point to the Team Counter
     */
    public void addFreeThrow(View view) {
        if (view.equals(findViewById(R.id.free_throw_a))) {
            teamAScore += 1;
            displayA(teamAScore);
        } else if (view.equals(findViewById(R.id.free_throw_b))) {
            teamBScore += 1;
            displayB(teamBScore);
        }

    }

    /**
     * Resets the counter to 0
     */

    public void reset(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayA(teamAScore);
        displayB(teamBScore);

    }
}
