package com.example.mathieu.magicdyce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    TextView textViewTitle;
    Button button6;
    Button button20;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewTitle = (TextView)findViewById(R.id.textViewTitle);

        button6 = (Button)findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MagicDyceActivity.class);
                intent.putExtra("max", 6);
                startActivity(intent);

            }

        });

        button20 = (Button)findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MagicDyceActivity.class);
                intent.putExtra("max", 20);
                startActivity(intent);

            }

        });


    }


}
