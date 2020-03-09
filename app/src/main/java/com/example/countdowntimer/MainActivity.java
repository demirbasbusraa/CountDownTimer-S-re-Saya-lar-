package com.example.countdowntimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        new CountDownTimer(10000, 1000){ //sayaç 10 sn sürsün(10000) ve her azalış 1 sn olsun(1000).

            @Override
            public void onTick(long millisUntilFinished) {
                textView.setText("Left  : " + millisUntilFinished / 1000);
                // milisaniye olarak veriyodu bölü 1000 = sniye açısından gösterisn istedim.

            }

            @Override
            public void onFinish() {
                Toast.makeText(getApplicationContext(), "Done!", Toast.LENGTH_LONG).show();
                textView.setText("Finished!!");
            }
        }.start();
    }
}
