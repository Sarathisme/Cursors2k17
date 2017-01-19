package com.example.sarath.cursors2k17;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;

public class WebViewActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_web_view);

        final ProgressBar Pbar= (ProgressBar) findViewById(R.id.pB1);


        webView = (WebView) findViewById(R.id.activity_web_view);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://docs.google.com/a/anits.edu.in/forms/d/e/1FAIpQLSejXZRPS-u-2N6hJYXo8JIl-XqT6dwjYw7I9unIBMbxgVytCg/viewform");

        webView.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {
                if(progress < 100 && Pbar.getVisibility() == ProgressBar.GONE){
                    Pbar.setVisibility(ProgressBar.VISIBLE);
                }

                Pbar.setProgress(progress);
                if(progress == 100) {
                    Pbar.setVisibility(ProgressBar.GONE);
                }
            }
        });

    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
