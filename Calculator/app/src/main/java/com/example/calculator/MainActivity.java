package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView view;
    double a = 0.0;
    double b = 0.0;
    double resultado = 0.0;
    int op = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view=findViewById(R.id.pantalla);
    }

    public void calcula(View v){
        Button boton = (Button) v;
        String interaccion = (String) boton.getContentDescription();
        switch(interaccion){
            case "1":
                view.setText(view.getText() + "1");
                break;
            case "2":
                view.setText(view.getText() + "2");
                break;
            case "3":
                view.setText(view.getText() + "3");
                break;
            case "4":
                view.setText(view.getText() + "4");
                break;
            case "5":
                view.setText(view.getText() + "5");
                break;
            case "6":
                view.setText(view.getText() + "6");
                break;
            case "7":
                view.setText(view.getText() + "7");
                break;
            case "8":
                view.setText(view.getText() + "8");
                break;
            case "9":
                view.setText(view.getText() + "9");
                break;
            case "0":
                view.setText(view.getText() + "0");
                break;
            case ".":
                view.setText(view.getText() + ".");
                break;
            case "+":
                try{a = Double.parseDouble(view.getText().toString());
                    op = 1;}catch (Exception e){
                    Toast.makeText(this, "Ha ocurrido un error, intenta de nuevo",Toast.LENGTH_LONG).show();}
                view.setText("");
                break;
            case "-":
                try{a = Double.parseDouble(view.getText().toString());
                    op = 2;}catch (Exception e){
                    Toast.makeText(this, "Ha ocurrido un error, intenta de nuevo",Toast.LENGTH_LONG).show();}
                view.setText("");
                break;
            case "div":
                try{a = Double.parseDouble(view.getText()+"");
                    op = 3;}catch (Exception e){
                    Toast.makeText(this, "Ha ocurrido un error, intenta de nuevo",Toast.LENGTH_LONG).show();}
                view.setText("");
                break;
            case "x":
                try{a = Double.parseDouble(view.getText().toString());
                    op = 4;}catch (Exception e){
                Toast.makeText(this, "Ha ocurrido un error, intenta de nuevo",Toast.LENGTH_LONG).show();}
                view.setText("");
                break;
            case "=":
                try{b = Double.parseDouble(view.getText().toString());}catch (Exception e){
                    Toast.makeText(this, "Ha ocurrido un error, intenta de nuevo",Toast.LENGTH_LONG).show();
                    view.setText(e.getMessage());}
                switch(op){
                    case 1:
                        resultado = a+b;
                        break;
                    case 2:
                        resultado = a-b;
                        break;
                    case 3:
                        resultado = a/b;
                        break;
                    case 4:
                        resultado = a*b;
                        break;
                }
                view.setText(resultado + "");
                break;
            case "c":
                view.setText("");
                break;
        }
    }
}