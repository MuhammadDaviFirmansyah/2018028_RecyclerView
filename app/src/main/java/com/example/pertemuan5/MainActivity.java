package com.example.pertemuan5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recylerView;

    String s1[], s2[];
    int images[] = {
            R.drawable.arceus,
            R.drawable.elden_ring,
            R.drawable.hi3,
            R.drawable.miku,
            R.drawable.ow,
            R.drawable.monopoli,
            R.drawable.p5r_back,
            R.drawable.ssbu
    };

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recylerView = findViewById(R.id.recyclerView);
        s1 = getResources().getStringArray(R.array.game);
        s2 = getResources().getStringArray(R.array.harga);
        GameAdapter appAdapter = new GameAdapter(this,s1,s2,images);
        recylerView.setAdapter(appAdapter);
        recylerView.setLayoutManager(new LinearLayoutManager(this));
    }
}