package com.dhaval.moviesapiinrecyclerview.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dhaval.moviesapiinrecyclerview.R;
import com.dhaval.moviesapiinrecyclerview.activity.DetailActivity;
import com.dhaval.moviesapiinrecyclerview.modal.MovieResults;
import com.squareup.picasso.Picasso;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private Context context;
    private List<MovieResults> movieResultslist;

    public RecyclerAdapter(Context context, List<MovieResults> movieResultslist) {
        this.context = context;
        this.movieResultslist = movieResultslist;
    }

    @SuppressLint("NotifyDataSetChanged")
    public void setMovieList(List<MovieResults> movieList) {
        this.movieResultslist = movieList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_movie_rv, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {
        MovieResults modal = movieResultslist.get(position);
        Picasso.get().load(modal.getImageUrl()).into(holder.imageView);
        holder.textView.setText(modal.getName());
    }

    @Override
    public int getItemCount() {
        return movieResultslist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ImageView imageView;
        public TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(R.id.imV);
            this.textView = (TextView) itemView.findViewById(R.id.tv);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            MovieResults modal = movieResultslist.get(getAdapterPosition());
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("name", modal.getName());
            intent.putExtra("imageUrl", modal.getImageUrl());
            intent.putExtra("realname",modal.getRealname());
            intent.putExtra("team",modal.getTeam());
            intent.putExtra("fA",modal.getFirstappearance());
            intent.putExtra("createdBy",modal.getCreatedby());
            intent.putExtra("publisher",modal.getPublisher());
            intent.putExtra("bio",modal.getBio());
            context.startActivity(intent);
        }
    }
}
