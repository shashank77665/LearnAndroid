package com.example.anurag_exp_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText username=findViewById(R.id.username);
        EditText contact=findViewById(R.id.contact);
        Button btn_submit=findViewById(R.id.btn_submit);
        Button btn_reset=findViewById(R.id.btn_reset);
        TextView result=findViewById(R.id.result);
        Toast resettoast= Toast.makeText(this,"Reset Sucessfull",Toast.LENGTH_LONG);
        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username.setText("");
                contact.setText("");
                resettoast.show();
            }
        });

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rusername=username.getText().toString();
                String rcontact=contact.getText().toString();
                result.setText("Hi "+rusername+", We will contact you on"+rcontact);
            }
        });
    }
}