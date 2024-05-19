package com.example.whatsapptoolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
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



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.group){
            Toast.makeText(this,"Create a Group",Toast.LENGTH_SHORT).show();
        }
        if (id==R.id.broadcast){
            Toast.makeText(this,"Create a Broadcast",Toast.LENGTH_SHORT).show();
        }
        if (id==R.id.setting){
            Toast.makeText(this,"Setting",Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}