package com.example.secondapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView cardView = findViewById(R.id.cardView);
        cardView.setBackgroundResource(R.drawable.bg_card_view);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(view -> {
            if (cardView.getAlpha() == 1) {
                cardView.animate().alpha(0).setDuration(3000);
            } else {
                cardView.animate().alpha(1).setDuration(1000);
            }
        });

        LinearLayout container = findViewById(R.id.container);

        findViewById(R.id.bigBT).setOnClickListener(view -> {
            if (container.getVisibility() == View.VISIBLE) {
                container.setVisibility(View.GONE);
            } else {
                container.setVisibility(View.VISIBLE);
            }
        });

        EditText editText = findViewById(R.id.editText);
        findViewById(R.id.ovalBT).setOnClickListener(view -> {
            Toast.makeText(MainActivity.this, editText.getText(), Toast.LENGTH_SHORT).show();
        });
    }
}