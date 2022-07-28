package com.example.loginintent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
public class home extends AppCompatActivity {
    TextView txt1,txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Intent intent=getIntent();
        Bundle b=intent.getBundleExtra("bsl");
        String name=b.getString("n");
        String pass=b.getString("p");
        txt1=findViewById(R.id.textView2);
        txt2=findViewById(R.id.textView3);
        txt1.setText("Name :"+name);
        txt2.setText("Password :"+pass);
    }
}
