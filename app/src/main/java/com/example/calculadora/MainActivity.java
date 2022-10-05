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


    private EditText operando1= (EditText) findViewById(R.id.ContenidoOperando1);
    private EditText operando2 = (EditText) findViewById(R.id.ContenidoOperando2);
    private TextView resultadoTexto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
        resultadoTexto=(TextView)findViewById(R.id.Resultado);

    }
    private void suma(View vista){
      int operand1=Integer.parseInt(operando1.getText().toString());
      int operand2=Integer.parseInt(operando2.getText().toString());
        resultadoTexto.setText(""+operand1+operand2);
    }


}