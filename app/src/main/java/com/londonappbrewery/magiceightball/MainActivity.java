package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton;
        askButton = findViewById(R.id.askButton);
        final int[] magicBalls = {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3,
                            R.drawable.ball4, R.drawable.ball5};
        final ImageView ballImage = findViewById((R.id.eight_ball_image));

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("AskMe!", "onClick: Button has been clicked");

                Random randomNumberGenerator = new Random();
                int randomNo = randomNumberGenerator.nextInt(5);



                ballImage.setImageResource(magicBalls[randomNo]);
            }
        });
    }
}
