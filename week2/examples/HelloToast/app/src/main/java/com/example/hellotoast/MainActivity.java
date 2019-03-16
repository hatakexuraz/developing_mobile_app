package com.example.hellotoast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.hellotoast.HelloActivity";
    private int count=0;
    TextView textView_count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView_count = findViewById(R.id.txt_count);
    }

    public void newIntentActivity(View view) {
        Intent i = new Intent(this, HelloActivity.class);
        i.putExtra(EXTRA_MESSAGE, count);
        this.startActivity(i);
    }


    public void startCount(View view) {
        count++;
        textView_count.setText(""+count);
    }
}
