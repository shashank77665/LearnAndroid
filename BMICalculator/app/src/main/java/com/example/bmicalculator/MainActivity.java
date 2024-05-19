package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtResult;
    EditText edtWeight,edtHeightFt,edtHeightIn;

    Button btnCalculate,btnReset;

    LinearLayout llMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult=findViewById(R.id.txtResult);
        edtWeight=findViewById(R.id.edtWeight);
        edtHeightFt=findViewById(R.id.edtHeightFt);
        edtHeightIn=findViewById(R.id.edtHeightIn);
        btnCalculate=findViewById(R.id.btncalculate);
        btnReset=findViewById(R.id.btnreset);
        llMain=findViewById(R.id.llMain);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int wt =Integer.parseInt(edtWeight.getText().toString());
                int ft = Integer.parseInt(edtHeightFt.getText().toString());
                int in = Integer.parseInt(edtHeightIn.getText().toString());

                int totalIn = ft*12 +in;
                double totalCm = totalIn*2.53;
                double totalM=totalCm/100;
                double bmi=wt/(totalM*totalM);
                String formattedBMI = String.format("%.2f", bmi);

                if(bmi>25){
                    txtResult.setText("You are Overweight, your BMI is "+formattedBMI);
                    llMain.setBackgroundColor(getResources().getColor(R.color.colorOW));
                } else if (bmi<18) {
                    txtResult.setText("You are Underweight, your BMI is "+formattedBMI);
                    llMain.setBackgroundColor(getResources().getColor(R.color.colorUW));
                }
                else{
                    txtResult.setText("You are Healthy, your BMI is "+formattedBMI);
                    llMain.setBackgroundColor(getResources().getColor(R.color.colorH));
                }

            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtWeight.setText("");
                edtHeightFt.setText("");
                edtHeightIn.setText("");
                txtResult.setText("");
                llMain.setBackgroundColor(getResources().getColor(R.color.white));
            }
        });
    }
}