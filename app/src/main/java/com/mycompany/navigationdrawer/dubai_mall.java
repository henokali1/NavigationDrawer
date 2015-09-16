package com.mycompany.navigationdrawer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class dubai_mall extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dubai_mall);
        getSupportActionBar().setTitle(getString(R.string.the_dubai_mall));
    }

    /**
     * This method navigates to The Dubai Mall.
     */
    public void theDubaiMallNavigation(View view) {
        Intent navigate = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:25.197150,55.279461"));
        navigate.setClassName("com.google.android.apps.maps",
                "com.google.android.maps.MapsActivity");
        startActivity(navigate);
    }
}
