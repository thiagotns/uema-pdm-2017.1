package br.uema.engcomp.ciclodevidaactivity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (EditText) findViewById(R.id.txtMensagem);

        Toast.makeText(this, "Chamando OnCreate", Toast.LENGTH_SHORT).show();
        Log.d("UEMA", ">> Chamando onCreate");
    }

    public void iniciar(View v){

        String mensagem = txt.getText().toString();

        Intent i = new Intent(this, SegundaActivity.class);
        i.putExtra("MENSAGEM", mensagem);
        startActivityForResult(i, 99);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(this,"Chamando onStart", Toast.LENGTH_SHORT).show();
        Log.d("UEMA", ">> Chamando onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(this,"Chamando onResume", Toast.LENGTH_SHORT).show();
        Log.d("UEMA", ">> Chamando onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(this,"Chamando onPause", Toast.LENGTH_SHORT).show();
        Log.d("UEMA", ">> Chamando onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"Chamando onStop", Toast.LENGTH_SHORT).show();
        Log.d("UEMA", ">> Chamando onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(this,"Chamando onDestroy", Toast.LENGTH_SHORT).show();
        Log.d("UEMA", ">> Chamando onDestroy");
    }

    @Override
    protected void onActivityResult(int requestCode,
                                    int resultCode,
                                    Intent data) {

        if(requestCode == 99 && resultCode == RESULT_OK){
            String retorno =data.getStringExtra("MENSAGEM_RETORNO");
            txt.setText(retorno);
        }

    }
}
