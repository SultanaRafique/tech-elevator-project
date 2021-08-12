package com.techelevator.memes.model;

import java.util.List;

public class MemeApiResponse {

    boolean success;
    MemeData data;

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
