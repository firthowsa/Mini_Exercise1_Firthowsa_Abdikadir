package com.example.mini_exercise1_firthowsa_abdikadir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button image1;
    private Button image2;
    private Button image3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image1=(Button) findViewById(R.id.button2);


        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openImage1();
            }
        });
        image2=(Button) findViewById(R.id.button);
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openImage2();
            }
        });
        image3=findViewById(R.id.button3);
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openImage3();
            }
        });
    }
    public void openImage1(){
        Intent intent =new Intent(this,Main2Activity.class);
        startActivity(intent);
    }

    public void openImage2(){
        Intent intent2=new Intent(this,Main3Activity.class);
        startActivity(intent2);
    }

    public void openImage3(){
        Intent intent3=new Intent(this,Main4Activity.class);
        startActivity(intent3);
    }
}
