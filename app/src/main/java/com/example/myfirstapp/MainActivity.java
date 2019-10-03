package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TOTAL_COUNT = "total_count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Show a toast
     * @param view -- the view that is clicked
     */
    public void toastMe(View view){
        Toast toast = Toast.makeText(this,"Burned Toast.",Toast.LENGTH_SHORT);
        toast.show();
    }

    public void incrementCounter(View view){
        TextView tvCounter = findViewById(R.id.tvCounter);
        String countString = tvCounter.getText().toString();
        int count = Integer.parseInt(countString);
        count++;
        tvCounter.setText(Integer.toString(count));
    }

    public void randomMe(View view){
        Intent randomIntent = new Intent(this, SecondActivity.class);
        TextView tvCounter = findViewById(R.id.tvCounter);
        String countString = tvCounter.getText().toString();
        int count = Integer.parseInt(countString);
        randomIntent.putExtra(TOTAL_COUNT, count);
        startActivity(randomIntent);
    }
}
