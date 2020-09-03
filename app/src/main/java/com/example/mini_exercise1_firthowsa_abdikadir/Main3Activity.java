package com.example.mini_exercise1_firthowsa_abdikadir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
    private Button returnToMain1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        returnToMain1=findViewById(R.id.button4);
        returnToMain1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain2();
            }
        });
    }
    public void openMain2(){
        Intent intent5=new Intent(this,MainActivity.class);
        startActivity(intent5);
    }
}
