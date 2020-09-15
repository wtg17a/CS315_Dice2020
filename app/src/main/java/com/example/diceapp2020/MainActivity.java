package com.example.diceapp2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{

    private ImageView imageViewD6;
    private Button d20Button;
    private Random rng = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageViewD6 = findViewById(R.id.image_view_d6);
        imageViewD6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                rollDie();
            }
        });
        d20Button = findViewById(R.id.d20_button);
        d20Button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                goToD20();
            }
        });
    }

    private void rollDie()
    {
        int randomNumber = rng.nextInt(6);

        switch(randomNumber)
        {
            case 0:
                imageViewD6.setImageResource(R.drawable.dice1);
                break;
            case 1:
                imageViewD6.setImageResource(R.drawable.dice2);
                break;
            case 2:
                imageViewD6.setImageResource(R.drawable.dice3);
                break;
            case 3:
                imageViewD6.setImageResource(R.drawable.dice4);
                break;
            case 4:
                imageViewD6.setImageResource(R.drawable.dice5);
                break;
            case 5:
                imageViewD6.setImageResource(R.drawable.dice6);
                break;
        }
    }

    private void goToD20()
    {
        Intent intent = new Intent(this, D20Activity.class);
        startActivity(intent);
        finish();
    }
}