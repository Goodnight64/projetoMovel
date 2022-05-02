package com.example.projetomovel;

import static java.lang.Math.pow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public Button botao;
    public EditText numeroPrimeiro;
    public EditText numeroSegundario;
    public TextView textresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button)findViewById(R.id.calcularbtn);
        botao.setOnClickListener(this);






        numeroPrimeiro = (EditText)findViewById(R.id.editText);
        numeroSegundario = (EditText)findViewById(R.id.editText2);
        textresultado = (TextView) findViewById(R.id.textResultado);






    }

    @Override
    public void onClick(View view) {
       double x,y;
        x = Double.valueOf(numeroPrimeiro.getText().toString());
       y = Double.valueOf(numeroSegundario.getText().toString());

        double z = pow(x,y);

        textresultado.setText("Resultado é:" + " " + z);

    }
}