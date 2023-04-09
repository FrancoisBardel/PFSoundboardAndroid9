package com.example.pfsoundboardandroid9;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sound(View view) {
        MediaPlayer sound=null;
        switch (view.getId()){
            case R.id.pol:
                sound=MediaPlayer.create(this,R.raw.va_au_diable);
                break;
            case R.id.fin:
                sound=MediaPlayer.create(this,R.raw.finito_macron);
                break;
            case R.id.eh:
                sound=MediaPlayer.create(this,R.raw.eh_eh_eh_ah);
                break;
            case R.id.mauv:
                sound=MediaPlayer.create(this,R.raw.t_mauvais);
                break;
            case R.id.exp:
                sound=MediaPlayer.create(this,R.raw.explosion);
                break;
            case R.id.feur:
                sound=MediaPlayer.create(this,R.raw.feur);
                break;
            case R.id.cart:
                sound=MediaPlayer.create(this,R.raw.cartoon);
                break;
            case R.id.cpa:
                sound=MediaPlayer.create(this,R.raw.cest_pa);
                break;
        }
        sound.start();
    }
}