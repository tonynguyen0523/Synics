package com.example.android.synics;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class SimilarMusicResult extends AppCompatActivity {

    String[] songArray = {"Song One", "Song Two", "Song Three", "Song Four", "Song Five",
            "Song Six", "Song Seven", "Song Eight", "Song Nine", "Song Ten"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_similar_music_result);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.result_listview, songArray);
        ListView resultList = (ListView)findViewById(R.id.list_results);
        resultList.setAdapter(adapter);

        resultList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent playSong = new Intent(SimilarMusicResult.this, PlaySelectedSong.class);
                startActivity(playSong);
            }
        });

        TextView songEntered = (TextView)findViewById(R.id.song_entered);
        songEntered.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songEnteredIntent = new Intent(SimilarMusicResult.this, MainActivity.class);
                startActivity(songEnteredIntent);
            }
        });

        //mini player

        ImageView miniPlayerHomeIV = (ImageView)findViewById(R.id.mini_player_home_button);
        miniPlayerHomeIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent miniPlayerHomeImageIntent = new Intent(SimilarMusicResult.this,MainActivity.class);
                startActivity(miniPlayerHomeImageIntent);
            }
        });

        View miniPlayer = findViewById(R.id.mini_player);
        miniPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent miniPlayerIntent = new Intent(SimilarMusicResult.this,PlaySelectedSong.class);
                startActivity(miniPlayerIntent);
            }
        });
    }
}
