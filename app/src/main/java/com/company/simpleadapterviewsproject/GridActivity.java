package com.company.simpleadapterviewsproject;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class GridActivity extends AppCompatActivity {

    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        ArrayList<String> numbers=new ArrayList<String>();
        numbers.add(0,"Doctor");
        numbers.add(1,"Engineer");
        numbers.add(2,"Teacher");
        numbers.add(3,"Designer");
        numbers.add(4,"Nurse");
        numbers.add(5,"Dentist");
        numbers.add(6,"Therapist");

        gridView=(GridView) findViewById(R.id.gr);

        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this,R.layout.custom_grid,R.id.txt2,numbers);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(GridActivity.this,"grid item clicked",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
