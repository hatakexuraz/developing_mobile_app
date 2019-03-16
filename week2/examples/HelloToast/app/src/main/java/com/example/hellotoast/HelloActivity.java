package com.example.hellotoast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        Intent  i = getIntent();
        int count = i.getIntExtra(MainActivity.EXTRA_MESSAGE, 0);
        TextView textView_count = findViewById(R.id.txt_hello);
        textView_count.setText(""+count);
    }
}
