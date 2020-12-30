package com.example.readandplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class welcome extends AppCompatActivity {
    private Button button;
    private Button playbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

    @Override
    public void onClick(View view) {
        Intent intent=new Intent(welcome.this, MainActivity.class);
        startActivity(intent);
        }
    });

        button=(Button)findViewById(R.id.playbutton);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(welcome.this, Main3Activity.class);
                startActivity(intent1);
            }
        });





    }
}