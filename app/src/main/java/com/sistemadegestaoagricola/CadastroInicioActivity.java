package com.sistemadegestaoagricola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.sistemadegestaoagricola.entidades.Usuario;

public class CadastroInicioActivity extends AppCompatActivity {

    private TextView tvSaudacao;
    private Button btComecar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_inicio);

        tvSaudacao = findViewById(R.id.tvSaudacaoCadastroInicio);
        btComecar = findViewById(R.id.btComecarCadastroInicio);

        tvSaudacao.setText("Olá, " + Usuario.getNome() + "!");

        btComecar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),TamanhoPropriedadeActivity.class);
                startActivity(intent);
            }
        });
    }
}