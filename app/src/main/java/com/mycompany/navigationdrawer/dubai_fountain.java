package com.mycompany.navigationdrawer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class dubai_fountain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dubai_fountain);
        getSupportActionBar().setTitle(getString(R.string.dubai_fountain));
    }

    /**
     * This method launches the google maps app and will show the location of Dubai Fountain.
     */


    public void dubaiFountainNavigation(View view) {
        Intent navigate = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:25.197158,55.275106"));
        navigate.setClassName("com.google.android.apps.maps",
                "com.google.android.maps.MapsActivity");
        startActivity(navigate);
    }

    /**
     * This method launches the browser and shows a video on yootube about the Dubai Fountain.
     */

    public void dubaiFountainVideo(View view) {
        Intent video = new Intent(Intent.ACTION_VIEW);
        video.setData(Uri.parse(getString(R.string.dubai_fountain_video_url)));
        startActivity(video);
    }
}
