package com.example.risenggono;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Dzikir extends AppCompatActivity implements View.OnClickListener{

    int angka=0;
    TextView textView9;
    TextView txtDzikir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dzikir);


        textView9 = (TextView) findViewById(R.id.textView9);
        txtDzikir = (TextView) findViewById(R.id.textView8  );
        textView9.setOnClickListener(this);

    }

    public void onClick(View view){

        switch(view.getId()){
            case R.id.textView9:
            angka++;
            txtDzikir.setText(String.valueOf(angka));
            break;

        }

    }

}

