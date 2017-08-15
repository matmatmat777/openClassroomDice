package com.example.mathieu.magicdyce;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.security.SecureRandom;

public class MagicDyceActivity extends Activity implements View.OnClickListener {

    private TextView textViewResult;

    private int max;


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_magic_dyce);


        max = getIntent().getIntExtra("max", 0);


        TextView textTitle = (TextView) findViewById(R.id.textViewTitle);

        textTitle.setText(max + " sided dice");


        textViewResult = ((TextView) findViewById(R.id.textViewResult));

        textViewResult.setText("");


        Button buttonRoll = (Button) findViewById(R.id.buttonRoll);

        buttonRoll.setOnClickListener(this);

    }


    @Override

    public void onClick(View v) {

        SecureRandom random = new SecureRandom();

        int result = random.nextInt(max) + 1;

        textViewResult.setText(String.valueOf(result));

    }
}
