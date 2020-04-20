package com.pinyougou.entity;

import java.io.Serializable;

public class Result implements Serializable {

    boolean success;

    String message;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Result() {
    }

    public Result(boolean success, String message) {
        this.success = success;
        this.message = message;
    }
}
