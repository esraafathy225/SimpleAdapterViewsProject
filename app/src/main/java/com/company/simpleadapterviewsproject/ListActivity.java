package com.company.simpleadapterviewsproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    Button button;
    ListView listView;
    EditText editText;
    ArrayList<String> names;
    ArrayAdapter<String> adapter;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        button= findViewById(R.id.btn1);
        editText=findViewById(R.id.edit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ListActivity.this,SpinnerActivity.class);
                startActivity(i);
            }
        });

        names=new ArrayList<String>();


        names.add(0,"Justin Mathews");
        names.add(1,"Myla Micheal");
        names.add(2,"Celia Ware");
        names.add(3,"Stella Carter");
        names.add(4,"Wendy Anthony");
        names.add(5,"Agustin Casey");
        names.add(6,"Carina Benson");
        names.add(7,"Isaac Gonzales");
        names.add(8,"Jagger Mills");
        names.add(9,"Sofia Bush");

        listView=findViewById(R.id.list1);

        adapter =new ArrayAdapter<>(this,R.layout.custom_row,R.id.txt,names);

        //Call getView method
        // Call layout resource
        // Call textview id
        // set String into textview
        listView.setAdapter(adapter);

        imageView=findViewById(R.id.img);
        editText=findViewById(R.id.edit);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                names.add(editText.getText().toString().trim());
                adapter.notifyDataSetChanged();
                editText.getText().clear();
            }
        });


    }
}
