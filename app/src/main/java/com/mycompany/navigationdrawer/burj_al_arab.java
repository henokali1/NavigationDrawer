package com.mycompany.navigationdrawer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class burj_al_arab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burj_al_arab);
        getSupportActionBar().setTitle(getString(R.string.burj_al_arab));
    }

    /**
     * This method launches the google maps app and will show the location of Burj Al Arab.
     */
    public void burjAlArabNavigateMeButton(View view) {
        Intent navigate = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:25.141064,55.184862"));
        navigate.setClassName("com.google.android.apps.maps",
                "com.google.android.maps.MapsActivity");
        startActivity(navigate);
    }
}
