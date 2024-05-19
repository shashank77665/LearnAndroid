package com.example.exp_5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_submit=findViewById(R.id.btn_submit);
        Button btn_clear=findViewById(R.id.btn_clear);
        RadioGroup session=findViewById(R.id.session);
        TextView result=findViewById(R.id.result);
        final RadioButton[] radiobutton = new RadioButton[1];
        CheckBox course1=findViewById(R.id.course1);
        CheckBox course2=findViewById(R.id.course2);
        CheckBox course3=findViewById(R.id.course3);
        CheckBox course4=findViewById(R.id.course4);
        EditText name=findViewById(R.id.name);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int id=session.getCheckedRadioButtonId();
               radiobutton[0] =findViewById(id);
               String username=name.getText().toString();

               String Selectedcourse1,Selectedcourse2,Selectedcourse3,Selectedcourse4;
               if (course1.isChecked()){
                   Selectedcourse1=course1.getText().toString();
               }
               else Selectedcourse1=" ";

                if (course2.isChecked()){
                    Selectedcourse2=course2.getText().toString();
                }
                else Selectedcourse2=" ";

                if (course3.isChecked()){
                    Selectedcourse3=course3.getText().toString();
                }
                else Selectedcourse3=" ";

                if (course4.isChecked()){
                    Selectedcourse4=course4.getText().toString();
                }
                else Selectedcourse4=" ";

                result.setText("Hi "+username+",you had selected "+Selectedcourse1+Selectedcourse2+Selectedcourse3+Selectedcourse4+" as your preferred course and you had selected "+radiobutton[0].getText()+" Session");
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setText("");
                course1.setChecked(false);
                course2.setChecked(false);
                course3.setChecked(false);
                course4.setChecked(false);
                session.clearCheck();
                result.setText("");

            }
        });
    }
}