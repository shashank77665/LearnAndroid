package com.example.intent_passing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class userpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userpage);
        TextView user_result=findViewById(R.id.user_result);
        Bundle bundle=getIntent().getExtras();
        String rusername=bundle.getString("user");
        String rcontact= bundle.getString("cont");
        user_result.setText("Hi "+rusername+" ,we will contact you soon on"+rcontact);
    }
}