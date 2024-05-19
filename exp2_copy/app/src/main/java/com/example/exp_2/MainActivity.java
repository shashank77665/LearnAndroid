package com.example.exp_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

        EditText namevalue;
        EditText contactvalue;
        TextView welcomeins;

        namevalue = findViewById(R.id.namevalue);
        contactvalue=findViewById(R.id.contactvalue);
        Button submitname = findViewById(R.id.submitname);
        Button resetbn = findViewById(R.id.resetbtn);



        Intent intent = new Intent(MainActivity.this, UserWelcome.class);

        int duration=Toast.LENGTH_SHORT;
        Toast toast=Toast.makeText(this,"Reset Sucessfull",Toast.LENGTH_SHORT);

        submitname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user = namevalue.getText().toString();

                Intent intent = new Intent(MainActivity.this, UserWelcome.class);
                intent.putExtra("name",user);
                startActivity(intent);
            }
        });

        resetbn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                namevalue.setText("");
               contactvalue.setText("");
               toast.show();

            }
        });



    }
}