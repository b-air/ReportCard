package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // Create object from ReportCard class
        ReportCard card = new ReportCard();

        TextView reportCard = (TextView) findViewById(R.id.reportRoot);

        reportCard.setText(card.showCard());

    }
}
