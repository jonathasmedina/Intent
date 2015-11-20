package com.example.asus.intent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        String var = (String) intent.getSerializableExtra("var");
        String nome = (String) intent.getSerializableExtra("var_nome");

        int var_n = (int) intent.getSerializableExtra("var_n");

        TextView texto;
        texto = (TextView) findViewById(R.id.textView);
        texto.setText(var);
/*
        //exemplo toast passando 'this' como contexto
        Toast toast = Toast.makeText(this, nome, Toast.LENGTH_LONG);
        toast.show();

        Toast toast2 = Toast.makeText(this, var_n, Toast.LENGTH_LONG);
        toast2.show();

        //exemplo toast criando o contexto
        Context contexto = getApplicationContext();
        Toast toast3 = Toast.makeText(contexto, var_n, Toast.LENGTH_LONG);
        toast3.show();
*/
        //exemplo toast setando posições na tela
        Toast toast4 = Toast.makeText(this, nome, Toast.LENGTH_LONG);
        //segundo parametro: mover para a direita; terceiro parametro: mover para baixo
        toast4.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
        toast4.show();


    }

}
