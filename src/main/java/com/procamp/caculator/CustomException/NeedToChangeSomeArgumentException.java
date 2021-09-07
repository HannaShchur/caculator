package com.procamp.caculator.CustomException;

public class NeedToChangeSomeArgumentException extends RuntimeException {
    private String message = "need to review arguments";
    public NeedToChangeSomeArgumentException() {}

    public NeedToChangeSomeArgumentException(String message) {
        this.message = message;;
    }
    public String message() {
        return message;
    }
}
