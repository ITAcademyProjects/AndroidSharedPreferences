package com.example.sharedpreferencesexample;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    SharedPreferences preferences;
    TextView txt_second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txt_second = findViewById(R.id.txt_second);
        preferences = getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);

        String text = preferences.getString("textoGuardado","");

        txt_second.setText(text);

    }
}
