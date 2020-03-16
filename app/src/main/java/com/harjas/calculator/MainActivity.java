package com.harjas.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.editText);
        e2=findViewById(R.id.editText2);
        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                final int number1=Integer.parseInt(s1);
                final int number2=Integer.parseInt(s2);
                int num=number1+number2;
                Toast.makeText(getApplicationContext(),"Sum is "+num, Toast.LENGTH_LONG).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                final int number1=Integer.parseInt(s1);
                final int number2=Integer.parseInt(s2);
                int num=number1-number2;
                Toast.makeText(getApplicationContext(),"Diffrence is "+num, Toast.LENGTH_LONG).show();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                final int number1=Integer.parseInt(s1);
                final int number2=Integer.parseInt(s2);
                int num=number1*number2;
                Toast.makeText(getApplicationContext(),"Product is "+num, Toast.LENGTH_LONG).show();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                final int number1=Integer.parseInt(s1);
                final int number2=Integer.parseInt(s2);
                int num=number1/number2;
                Toast.makeText(getApplicationContext(),"Quotient is "+num, Toast.LENGTH_LONG).show();
            }
        });
    }
}
