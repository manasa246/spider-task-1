package com.example.spidertasklevel1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static java.lang.Double.*;
import static java.lang.Math.pow;
import static java.lang.StrictMath.sqrt;



public class MainActivity extends AppCompatActivity {

    TextView result;
    double velocity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_first);
        EditText input = findViewById(R.id.input);
        Button answer = findViewById(R.id.button);
        result = findViewById(R.id.result);

        answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double velocity = Double.parseDouble(input.getText().toString());

                if (velocity>300000000){
                    Toast.makeText(MainActivity.this, "invalid input", Toast.LENGTH_SHORT).show();}
                else{ Lorentzfactor(velocity);}
            }
        });
    }
    void Lorentzfactor(double v){
        double c = (double) (3*(pow (10,8)));
        double L = 1/(sqrt(1-(pow(v,2)/pow(c,2))));
        result.setText(String.valueOf(L)); }

}