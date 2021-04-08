package com.example.uhzykha10rpl136;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

       MyMovieData[] myMovieData = new MyMovieData[]{
               new MyMovieData("Baby Driver (2017)","7,6/10 (imdb)",R.drawable.babydriver),
               new MyMovieData("Avengers : Endgame (2019)","8,4/10 (imdb)",R.drawable.endgame),
               new MyMovieData("Spider-Man: Homecoming  (2017)","7,6/10 (imdb)",R.drawable.homecoming),
               new MyMovieData("Jurassic World (2015)","7,4/10 (imdb)",R.drawable.jurassic),
               new MyMovieData("Men in Black: International (2019)","5,6/10 (imdb)",R.drawable.mib),
               new MyMovieData(" The Revenant (2015)","8,0/10 (imdb)",R.drawable.revenant),
               new MyMovieData("Home Alone (1990)","7,6/10 (imdb)",R.drawable.homealone),
        };
        MyMovieAdapter myMovieAdapter = new MyMovieAdapter(myMovieData,MainActivity.this);
        recyclerView.setAdapter(myMovieAdapter);
    }
}