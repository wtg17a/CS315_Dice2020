package com.example.diceapp2020;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class D20Activity extends AppCompatActivity
{

    private MediaPlayer rollAudio;
    private MediaPlayer successAudio;
    private MediaPlayer failureAudio;
    private ImageView imageViewD20;
    private TextView textViewResult;
    private Button d6Button;
    private Random rng = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d20);

        rollAudio = MediaPlayer.create(D20Activity.this, R.raw.diceroll);
        successAudio = MediaPlayer.create(D20Activity.this, R.raw.success);
        failureAudio = MediaPlayer.create(D20Activity.this, R.raw.failure);
        imageViewD20 = findViewById(R.id.image_view_d20);
        imageViewD20.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                rollD20();
            }
        });
        textViewResult = findViewById(R.id.text_view_result);
        d6Button = findViewById(R.id.d6_button);
        d6Button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                goToD6();
            }
        });
    }

    private void rollD20()
    {
        int randomNumber = rng.nextInt(20);
        rollAudio.seekTo(0);
        rollAudio.start();

        switch(randomNumber)
        {
            case 0:
                imageViewD20.setImageResource(R.drawable.d20_01);
                textViewResult.setText(R.string.nat1);
                textViewResult.setVisibility(View.VISIBLE);
                failureAudio.seekTo(0);
                failureAudio.start();
                break;
            case 1:
                imageViewD20.setImageResource(R.drawable.d20_02);
                textViewResult.setVisibility(View.INVISIBLE);
                break;
            case 2:
                imageViewD20.setImageResource(R.drawable.d20_03);
                textViewResult.setVisibility(View.INVISIBLE);
                break;
            case 3:
                imageViewD20.setImageResource(R.drawable.d20_04);
                textViewResult.setVisibility(View.INVISIBLE);
                break;
            case 4:
                imageViewD20.setImageResource(R.drawable.d20_05);
                textViewResult.setVisibility(View.INVISIBLE);
                break;
            case 5:
                imageViewD20.setImageResource(R.drawable.d20_06);
                textViewResult.setVisibility(View.INVISIBLE);
                break;
            case 6:
                imageViewD20.setImageResource(R.drawable.d20_07);
                textViewResult.setVisibility(View.INVISIBLE);
                break;
            case 7:
                imageViewD20.setImageResource(R.drawable.d20_08);
                textViewResult.setVisibility(View.INVISIBLE);
                break;
            case 8:
                imageViewD20.setImageResource(R.drawable.d20_09);
                textViewResult.setVisibility(View.INVISIBLE);
                break;
            case 9:
                imageViewD20.setImageResource(R.drawable.d20_10);
                textViewResult.setVisibility(View.INVISIBLE);
                break;
            case 10:
                imageViewD20.setImageResource(R.drawable.d20_11);
                textViewResult.setVisibility(View.INVISIBLE);
                break;
            case 11:
                imageViewD20.setImageResource(R.drawable.d20_12);
                textViewResult.setVisibility(View.INVISIBLE);
                break;
            case 12:
                imageViewD20.setImageResource(R.drawable.d20_13);
                textViewResult.setVisibility(View.INVISIBLE);
                break;
            case 13:
                imageViewD20.setImageResource(R.drawable.d20_14);
                textViewResult.setVisibility(View.INVISIBLE);
                break;
            case 14:
                imageViewD20.setImageResource(R.drawable.d20_15);
                textViewResult.setVisibility(View.INVISIBLE);
                break;
            case 15:
                imageViewD20.setImageResource(R.drawable.d20_16);
                textViewResult.setVisibility(View.INVISIBLE);
                break;
            case 16:
                imageViewD20.setImageResource(R.drawable.d20_17);
                textViewResult.setVisibility(View.INVISIBLE);
                break;
            case 17:
                imageViewD20.setImageResource(R.drawable.d20_18);
                textViewResult.setVisibility(View.INVISIBLE);
                break;
            case 18:
                imageViewD20.setImageResource(R.drawable.d20_19);
                textViewResult.setVisibility(View.INVISIBLE);
                break;
            case 19:
                imageViewD20.setImageResource(R.drawable.d20_20);
                textViewResult.setText(R.string.nat20);
                textViewResult.setVisibility(View.VISIBLE);
                successAudio.seekTo(0);
                successAudio.start();
                break;
        }
    }

    private void goToD6()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}