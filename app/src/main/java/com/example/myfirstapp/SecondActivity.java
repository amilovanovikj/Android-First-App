package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    private static final String TOTAL_COUNT = "total_count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        showRandomNumber();
    }

    private void showRandomNumber(){
        TextView tvRandom = findViewById(R.id.tvRandomNum);
        TextView tvHeading = findViewById(R.id.tvHeading);
        int maxCount = getIntent().getIntExtra(TOTAL_COUNT, 0);
        Random random = new Random();
        int randomInt = 0;
        if (maxCount > 0) {
            randomInt = random.nextInt(maxCount);
        }
        tvRandom.setText(Integer.toString(randomInt));
        tvHeading.setText(getString(R.string.randomHeading, maxCount));
    }
}
