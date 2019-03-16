package com.example.helloconstraint;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int num=0;
    TextView number;
    Button count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = (TextView) findViewById(R.id.txt_num);
        count = (Button) findViewById(R.id.btn_count);

    }

    public void setToZero(View view) {
        num=0;
        number.setText(num+"");
    }

    public void increaseNumber(View view) {
        num++;
        if((num%2)!=0){
            count.setBackgroundColor(Color.GRAY);
        }
        else{
            count.setBackgroundColor(Color.DKGRAY);
        }
        number.setText(num+"");
    }
}
