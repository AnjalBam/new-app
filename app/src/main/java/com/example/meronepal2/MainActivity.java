package com.example.meronepal2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    private Button button;
    private Button button1;
    private Button button2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.historicalPlacesButton);
        button1 = findViewById(R.id.naturalPlacesButton);
        button2 = findViewById(R.id.refreshmentAndEntertainmentButton);

        TextView textView = findViewById(R.id.welcomeText);
        TextView textView1 = findViewById(R.id.decisionText);
        button.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

    }

    protected void setButton(Button button){

    }

    @Override
    public void onClick(View view) {
        int n = view.getId();
        if(n == R.id.historicalPlacesButton){
            startActivity(new Intent(this, HistoricalPlaces.class));
        }
        else if (n == R.id.naturalPlacesButton){
            startActivity(new Intent(this, NaturalPlaces.class));

        }
        else if (n == R.id.refreshmentAndEntertainmentButton){
            startActivity(new Intent(this, RefreshmentAndEntertainment.class));
        }

    }
}
