package com.example.sharedpreferencesexample;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SharedPreferences prefs;

    EditText et_texto;
    TextView txt_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_texto = findViewById(R.id.et_text);
        txt_resultado = findViewById(R.id.txt_result);

        prefs = getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);

    }

    public void onClickBtnSave(View v)
    {
        String texto = et_texto.getText().toString();

        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("textoGuardado",texto);
        editor.commit();
    }

    public void onClickBtnShow(View v)
    {
        String resultado = prefs.getString("textoGuardado","");
        txt_resultado.setText(getString(R.string.txtResult)+" "+resultado);
    }

    public void onClickBtnSecond(View v)
    {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
