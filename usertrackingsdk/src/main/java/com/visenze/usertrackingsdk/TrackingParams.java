package com.visenze.usertrackingsdk;

import java.util.HashMap;

/**
 Parameters you want to track in a user event
 */
public class TrackingParams {
    private String action;
    private String requestId;
    private String cid;
    private String cuid;

    // The mapping of customized tracking parameters
    // and their corresponding value
    private HashMap<String, String> customParams;

    /**
     * Setup the compulsory tracking parameters
     * @param action The action of the user event you want to track,
     *               e.g. "add-to-wish-list", "view", "click"
     * @param requestId The request id of the current search provided
     *                  by ViSenze search service
     * @param cid An identify assigned by visenze for each e-commerce provider
     *            e.g. app key
     */
    public TrackingParams(String action, String requestId, String cid) {
        this.action = action;
        this.requestId = requestId;
        this.cid = cid;
    }

    /**
     * Set the user ID generated from your platform, e.g. account ID of the user
     * @param cuid
     */
    public void setCuid(String cuid) {
        this.cuid = cuid;
    }

    /**
     * Set The mapping of customized tracking parameters
     * and their corresponding value
     * @param customParams
     */
    public void setCustomParams(HashMap<String, String> customParams) {
        this.customParams = customParams;
    }
}
