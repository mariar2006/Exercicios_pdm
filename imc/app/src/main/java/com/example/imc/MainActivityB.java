package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_b);
        float peso = getIntent().getExtras().getFloat("keypeso");
        float altura = getIntent().getExtras().getFloat("keyaltura");
        TextView tv = findViewById(R.id.txtResultado);
        float imc = (peso / (altura * altura));
        DecimalFormat df=new DecimalFormat("##.##");
        tv.setText(Float.toString(imc));
        setPerfil(imc);
    }
    public void setPerfil(Float imc){
        ImageView imageView=findViewById(R.id.imageView2);
        if(imc<18.5){
            imageView.setImageResource(R.drawable.abaixopeso);
        }
        else {
            if(imc<25){
                imageView.setImageResource(R.drawable.normal);
        } else {
                if(imc<30){
                    imageView.setImageResource(R.drawable.sobrepeso);
            }


    }
}