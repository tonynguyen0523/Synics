package com.example.android.synics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PurchaseMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase_music);

        //mini player

        ImageView miniPlayerHomeIV = (ImageView)findViewById(R.id.mini_player_home_button);
        miniPlayerHomeIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent miniPlayerHomeImageIntent = new Intent(PurchaseMusic.this,MainActivity.class);
                startActivity(miniPlayerHomeImageIntent);
            }
        });

        View miniPlayer = findViewById(R.id.mini_player);
        miniPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent miniPlayerIntent = new Intent(PurchaseMusic.this,PlaySelectedSong.class);
                startActivity(miniPlayerIntent);
            }
        });
    }
}
