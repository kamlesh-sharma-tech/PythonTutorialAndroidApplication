package com.android.pythontutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class TextEditorActivity extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_editor);
        getSupportActionBar().setTitle("Python Text Editor");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        webView = (WebView) findViewById(R.id.webView);

        webView.loadUrl("file:///android_asset/python/projects/text_editor.html");

        webView.getSettings().setJavaScriptEnabled(true);
    }
}