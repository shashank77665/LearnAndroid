package com.example.subjectlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_theory, btn_practical, btn_hybrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_theory = findViewById(R.id.btn_theory);
        btn_practical = findViewById(R.id.btn_practical);
        btn_hybrid = findViewById(R.id.btn_hybrid);

        loadfrag(new Theory(), 0);

        btn_theory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadfrag(new Theory(), 1);
            }
        });

        btn_practical.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadfrag(new Practical(), 1);
            }
        }));

        btn_hybrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadfrag(new Hybrid(), 1);
            }
        });

    }

    public void loadfrag(Fragment fragment, int flag) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        if (flag == 0)
            ft.add(R.id.container, fragment);
        else
            ft.replace(R.id.container, fragment);

        ft.commit();
    }
}
