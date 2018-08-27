package br.edu.projetosandroid.passagemdeparametrosentreactivities;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText edtNome = (EditText) findViewById(R.id.nome);
        final EditText edtEndereco = (EditText) findViewById(R.id.endereco);
        final EditText edtCelular = (EditText) findViewById(R.id.celular);
        final Button btnCadastrar = (Button) findViewById(R.id.cadastrar);
        final CheckBox opFumante = (CheckBox) findViewById(R.id.fumante);
        final CheckBox opCardiaco = (CheckBox) findViewById(R.id.cardiaco);
        final CheckBox opHipertenso = (CheckBox) findViewById(R.id.hipertenso);
        final CheckBox opAlergico = (CheckBox) findViewById(R.id.alergico);

        btnCadastrar.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Tela2.class);
                Bundle params = new Bundle();
                String nome = edtNome.getText().toString();
                String endereco = edtEndereco.getText().toString();
                String celular = edtCelular.getText().toString();
                Boolean fumante = opFumante.isChecked();
                Boolean cardiaco = opCardiaco.isChecked();
                Boolean hipertenso = opHipertenso.isChecked();
                Boolean alergico = opAlergico.isChecked();

                params.putString("nome", nome);
                params.putString("endereco", endereco);
                params.putString("celular", celular);
                params.putBoolean("fumante", fumante);
                params.putBoolean("cardiaco", cardiaco);
                params.putBoolean("hipertenso", hipertenso);
                params.putBoolean("alergico", alergico);
                it.putExtras(params);
                startActivity(it);
            }
        });
    }
}
