package com.example.calculatorintent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText num1;
    private EditText num2;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button button;
    private TextView result;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.toast);
        b.setOnClickListener(this);
        button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this ,SecondActivity.class);
                startActivity(intent);
            }
        });
        num1 = (EditText) findViewById(R.id.etNUM1);
        num2 = (EditText) findViewById(R.id.etNUM2);
        add = (Button) findViewById(R.id.btnADD);
        result = (TextView) findViewById(R.id.tvAnswer);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int sum = number1 + number2;
                result.setText("Answer: " + String.valueOf(sum));
            }
        });
    }
    public void btnsub(View view) {
        int number1 = Integer.parseInt(num1.getText().toString());
        int number2 = Integer.parseInt(num2.getText().toString());
        int sum = number1 - number2;
        result.setText("Answer: " + String.valueOf(sum));
    }
    public void btnmul(View view) {
        int number1 = Integer.parseInt(num1.getText().toString());
        int number2 = Integer.parseInt(num2.getText().toString());
        int sum = number1 * number2;
        result.setText("Answer: " + String.valueOf(sum));
    }
    public void btndiv(View view) {
        int number1 = Integer.parseInt(num1.getText().toString());
        int number2 = Integer.parseInt(num2.getText().toString());
        double sum = number1 / number2;
        result.setText("Answer: " + String.valueOf(sum));
    }
    public void btnTOAST(View view) {
    }
    @Override
    public void onClick(View view) {
        Toast.makeText(MainActivity.this,"YOU ARE NOOB!!",Toast.LENGTH_SHORT).show();
    }
}
