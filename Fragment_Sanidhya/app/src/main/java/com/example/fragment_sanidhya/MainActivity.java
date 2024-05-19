package com.example.fragment_sanidhya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btn_fragment1,btn_fragment2;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_fragment1=findViewById(R.id.btn_fragment1);
        btn_fragment2=findViewById(R.id.btn_fragment2);

        loadfragment(new Fragment1(),0);

        btn_fragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadfragment(new Fragment1(),1);
            }
        });

        btn_fragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadfragment(new Fragment2(),1);
            }
        });
    }

    public void loadfragment(Fragment fragment,int flag){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();

        if(flag==0)
            ft.add(R.id.container,fragment);
        else
            ft.replace(R.id.container, fragment);
        ft.commit();
    }
}