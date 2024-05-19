package com.example.exp9;
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
        toolbar=findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("My Tool Bar");
        toolbar.setSubtitle("Subtitle");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int item_id = item.getItemId();
        if(item_id==R.id.item1){
            Toast.makeText(this,"New is clicked",Toast.LENGTH_LONG).show();
        } else if (item_id==R.id.item2) {
            Toast.makeText(this,"open is clicked",Toast.LENGTH_LONG).show();
        }

 else{
            Toast.makeText(this,"save is clicked",Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
