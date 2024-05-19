package com.example.toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
     //   toolbar.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_light));
        getSupportActionBar().setTitle("My ToolBar");

//        if(getSupportActionBar()!=null){
//           // getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//            getSupportActionBar().setTitle("My ToolBar");
//        }


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.opt_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int itemId = item.getItemId();

        if(itemId==R.id.opt_new){
            Toast.makeText(this,"Creates New File",Toast.LENGTH_SHORT).show();
        } else if (itemId==R.id.opt_user) {
            Toast.makeText(this,"Hello User",Toast.LENGTH_SHORT).show();
        } else if (itemId==R.id.opt_save) {
            Toast.makeText(this,"File Saved",Toast.LENGTH_SHORT).show();
        }


        return super.onOptionsItemSelected(item);
    }
}