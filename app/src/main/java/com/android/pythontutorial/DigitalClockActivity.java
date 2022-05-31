package com.android.pythontutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class DigitalClockActivity extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digital_clock);
        getSupportActionBar().setTitle("Python Digital Clock");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        webView = (WebView) findViewById(R.id.webView);

        webView.loadUrl("file:///android_asset/python/projects/clock.html");

        webView.getSettings().setJavaScriptEnabled(true);
    }
}