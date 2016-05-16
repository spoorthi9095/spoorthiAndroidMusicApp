package com.example.spoorthi.musicapp;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TabHost;

public class AndroidTabActivity extends TabActivity
{
    TabHost th;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        th = getTabHost();

        TabHost.TabSpec spec1 = th.newTabSpec("This is Artists tab");
        spec1.setIndicator("Artists",getResources().getDrawable(R.drawable.artistsd));
        Intent artistIntent = new Intent(AndroidTabActivity.this,ArtistActivity.class);
        spec1.setContent(artistIntent);
        th.addTab(spec1);

        TabHost.TabSpec spec2 = th.newTabSpec("This is Album tab");
        spec2.setIndicator("Album",getResources().getDrawable(R.drawable.albumd));
        Intent albumIntent = new Intent(AndroidTabActivity.this,AlbumActivity.class);
        spec2.setContent(albumIntent);
        th.addTab(spec2);

        TabHost.TabSpec spec3 = th.newTabSpec("This is Songs tab");
        spec3.setIndicator("Songs",getResources().getDrawable(R.drawable.songd));
        Intent songsIntent = new Intent(AndroidTabActivity.this,SongActivity.class);
        spec1.setContent(songsIntent);
        th.addTab(spec3);
    }
}
