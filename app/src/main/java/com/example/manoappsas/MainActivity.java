package com.example.manoappsas;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.graphics.Color;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.tvHello);

        Button btn = findViewById(R.id.btnChangeText);
        btn.setOnClickListener(v ->
                tv.setText("Nesupratau ar github repository prisidejo, nes error kazkoks buvo")
        );

        Button btnColor = findViewById(R.id.btnChangeColor);
        btnColor.setOnClickListener(v ->
                tv.setTextColor(Color.RED)
        );

        View root = findViewById(R.id.main);
        Button btnBg = findViewById(R.id.btnBgColor);
        btnBg.setOnClickListener(v ->
                root.setBackgroundColor(
                        ContextCompat.getColor(this, android.R.color.holo_blue_light)
                )
        );

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}

//Comment for revert
