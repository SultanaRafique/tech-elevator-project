package com.techelevator.memes.model;

/**
 * Class to hold entire response from get_memes endpoint
 */
public class MemeApiGetResponse {

    private boolean success;
    private MemeData data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public MemeData getData() {
        return data;
    }

    public void setData(MemeData data) {
        this.data = data;
    }


}
