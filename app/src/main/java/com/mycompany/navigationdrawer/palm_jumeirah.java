package com.mycompany.navigationdrawer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class palm_jumeirah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palm_jumeirah);
        getSupportActionBar().setTitle(getString(R.string.palm_jumeirah));
    }

    public void palmJumeirahNavigation(View view) {
        Intent navigate = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:25.113576,55.138778"));
        navigate.setClassName("com.google.android.apps.maps",
                "com.google.android.maps.MapsActivity");
        startActivity(navigate);
    }
}
