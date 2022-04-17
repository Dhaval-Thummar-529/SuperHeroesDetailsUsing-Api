package com.dhaval.moviesapiinrecyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.dhaval.moviesapiinrecyclerview.R;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView name = findViewById(R.id.tvName);
        ImageView imageUrl = findViewById(R.id.ivUrl);
        TextView realName = findViewById(R.id.tvRealName);
        TextView team = findViewById(R.id.tvTeam);
        TextView fA = findViewById(R.id.tvFA);
        TextView createdBy = findViewById(R.id.tvCreatedBy);
        TextView publisher = findViewById(R.id.tvPublisher);
        TextView bio = findViewById(R.id.tvBio);

        name.setText("Name : " + getIntent().getStringExtra("name"));
        Picasso.get().load(getIntent().getStringExtra("imageUrl")).into(imageUrl);
        realName.setText("Real Name : " + getIntent().getStringExtra("realname"));
        team.setText("Team : " + getIntent().getStringExtra("team"));
        fA.setText("First Appearance : " + getIntent().getStringExtra("fA"));
        createdBy.setText("Created By : " + getIntent().getStringExtra("createdBy"));
        publisher.setText("Publisher : " + getIntent().getStringExtra("publisher"));
        bio.setText("Bio : " + getIntent().getStringExtra("bio"));
    }
}