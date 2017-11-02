package com.example.gim_yongjun.card_news;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class Genre extends AppCompatActivity {
    GridView gridview;
    ArrayList<Data> arrayList = new ArrayList<Data>();
    ArrayAdapter<Data> arrayAdapter;
    My_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre);
        init();
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Genre.this, arrayList.get(i).getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    void init(){
        gridview = (GridView)findViewById(R.id.grid1);
        arrayList.add(new Data("Avocado",R.drawable.catal));
        adapter = new My_Adapter(arrayList,Genre.this);
        gridview.setAdapter(adapter);
    }
}
