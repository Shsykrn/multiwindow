package com.example.multiwindow;

import androidx.appcompat.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import android.os.Bundle;

public class berita extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berita);
        TextView tv = (TextView) findViewById(R.id.berita);
        tv.setMovementMethod(new ScrollingMovementMethod());
    }
}