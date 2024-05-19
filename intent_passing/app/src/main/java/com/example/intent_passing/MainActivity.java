package com.example.intent_passing;

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
        EditText username=findViewById(R.id.username);
        EditText contact=findViewById(R.id.contact);
        Button btn_submit=findViewById(R.id.btn_submit);
        Button btn_reset=findViewById(R.id.btn_reset);
        TextView result=findViewById(R.id.result);
        Button btn_next=findViewById(R.id.btn_next);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res=username.getText().toString();
                String con=contact.getText().toString();
                result.setText("Hi "+res+",we will ontact you on"+con);
            }
        });

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=username.getText().toString();
                String cont=contact.getText().toString();

                Bundle bundle=new Bundle();
                bundle.putString("user",user);
                bundle.putString("cont",cont);
                Intent next=new Intent(MainActivity.this, userpage.class);
                next.putExtras(bundle);
                startActivity(next);
            }
        });




        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username.setText("");
                contact.setText("");
                Toast.makeText(MainActivity.this, "Reset Sucessfull", Toast.LENGTH_SHORT).show();
            }
        });

    }
}