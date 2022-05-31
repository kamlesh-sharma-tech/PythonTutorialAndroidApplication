package com.android.pythontutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashboardActivity extends AppCompatActivity {

    CardView programsCardView,compilerCardView,projectsCardView,aboutCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        programsCardView = (CardView)findViewById(R.id.programsCardView);
        compilerCardView = (CardView)findViewById(R.id.compilerCardView);
        projectsCardView = (CardView)findViewById(R.id.projectsCardView);
        aboutCardView = (CardView)findViewById(R.id.aboutCardView);

        programsCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this,ProgramsActivity.class);
                startActivity(intent);

            }
        });

        compilerCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this,CompilerActivity.class);
                startActivity(intent);
            }
        });


        projectsCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this,ProjectActivity.class);
                startActivity(intent);
            }
        });


        aboutCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this,AboutActivity.class);
                startActivity(intent);
            }
        });



    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Exit Application");
        builder.setMessage("Are you sure you want to exit ?");
        builder.setCancelable(false);
        builder.setIcon(R.drawable.ic_exit);
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog alertDialog = builder.create();
        builder.show();
    }
}