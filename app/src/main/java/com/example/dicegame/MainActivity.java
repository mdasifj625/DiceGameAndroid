package com.example.dicegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

import static com.example.dicegame.R.drawable.dice6;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton =  findViewById(R.id.roll_Button);

        final ImageView diceLeft = findViewById(R.id.dice_left);
        final ImageView diceRight = findViewById(R.id.dice_right);

        final int [] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Random randomNumberLeft = new Random();
                int diceChangeLeft = randomNumberLeft.nextInt(6);

                Random randomNumberRight = new Random();
                int diceChangeRight = randomNumberRight.nextInt(6);


                diceLeft.setImageResource(diceArray[diceChangeLeft]);

                diceRight.setImageResource(diceArray[diceChangeRight]);
            }
        });
        



    }
}
