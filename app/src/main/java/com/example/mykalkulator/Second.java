package com.example.mykalkulator;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        TextView THitung = findViewById(R.id.THitung);

        if(intent.hasExtra("pesanError")){
            THitung.setText(intent.getStringExtra("pesanError"));
        }else{
            THitung.setText(String.valueOf(intent.getDoubleExtra("hasil", 0)));
        }
    }
}