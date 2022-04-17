package com.dhaval.moviesapiinrecyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.dhaval.moviesapiinrecyclerview.R;
import com.dhaval.moviesapiinrecyclerview.adapter.RecyclerAdapter;
import com.dhaval.moviesapiinrecyclerview.modal.MovieResults;
import com.dhaval.moviesapiinrecyclerview.rest.ApiClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rView;
    private RecyclerAdapter recyclerAdapter;
    private List<MovieResults> superHeroesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        superHeroesList = new ArrayList<>();
        rView = findViewById(R.id.rView);
        recyclerAdapter = new RecyclerAdapter(this, superHeroesList);
        rView.setAdapter(recyclerAdapter);
        rView.setLayoutManager(new LinearLayoutManager(this));

        getMov();
    }

    private void getMov() {
        Call<List<MovieResults>> call = ApiClient.getInstance().getMyApi().getsuperHeroes();
        call.enqueue(new Callback<List<MovieResults>>() {
            @Override
            public void onResponse(Call<List<MovieResults>> call, Response<List<MovieResults>> response) {
                superHeroesList = response.body();

                recyclerAdapter.setMovieList(superHeroesList);
            }

            @Override
            public void onFailure(Call<List<MovieResults>> call, Throwable t) {
                Log.d("TAG==>", "Response = " + t.toString());
            }
        });
    }
}