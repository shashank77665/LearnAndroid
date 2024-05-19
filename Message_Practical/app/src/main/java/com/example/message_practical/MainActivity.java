package com.example.message_practical;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText phone_no,message;
    Button btn_submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phone_no=findViewById(R.id.phone_no);
        message=findViewById(R.id.message);
        btn_submit=findViewById(R.id.btn_send);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
                    if(checkSelfPermission(android.Manifest.permission.SEND_SMS)== PackageManager.PERMISSION_GRANTED){
                        sendSMS();
                    }
                    else {
                        requestPermissions(new String[]{Manifest.permission.SEND_SMS},1);
                    }
                }

                phone_no.setText("");
                message.setText("");


            }
        });
    }

    private void sendSMS(){
        String PhoneNo=phone_no.getText().toString();
        String Message=message.getText().toString();


        try{
            SmsManager smsManager=SmsManager.getDefault();
            smsManager.sendTextMessage(PhoneNo,null,Message,null,null);
            Toast.makeText(this, "Sent Successfully", Toast.LENGTH_SHORT).show();
        }

        catch(Exception e){
            e.printStackTrace();
            Toast.makeText(this, "Failed to Send SMS", Toast.LENGTH_SHORT).show();
        }
    }
}