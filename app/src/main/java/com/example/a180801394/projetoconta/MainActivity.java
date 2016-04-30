package com.example.a180801394.projetoconta;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcula(View v){


        RelativeLayout cont = (RelativeLayout) findViewById(R.id.conteiner);

            double total=0;

            for(int i=0; i< cont.getChildCount(); i++) {

                if (cont.getChildAt(i) instanceof CheckBox) {
                    CheckBox check = (CheckBox) cont.getChildAt(i);

                    if (check.isChecked()) {
//                        Toast.makeText(this, String.valueOf(check.getTag()), Toast.LENGTH_SHORT).show();
                        total+= Double.parseDouble(String.valueOf(check.getTag()));
                    }
                }
            }

        AlertDialog alerta = new AlertDialog.Builder(this).create();
        alerta.setTitle("Pagar contas");
        alerta.setMessage("Deseja pagar o valor de "+total);
        alerta.show();



    }
}
