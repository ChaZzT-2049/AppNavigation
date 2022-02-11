package com.example.navigation;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Btn sig
    public void Cambiar(View view){
        Intent sig = new Intent(this, SecondActivity.class);
        startActivity(sig);
    }
}