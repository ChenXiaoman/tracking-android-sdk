package com.visenze.usertrackingsdk;

import android.content.Context;

/**
 * Created by visenze on 26/2/16.
 */
public class UserEventTracker {
    private String accessKey;

    /**
     * volley http instance
     */
    private HttpInstance httpInstance;

    /**
     * Create a user event tracker
     * @param context
     * @param accessKey An identify assigned by visenze for each e-commerce provider
     *            e.g. app key
     */
    public UserEventTracker(Context context, String accessKey) {
        this.accessKey = accessKey;
        httpInstance = HttpInstance.getInstance(context.getApplicationContext());
        UIDManager.initUIDManager(context);
    }

    public void track(TrackingParams trackParams) {
        httpInstance.addGetRequestToQueueWithoutResponse("http://track.visenze.com/__aq.gif", trackParams.toMap(accessKey));
    }
}

