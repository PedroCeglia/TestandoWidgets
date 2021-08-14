package com.pedro.ceglia.pandora.testandocomponentes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class SpalshSCreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh_s_creen);
        getSupportActionBar().hide();

        final Runnable r = new Runnable() {
            @Override
            public void run() {
                abrirIntentPrincipal();
            }
        };
        Handler handler = new Handler();
        handler.postDelayed(r,  3000);

    }
    private void abrirIntentPrincipal(){
        Intent i = new Intent(SpalshSCreenActivity.this, MainActivity.class);
        startActivity(i);
    }
    //
}