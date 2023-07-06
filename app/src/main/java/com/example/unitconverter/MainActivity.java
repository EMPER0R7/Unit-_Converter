package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView hd,t2;
    Button bt;
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hd=findViewById(R.id.heading);
        t2=findViewById(R.id.textView2);
        bt=findViewById(R.id.button);
        et=findViewById(R.id.editText);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double convert=Double.parseDouble(et.getText().toString());
                convert_kilos(convert);
                t2.setText(" "+convert_kilos(convert)+ "lbs");
            }
        });
    }public double convert_kilos(double kilos){
        double pound=kilos*2.20462;
        return pound;

    }
}