package com.example.worksheet_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class userpage extends AppCompatActivity {


    //T

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userpage);
        TextView result=findViewById(R.id.result);
     //   TextView result2=findViewById(R.id.result2);
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            String name= bundle.getString("name");
            String contact= bundle.getString("contact");
            result.setText("Hello "+name+",we will contact you soon on you nember "+contact);
        }
    }
}