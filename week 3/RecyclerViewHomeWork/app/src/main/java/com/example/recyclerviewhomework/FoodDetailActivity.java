package com.example.recyclerviewhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import Model.Food;

public class FoodDetailActivity extends AppCompatActivity {
    Food food;
    ImageView ivFoodImage;
    TextView tvIngredient;
    TextView tvProcedure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);

        ivFoodImage = findViewById(R.id.FoodImage);
        tvIngredient = findViewById(R.id.ingred);
        tvProcedure = findViewById(R.id.proc);


        Bundle extra = getIntent().getExtras();
        if (extra !=null){
            food = (Food)extra.getSerializable("Food");
            Log.d("lentos",food.getProcedure());
            this.setTitle(food.getTitle());
            tvIngredient.setText(food.getIngredients());
            tvProcedure.setText(food.getProcedure());
            ivFoodImage.setImageResource(R.drawable.kale);

        }
    }
}