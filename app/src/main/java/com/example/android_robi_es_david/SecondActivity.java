package com.example.android_robi_es_david;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;

import java.text.BreakIterator;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView product = findViewById(R.id.product);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            product.setText("Köszönjük a következő termék vásárlást!" + extras.get("usd").toString());
        }

    }
}

