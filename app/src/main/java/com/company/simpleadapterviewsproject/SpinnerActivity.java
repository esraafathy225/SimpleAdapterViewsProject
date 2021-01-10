package com.company.simpleadapterviewsproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SpinnerActivity extends AppCompatActivity {
    Button button2;
    Spinner spinner;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        button2= findViewById(R.id.btn2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SpinnerActivity.this,GridActivity.class);
                startActivity(intent);
            }
        });
        ArrayList<String> countries=new ArrayList<String>();
        countries.add(0,"United States" );
        countries.add(1,"Australia");
        countries.add(2,"Brazil");
        countries.add(3,"China");
        countries.add(4,"England");
        countries.add(5,"Egypt");
        countries.add(6,"Japan");



        spinner= findViewById(R.id.spn);
        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this,R.layout.custom_spinner,R.id.txt,countries);
        spinner.setAdapter(adapter);




    }
}
