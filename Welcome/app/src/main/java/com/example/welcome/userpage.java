package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class userpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userpage);
        TextView result=findViewById(R.id.result);
        Bundle extras=getIntent().getExtras();
        String rname=extras.getString("isername");
        String rcontact= extras.getString("icontact");

        result.setText(rname+rcontact);
    }
}