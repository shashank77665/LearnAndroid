package com.example.worksheet_2;

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
        EditText usercontact=findViewById(R.id.usercontact);

        Button submitbtn=findViewById(R.id.submitbtn);
        Button resetbtn=findViewById(R.id.resetbtn);

       Toast toast= Toast.makeText(this , "Reset Successful", Toast.LENGTH_LONG);

        submitbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String name=username.getText().toString();
                String contact=usercontact.getText().toString();

                Bundle bundle=new Bundle();
                bundle.putString("name",name);
                bundle.putString("contact",contact);

                Intent intent = new Intent(MainActivity.this,userpage.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        resetbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                username.setText("");
                usercontact.setText("");
                toast.show();
            }
        });
    }
}