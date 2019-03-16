package com.example.counterhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int num = 0;
    private String message="";
    Button count;
    TextView textViewCount;
    EditText editTexts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count = findViewById(R.id.btn_count);
        textViewCount = findViewById(R.id.txt_num);
        editTexts = findViewById(R.id.txt_texts);

        if(savedInstanceState!=null){
            num =savedInstanceState.getInt("Count");
            message = savedInstanceState.getString("Message","");
        }

        editTexts.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                message = editTexts.getText().toString();
            }
        });
    }

    public void increaseNumber(View view) {
        num++;
        textViewCount.setText(""+num);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("Count", num);
        outState.putString("Message", message);
    }


}
