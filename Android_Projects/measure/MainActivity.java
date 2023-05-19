package com.example.measure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView3;
    private EditText editTextNumberDecimal;
    private EditText editTextNumbDecimal2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView3 = findViewById(R.id.textView3);
        editTextNumberDecimal = findViewById(R.id.editTextNumberDecimal);
        editTextNumbDecimal2 = findViewById(R.id.editTextNumbDecimal2);
//          button.setOnClickListener(new View.OnClickListener() {
//              @Override
//              public void onClick(View view) {
//
////                  Toast.makeText(MainActivity.this, "Hi click listener worked!", Toast.LENGTH_SHORT).show();
//                  String w = editTextNumberDecimal.getText().toString();
//                  String h = editTextNumbDecimal2.getText().toString();
//                  double weight = Double.parseDouble(w);
//                  double height = Double.parseDouble(h);
//
//                   double pound = (height*height);
//                  double dd= weight/pound;
//                  if(dd>=18 && dd<=25) {
//                      textView3.setText("Your BMI is"+" " + String.format("%.2f",dd) +"\n"+ "You are fit");
//                  }
//                  else if(dd<18){
//                      textView3.setText("Your BMI is "+" " + String.format("%.2f",dd) +"\n" + "You are under Weight");
//                  }
//                  else{
//                      textView3.setText("Your BMI is "+" " + String.format("%.2f",dd) +"\n" + "You are OverWeight");
//                  }
//              }
//          });
    }
    public void calculate(View view){
        String w = editTextNumberDecimal.getText().toString();
        String h = editTextNumbDecimal2.getText().toString();
        double weight = Double.parseDouble(w);
        double height = Double.parseDouble(h);

        double pound = (height*height);
        double dd= weight/pound;
        if(dd>=18 && dd<=25) {
            textView3.setText("Your BMI is"+" " + String.format("%.2f",dd) +"\n"+ "You are fit");
        }
        else if(dd<18){
            textView3.setText("Your BMI is "+" " + String.format("%.2f",dd) +"\n" + "You are under Weight");
        }
        else{
            textView3.setText("Your BMI is "+" " + String.format("%.2f",dd) +"\n" + "You are OverWeight");
        }
    }
}