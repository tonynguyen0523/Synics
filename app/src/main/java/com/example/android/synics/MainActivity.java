package com.example.android.synics;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView searchTV = (TextView)findViewById(R.id.search_textview);

        searchTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(MainActivity.this,SimilarMusicResult.class);
                startActivity(searchIntent);

            }
        });

        ImageView questionIV = (ImageView)findViewById(R.id.search_music_image);
        questionIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent questionImageIntent = new Intent(MainActivity.this,SimilarMusicResult.class);
                startActivity(questionImageIntent);
            }
        });

        //mini player

        ImageView miniPlayerHomeIV = (ImageView)findViewById(R.id.mini_player_home_button);
        miniPlayerHomeIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent miniPlayerHomeImageIntent = new Intent(MainActivity.this,MainActivity.class);
                startActivity(miniPlayerHomeImageIntent);
            }
        });

        View miniPlayer = findViewById(R.id.mini_player);
        miniPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent miniPlayerIntent = new Intent(MainActivity.this,PlaySelectedSong.class);
                startActivity(miniPlayerIntent);
            }
        });
    }




}
