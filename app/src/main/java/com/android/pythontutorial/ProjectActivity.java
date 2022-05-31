package com.android.pythontutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProjectActivity extends AppCompatActivity {
    CardView textEditorCardView,paintCardView,calculatorCardView,pingpongCardView,clockCardView,mailCardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);
        getSupportActionBar().setTitle("Python Projects");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        textEditorCardView = (CardView) findViewById(R.id.textEditorCardView);
        paintCardView = (CardView) findViewById(R.id.paintCardView);
        calculatorCardView = (CardView) findViewById(R.id.calculatorCardView);
        pingpongCardView = (CardView) findViewById(R.id.pingpongCardView);
        clockCardView = (CardView) findViewById(R.id.clockCardView);
        mailCardView = (CardView) findViewById(R.id.mailCardView);

        textEditorCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProjectActivity.this,TextEditorActivity.class);
                startActivity(intent);
            }
        });

        paintCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProjectActivity.this,PaintActivity.class);
                startActivity(intent);
            }
        });

        calculatorCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProjectActivity.this,CalculatorActivity.class);
                startActivity(intent);
            }
        });

        pingpongCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProjectActivity.this,PingPongActivity.class);
                startActivity(intent);
            }
        });

        clockCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProjectActivity.this,DigitalClockActivity.class);
                startActivity(intent);
            }
        });

        mailCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProjectActivity.this,EmailActivity.class);
                startActivity(intent);
            }
        });
    }
}