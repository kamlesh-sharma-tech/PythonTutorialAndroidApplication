package com.android.pythontutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class PaintActivity extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paint);
        getSupportActionBar().setTitle("Python Paint Application");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        webView = (WebView) findViewById(R.id.webView);

        webView.loadUrl("file:///android_asset/python/projects/paint.html");

        webView.getSettings().setJavaScriptEnabled(true);
    }
}