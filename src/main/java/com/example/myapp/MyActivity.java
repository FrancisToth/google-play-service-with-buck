package com.example.myapp;

import com.google.android.gms.common.api.*;
import com.google.android.gms.drive.*;

import android.app.Activity;
import android.os.Bundle;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        GoogleApiClient mGoogleApiClient = new GoogleApiClient.Builder(this)
                                                .addApi(Drive.API)
                                                .addScope(Drive.SCOPE_FILE)
                                                .build();
    }
}
