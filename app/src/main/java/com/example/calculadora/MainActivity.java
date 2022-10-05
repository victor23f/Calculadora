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
import android.view.inputmethod.InputMethodManager;
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

        InputMethodManager miteclado = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
        miteclado.hideSoftInputFromWindow(operando1.getWindowToken(),0);
        miteclado.hideSoftInputFromWindow(operando2.getWindowToken(),0);

        try{
        operand1=Integer.parseInt(operando1.getText().toString());
        operand2=Integer.parseInt(operando2.getText().toString());
        resultadoTexto.setText(""+(operand1+operand2));
        }catch (NumberFormatException Nfe){
            resultadoTexto.setText("Por favor, introduzca un numero");
        }
    }

    public void resta(View vista){
        EditText operando1= (EditText) findViewById(R.id.ContenidoOperando1);
        EditText operando2 = (EditText) findViewById(R.id.ContenidoOperando2);

        InputMethodManager miteclado = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
        miteclado.hideSoftInputFromWindow(operando1.getWindowToken(),0);
        miteclado.hideSoftInputFromWindow(operando2.getWindowToken(),0);

        try{
         operand1=Double.parseDouble(operando1.getText().toString());
         operand2=Double.parseDouble(operando2.getText().toString());
        resultadoTexto.setText(""+(operand1-operand2));
        }catch (NumberFormatException Nfe){
            resultadoTexto.setText("Por favor, introduzca un numero");
        }
    }

    public void multiplicacion(View vista){
        EditText operando1= (EditText) findViewById(R.id.ContenidoOperando1);
        EditText operando2 = (EditText) findViewById(R.id.ContenidoOperando2);

        InputMethodManager miteclado = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
        miteclado.hideSoftInputFromWindow(operando1.getWindowToken(),0);
        miteclado.hideSoftInputFromWindow(operando2.getWindowToken(),0);

        try{
         operand1=Double.parseDouble(operando1.getText().toString());
         operand2=Double.parseDouble(operando2.getText().toString());
        resultadoTexto.setText(""+(operand1*operand2));
        }catch (NumberFormatException Nfe){
            resultadoTexto.setText("Por favor, introduzca un numero");
        }
    }

    public void division(View vista){
        EditText operando1= (EditText) findViewById(R.id.ContenidoOperando1);
        EditText operando2 = (EditText) findViewById(R.id.ContenidoOperando2);

        String compruebaO1 = String.valueOf((EditText) findViewById(R.id.ContenidoOperando1));
        String compruebaO2 = String.valueOf((EditText) findViewById(R.id.ContenidoOperando1));

        InputMethodManager miteclado = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
        miteclado.hideSoftInputFromWindow(operando1.getWindowToken(),0);
        miteclado.hideSoftInputFromWindow(operando2.getWindowToken(),0);

        try {
        operand1 = Double.parseDouble(operando1.getText().toString());
        operand2 = Double.parseDouble(operando2.getText().toString());
            System.out.println("Esta lleno");
            if (operand2 != 0) {
                resultadoTexto.setText("" + (operand1 / operand2));
            } else {
                resultadoTexto.setText("NO SE PUEDE DIVIDIR ENTRE 0!!");
            }
        }catch (NumberFormatException Nfe){
            resultadoTexto.setText("Por favor, introduzca un numero");
        }
    }


}