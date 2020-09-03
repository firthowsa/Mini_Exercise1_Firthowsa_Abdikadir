package com.example.mini_exercise1_firthowsa_abdikadir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    private Button returnToMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        returnToMain=findViewById(R.id.button5);
        returnToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainScreen();
            }
        });

    }

    public void openMainScreen(){
        Intent intent4=new Intent(this,MainActivity.class);
        startActivity(intent4);
    }
}
