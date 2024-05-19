package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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

        Toast toast = Toast.makeText(this,"Reset Sucessfull",Toast.LENGTH_LONG);


        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname=username.getText().toString();
                String cont=contact.getText().toString();

                Intent intent=new Intent(MainActivity.this, userpage.class);


                intent.putExtras("icontact",cont);

                startActivity(intent);
            }
        });

        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username.setText("");
                contact.setText("");
                toast.show();
            }
        });
    }
}