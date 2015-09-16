package com.mycompany.navigationdrawer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Third_Fragment extends Fragment implements View.OnClickListener {
    Button emailMeButton;

    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        myView = inflater.inflate(R.layout.third_layout, container, false);
        emailMeButton = (Button) myView.findViewById(R.id.email_me);
        emailMeButton.setOnClickListener(this);

        return myView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.email_me:
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{"henokali1.com"});
                email.putExtra(Intent.EXTRA_SUBJECT, "");
                email.putExtra(Intent.EXTRA_TEXT, "");
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email, "Choose an Email client :"));
                break;
        }
    }
}
