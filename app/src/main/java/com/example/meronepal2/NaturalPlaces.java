package com.example.meronepal2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

import Adapters.NaturalPlacesAdapter;
import Datas.Data;

public class NaturalPlaces extends AppCompatActivity implements View.OnClickListener {


    List<Data> dataList = new ArrayList<>();
    public NaturalPlacesAdapter naturalPlacesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_natural_places);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView recyclerView = findViewById(R.id.naturalPlacesRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        dataList.add(new Data("Natural Places", android.R.drawable.btn_plus, "This is a natural place"));
        dataList.add(new Data("Natural Places", android.R.drawable.btn_plus, "This is a natural place"));
        dataList.add(new Data("Natural Places", android.R.drawable.btn_plus, "This is a natural place"));
        dataList.add(new Data("Natural Places", android.R.drawable.btn_plus, "This is a natural place"));
        dataList.add(new Data("Natural Places", android.R.drawable.btn_plus, "This is a natural place"));
        dataList.add(new Data("Natural Places", android.R.drawable.btn_plus, "This is a natural place"));
        dataList.add(new Data("Natural Places", android.R.drawable.btn_plus, "This is a natural place"));
        dataList.add(new Data("Natural Places", android.R.drawable.btn_plus, "This is a natural place"));
        dataList.add(new Data("Natural Places", android.R.drawable.btn_plus, "This is a natural place"));
        dataList.add(new Data("Natural Places", android.R.drawable.btn_plus, "This is a natural place"));
        dataList.add(new Data("Natural Places", android.R.drawable.btn_plus, "This is a natural place"));
        dataList.add(new Data("Natural Places", android.R.drawable.btn_plus, "This is a natural place"));
        dataList.add(new Data("Natural Places", android.R.drawable.btn_plus, "This is a natural place"));
        dataList.add(new Data("Natural Places", android.R.drawable.btn_plus, "This is a natural place"));
        dataList.add(new Data("Natural Places", android.R.drawable.btn_plus, "This is a natural place"));
        dataList.add(new Data("Natural Places", android.R.drawable.btn_plus, "This is a natural place"));
        dataList.add(new Data("Natural Places", android.R.drawable.btn_plus, "This is a natural place"));


        naturalPlacesAdapter = new NaturalPlacesAdapter(this, dataList);
        recyclerView.setAdapter(naturalPlacesAdapter);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public void onClick(View view) {

    }
}
