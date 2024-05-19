package com.example.exp_2_class;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText contact;
    Button submit;
    Button reset;

    TextView UserName;
    TextView Contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        contact=findViewById(R.id.contact);
        UserName=findViewById(R.id.view_name);
        Contact=findViewById(R.id.view_contact);
        submit=findViewById(R.id.submit);
        reset=findViewById(R.id.reset);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=name.getText().toString();
                String usercontact=name.getText().toString();
                UserName.setText(username);
                //Contact.setText(Contact);
            }
        });



    }
}