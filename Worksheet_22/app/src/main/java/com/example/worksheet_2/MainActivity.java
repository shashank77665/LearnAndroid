package com.example.worksheet_2;

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

        Button btn_submit=findViewById(R.id.submitbtn);
        Button btn_reset=findViewById(R.id.resetbtn);
        TextView result = findViewById(R.id.result);
        EditText username= findViewById(R.id.username);
        EditText contact=findViewById(R.id.contact);

        Toast resettoast=Toast.makeText(this,"Reset Sucessfull",Toast.LENGTH_LONG);

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
                result.setText("Hi "+rusername+" ,We will Contact you soon on "+rcontact);
            }
        });
    }
}