package com.example.android.synics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class ArtistPage extends AppCompatActivity {


    String[] artistSongArray = {"Song One", "Song Two", "Song Three", "Song Four", "Song Five",
            "Song Six", "Song Seven", "Song Eight", "Song Nine", "Song Ten"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_page);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.result_listview, artistSongArray);
        ListView artistResultList = (ListView)findViewById(R.id.artist_song_list);
        artistResultList.setAdapter(adapter);

        artistResultList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent playSong = new Intent(ArtistPage.this, PlaySelectedSong.class);
                startActivity(playSong);
            }
        });

        //mini player

        ImageView miniPlayerHomeIV = (ImageView)findViewById(R.id.mini_player_home_button);
        miniPlayerHomeIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent miniPlayerHomeImageIntent = new Intent(ArtistPage.this,MainActivity.class);
                startActivity(miniPlayerHomeImageIntent);
            }
        });

        View miniPlayer = findViewById(R.id.mini_player);
        miniPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent miniPlayerIntent = new Intent(ArtistPage.this,PlaySelectedSong.class);
                startActivity(miniPlayerIntent);
            }
        });
    }
}
