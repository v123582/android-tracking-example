package com.wei.samples.quickstart.analytics;


import com.google.android.gms.analytics.CampaignTrackingReceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;


public class CustomReceiver extends BroadcastReceiver {

    // The name of the referrer string broadcast by Google Play Store.
    private static final String PLAY_STORE_REFERRER_KEY = "referrer";

    @Override
    public void onReceive(Context context, Intent intent) {

        String referrer = intent.getStringExtra(PLAY_STORE_REFERRER_KEY);

        // Do something with the referrer.
        Log.w("INFO","The APP has been installed.");
        Log.w("INFO", referrer);

        // When you're done, pass the intent to the Google Analytics Campaign Tracking Receiver.
        new CampaignTrackingReceiver().onReceive(context, intent);

        // Do something with the referrer.
        Log.w("INFO","The APP has been installed.");

    }
}