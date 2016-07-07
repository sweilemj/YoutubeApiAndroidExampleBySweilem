package com.sweilemj.youtubeapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity extends YouTubeBaseActivity {
    private String api_key="AIzaSyBR9NaBfP5s-CZyiHZZMMlI6XeIKr6tYZE";

  YouTubePlayerView youTubePlayerView;
   YouTubePlayer.OnInitializedListener onInitializedListener;

    Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        youTubePlayerView=(YouTubePlayerView)findViewById(R.id.view);
        play=(Button)findViewById(R.id.play);


        onInitializedListener=new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("Eg8kVxKYSVE");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
//
            }
        };


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                youTubePlayerView.initialize(api_key ,onInitializedListener);

            }
        });


    }


}
