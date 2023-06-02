package com.example.practica_4;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText val1,val2;
    String Tval1,Tval2,frase,frase2;
    float val,val02,Resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        val1=(EditText)findViewById(R.id.Valor1);//tomar los valores de la parte logica como visual
        val2=(EditText)findViewById(R.id.Valor2);//tomar los valores de la parte logica como visual
        val1.setError("Favor de llenar la casilla");//Captura si es el error para decirle al usuario que es lo que falta
        val2.setError("Favor de llenar la casilla");// si es que no coincide los valores de peticion
    }

    public void SUMA(View boto1){
        Tval1=val1.getText().toString();
        Tval2=val2.getText().toString();
        if(!Tval1.isEmpty() &&Tval2.isEmpty()==false){
            val=Integer.parseInt(Tval1);
            val02=Integer.parseInt(Tval2);
            Resultado=val+val02;
            Toast.makeText(this, "La suma es.."+Resultado, Toast.LENGTH_SHORT).show();
        }else{
            if(Tval1.isEmpty()==true) {
                val1.setError("Favor de llenar la casilla");
            }else {
                val2.setError("Favor de llenar la casilla");
            }
        }
    }
    public void RESTA(View boto2){
        Tval1=val1.getText().toString();
        Tval2=val2.getText().toString();
        if(Tval1.isEmpty()==false&&Tval2.isEmpty()==false){
            val=Integer.parseInt(Tval1);
            val02=Integer.parseInt(Tval2);
            Resultado=val-val02;
            Toast.makeText(this, "La resta es.."+Resultado, Toast.LENGTH_SHORT).show();
        }else{
            if(Tval1.isEmpty()==true) {
                val1.setError("Favor de llenar la casilla");
            }else {
                val2.setError("Favor de llenar la casilla");
            }
        }

    }

    public void MULTI(View boto4){
        Tval1=val1.getText().toString();
        Tval2=val2.getText().toString();
        if(Tval1.isEmpty()==false&&Tval2.isEmpty()==false) {
            val = Integer.parseInt(Tval1);
            val02 = Integer.parseInt(Tval2);
            Resultado = val * val02;
            Toast.makeText(this, "La Multriplicacion es.." + Resultado, Toast.LENGTH_SHORT).show();
        }else{
            if(Tval1.isEmpty()==true) {
                val1.setError("Favor de llenar la casilla");
            }else {
                val2.setError("Favor de llenar la casilla");
            }
        }
    }
    public void DIVI(View boto3){
        Tval1=val1.getText().toString();
        Tval2=val2.getText().toString();
        if(Tval1.isEmpty()==false&&Tval2.isEmpty()==false){
            val = Integer.parseInt(Tval1);
            val02 = Integer.parseInt(Tval2);
            int numero =Integer.parseInt(Tval1);
            int numero2 =Integer.parseInt(Tval2);
            if(numero==0||numero2==0){
                if(Tval1.isEmpty()==true) {
                    val1.setError("No se puede dividir entre 0");
                }else {
                    val2.setError("No se puede dividir entre 0");
                }
            }else {
                Resultado = val / val02;
                Toast.makeText(this, "La Divicion es.." + Resultado, Toast.LENGTH_SHORT).show();
            }
        }else{
            if(Tval1.isEmpty()==true) {
                val1.setError("Favor de llenar la casilla");
            }else {
                val2.setError("Favor de llenar la casilla");
            }
        }
    }
    /* public void REFRE(View refresss){
         frase=val1.getText().toString();
         frase2=val2.getText().toString();
        if(frase.isEmpty()==false){
        }else{
            val1.setError("Favor de llenar la casilla");Resultado=val+val02;
        }
        if(frase2.isEmpty()==false){
        }else{
            val2.setError("Favor de llenar la casilla");Resultado=val+val02;
        }
    }*/
}