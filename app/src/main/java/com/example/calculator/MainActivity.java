package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button prog_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       prog_btn =(Button) findViewById(R.id.prog_btn);
       prog_btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               openNextActivity();
           }
       });
    }
    public void openNextActivity(){
        Intent intent = new Intent(this,Programmer.class);
        startActivity(intent);
    }

}