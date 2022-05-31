package com.android.pythontutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class CalculatorActivity extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        getSupportActionBar().setTitle("Python Calculator");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        webView = (WebView) findViewById(R.id.webView);

        webView.loadUrl("file:///android_asset/python/projects/calculator.html");

        webView.getSettings().setJavaScriptEnabled(true);
    }
}