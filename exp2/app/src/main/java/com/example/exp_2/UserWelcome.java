package com.example.exp_2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class UserWelcome extends AppCompatActivity {

    TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_welcome);

        name = findViewById(R.id.welcomemsg);

        Intent intent = getIntent();
        String getName = intent.getStringExtra("name");
        name.setText(getName);

    }
}