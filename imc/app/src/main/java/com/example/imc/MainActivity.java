package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edAltura=findViewById(R.id.edAltura);
        edPeso=findViewById(R.id.edPeso);

        Log.d("ciclo de vida", "onCreate");
        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float peso = Float.parseFloat(edPeso.getT)

                Intent i=new Intent(getApplicationContext(),MainActivityB.class);
                i.putExtra("keypeso", peso);
                i.putExtra("keyaltura", altura);
                startActivity(i);
            }
        });

    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("ciclo de vida", "onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ciclo de vida", "onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ciclo de vida", "onPause");
    }
}