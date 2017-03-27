package br.uema.engcomp.ciclodevidaactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.nio.BufferUnderflowException;

public class SegundaActivity extends AppCompatActivity {

    private TextView txtRetorno;
    private String mensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        txtRetorno = (TextView) findViewById(R.id.txtViewRetorno);

        Toast.makeText(this, "Chamando OnCreate da segunda activity", Toast.LENGTH_SHORT).show();
        Log.d("UEMA", ">> Chamando onCreate da segunda activity");
    }

    @Override
    protected void onStart() {
        super.onStart();

        mensagem = getIntent().getExtras().getString("MENSAGEM");

        txtRetorno.setText(mensagem);

        Toast.makeText(this,"Chamando onStart da segunda activity", Toast.LENGTH_SHORT).show();
        Log.d("UEMA", ">> Chamando onStart da segunda activity");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(this,"Chamando onResume da segunda activity", Toast.LENGTH_SHORT).show();
        Log.d("UEMA", ">> Chamando onResume da segunda activity");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(this,"Chamando onPause da segunda activity", Toast.LENGTH_SHORT).show();
        Log.d("UEMA", ">> Chamando onPause da segunda activity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"Chamando onStop da segunda activity", Toast.LENGTH_SHORT).show();
        Log.d("UEMA", ">> Chamando onStop da segunda activity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"Chamando onDestroy da segunda activity", Toast.LENGTH_SHORT).show();
        Log.d("UEMA", ">> Chamando onDestroy da segunda activity");
    }

    public void voltar(View view) {
        Intent i = new Intent();
        i.putExtra("MENSAGEM_RETORNO", mensagem + " estou voltando");
        setResult(RESULT_OK, i);
        finish();
    }
}
