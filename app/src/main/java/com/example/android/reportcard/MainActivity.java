package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // Create object from ReportCard class

        ArrayList<Integer> grades = new ArrayList<Integer>(Arrays.asList(10,15,8,13,20));

        ReportCard card = new ReportCard("Moi", 2017, "Udacity", grades);

        TextView reportCard = (TextView) findViewById(R.id.reportRoot);

        reportCard.setText(card.toString());

    }
}
