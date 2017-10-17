package com.majd.jokeactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);

        String joke=getIntent().getStringExtra("joke");
        TextView jokeText=(TextView)findViewById(R.id.jokeTetx);
        jokeText.setText(joke);
    }
}
