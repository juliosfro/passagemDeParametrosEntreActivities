package br.edu.projetosandroid.passagemdeparametrosentreactivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        Intent it = getIntent();

        final TextView txtNome = (TextView) findViewById(R.id.nome);
        final TextView txtEndereco = (TextView) findViewById(R.id.endereco);
        final TextView txtCelular = (TextView) findViewById(R.id.celular);
        final TextView txtFumante = (TextView) findViewById(R.id.fumante);
        final TextView txtCardiaco = (TextView) findViewById(R.id.cardiaco);
        final TextView txtHipertenso = (TextView) findViewById(R.id.hipertenso);
        final TextView txtAlergico = (TextView) findViewById(R.id.alergico);

        if (it != null) {
            Bundle params = it.getExtras();
            if (params != null) {
                String nome = params.getString("nome");
                String endereco = params.getString("endereco");
                String celular = params.getString("celular");
                Boolean cardiaco = params.getBoolean("cardiaco");
                Boolean hipertenso = params.getBoolean("hipertenso");
                Boolean fuma = params.getBoolean("fumante");
                Boolean alergico = params.getBoolean("alergico");

                txtNome.setText(nome.toString());
                txtEndereco.setText(endereco.toString());
                txtCelular.setText(celular.toString());

                if (cardiaco.toString().equals(("true"))) {
                    txtCardiaco.setText("Sim");
                } else if (cardiaco.toString().equals(("false"))) {
                    txtCardiaco.setText("Não");
                }

                if (hipertenso.toString().equals("true")) {
                    txtHipertenso.setText("Sim");
                } else if (hipertenso.toString().equals("false")) {
                    txtHipertenso.setText("Não");
                }

                if (fuma.toString().equals("true")) {
                    txtFumante.setText("Sim");
                } else if (fuma.toString().equals("false")) {
                    txtFumante.setText("Não");
                }

                if (alergico.toString().equals("true")) {
                    txtAlergico.setText("Sim");
                } else if (alergico.toString().equals("false")) {
                    txtAlergico.setText("Não");
                }
            }
        }
    }
}
