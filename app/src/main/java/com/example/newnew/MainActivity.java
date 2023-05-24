package com.example.newnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {


    private EditText age;
    private EditText rost;
    private EditText telefon;
    private EditText Name;
    private EditText ves;
    private EditText pol;
    private EditText email;
    private String Age;
    private String Rost;
    private String Telefon;
    private String name;
    private String Ves;
    private String Pol;
    private String Email;
    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        age = findViewById(R.id.age);
        rost = findViewById(R.id.rost);
        telefon = findViewById(R.id.telefon);
        Name = findViewById(R.id.Name);
        ves = findViewById(R.id.ves);
        pol = findViewById(R.id.pol);
        email = findViewById(R.id.email);
        button.setOnClickListener(listener);

    }
    private View.OnClickListener listener = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Age = age.getText().toString();
            Rost = rost.getText().toString();
            name = Name.getText().toString();
            Telefon = telefon.getText().toString();
            Pol = pol.getText().toString();
            Email = email.getText().toString();
            Ves = ves.getText().toString();



        }


    };
}