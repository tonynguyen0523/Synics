package com.example.android.synics;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaySelectedSong extends AppCompatActivity {

    //Will be using the MediaPlayer class to implement the play music functionality.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_selected_song);

        TextView songName = (TextView)findViewById(R.id.song_name);
        TextView artistName = (TextView)findViewById(R.id.artist_name);

        songName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent findSimilarSong = new Intent(PlaySelectedSong.this, SimilarMusicResult.class);
                startActivity(findSimilarSong);
            }
        });

        artistName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent findArtistPage = new Intent(PlaySelectedSong.this, ArtistPage.class);
                startActivity(findArtistPage);
            }
        });

        ImageView shoppingCartIV = (ImageView)findViewById(R.id.shopping_cart);
        shoppingCartIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent questionImageIntent = new Intent(PlaySelectedSong.this,PurchaseMusic.class);
                startActivity(questionImageIntent);
            }
        });

    }
}
