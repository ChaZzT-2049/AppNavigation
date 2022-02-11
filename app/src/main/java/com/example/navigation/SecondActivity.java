package com.example.navigation;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    //Btn back

    public void Regresar(View view){
        Intent ant = new Intent(this, MainActivity.class);
        startActivity(ant);
    }
}