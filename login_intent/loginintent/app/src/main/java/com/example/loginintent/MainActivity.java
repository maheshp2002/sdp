package com.example.loginintent;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    Button ok;
    EditText name,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ok=findViewById(R.id.btn);
        //cancel=findViewById(R.id.cancel);
        name=findViewById(R.id.name);
        pass=findViewById(R.id.pass);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.getText().toString().equals("shalini") && (pass.getText().toString().equals("1234")))
                {
                    Intent intent =new Intent(MainActivity.this, home.class);
                    Bundle b=new Bundle();
                    b.putString("n",name.getText().toString());
                    b.putString("p",pass.getText().toString());
                    intent.putExtra("bsl",b);
                    startActivity(intent);
                }else{
                    AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("LOGIN FAILED");
                    builder.setTitle("Alert");
                    builder.show();
                    name.setText("");
                    pass.setText("");
                }
            }
        });
//        cancel.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                name.setText("");
//                pass.setText("");
//            }
//        });
    }
}
