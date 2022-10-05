package com.example.calculadora;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.calculadora.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {


    public EditText operando1;
    public EditText operando2;
    public double operand1;
    public double operand2;
    public TextView resultadoTexto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
        resultadoTexto=(TextView)findViewById(R.id.Resultado);

    }
    public void suma(View vista){
        EditText operando1= (EditText) findViewById(R.id.ContenidoOperando1);
        EditText operando2 = (EditText) findViewById(R.id.ContenidoOperando2);
       operand1=Integer.parseInt(operando1.getText().toString());
      operand2=Integer.parseInt(operando2.getText().toString());
        resultadoTexto.setText(""+(operand1+operand2));
    }

    public void resta(View vista){
        EditText operando1= (EditText) findViewById(R.id.ContenidoOperando1);
        EditText operando2 = (EditText) findViewById(R.id.ContenidoOperando2);
         operand1=Double.parseDouble(operando1.getText().toString());
         operand2=Double.parseDouble(operando2.getText().toString());
        resultadoTexto.setText(""+(operand1-operand2));
    }

    public void multiplicacion(View vista){
        EditText operando1= (EditText) findViewById(R.id.ContenidoOperando1);
        EditText operando2 = (EditText) findViewById(R.id.ContenidoOperando2);
         operand1=Double.parseDouble(operando1.getText().toString());
         operand2=Double.parseDouble(operando2.getText().toString());
        resultadoTexto.setText(""+(operand1*operand2));
    }

    public void division(View vista){
        EditText operando1= (EditText) findViewById(R.id.ContenidoOperando1);
        EditText operando2 = (EditText) findViewById(R.id.ContenidoOperando2);

            operand1 = Double.parseDouble(operando1.getText().toString());
            operand2 = Double.parseDouble(operando2.getText().toString());
        if(operando1.getText().toString().isEmpty()) {
            if (operand2 == 0) {
                resultadoTexto.setText("NO SE PUEDE DIVIDIR ENTRE 0!!");

            } else {
                resultadoTexto.setText("" + (operand1 / operand2));
            }
        }else{
            resultadoTexto.setText("Por favor, introduce un numero para poder operar!!");
        }
    }


}