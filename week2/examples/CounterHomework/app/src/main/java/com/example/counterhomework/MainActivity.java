package com.example.counterhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int countValue = 0;
    private TextView txtValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtValue = findViewById(R.id.txtCountValue);

        if(savedInstanceState != null){
            txtValue.setText(savedInstanceState.getString("count_value"));
        }
    }

    public void countValue(View view) {
        ++countValue;
        if(txtValue != null){
            txtValue.setText(Integer.toString(countValue));
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString("count_value",txtValue.getText().toString());
    }
}
