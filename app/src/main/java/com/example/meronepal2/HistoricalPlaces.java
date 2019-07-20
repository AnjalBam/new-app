package com.example.meronepal2;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Adapters.HistoricalPlacesAdapter;
import Datas.Data;

public class HistoricalPlaces extends AppCompatActivity {
    List<Data> dataList = new ArrayList<>();
    public HistoricalPlacesAdapter historicalPlacesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historical_places);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        dataList.add(new Data("Historical Place", R.drawable.ic_launcher_foreground, "This is a Historical placa."));
        dataList.add(new Data("Historical Place", R.drawable.ic_launcher_foreground, "This is a Historical placa."));
        dataList.add(new Data("Historical Place", R.drawable.ic_launcher_foreground, "This is a Historical placa."));
        dataList.add(new Data("Historical Place", R.drawable.ic_launcher_foreground, "This is a Historical placa."));
        dataList.add(new Data("Historical Place", R.drawable.ic_launcher_foreground, "This is a Historical placa."));
        dataList.add(new Data("Historical Place", R.drawable.ic_launcher_foreground, "This is a Historical placa."));
        dataList.add(new Data("Historical Place", R.drawable.ic_launcher_foreground, "This is a Historical placa."));
        dataList.add(new Data("Historical Place", R.drawable.ic_launcher_foreground, "This is a Historical placa."));
        dataList.add(new Data("Historical Place", R.drawable.ic_launcher_foreground, "This is a Historical placa."));
        dataList.add(new Data("Historical Place", R.drawable.ic_launcher_foreground, "This is a Historical placa."));
        dataList.add(new Data("Historical Place", R.drawable.ic_launcher_foreground, "This is a Historical placa."));
        dataList.add(new Data("Historical Place", R.drawable.ic_launcher_foreground, "This is a Historical placa."));
        dataList.add(new Data("Historical Place", R.drawable.ic_launcher_foreground, "This is a Historical placa."));
        historicalPlacesAdapter = new HistoricalPlacesAdapter(this, dataList);
        recyclerView.setAdapter(historicalPlacesAdapter);


//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

}
