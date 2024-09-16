package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView text;
    int cont;

    TextView txtNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= findViewById(R.id.bntclick);
        txtNum = findViewById(R.id.txtNum);
        button.setText("click");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                Button b=(Button) view;
                int ninicial=50;
                int nfinal=100;
                int nsorteado=random.nextInt(nfinal+ninicial) + ninicial;

                txtNum.setText(Integer.toString(nsorteado));
            }
        });
    }
}