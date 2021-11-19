package com.pb.benera.hw8;

public class WrongLoginException extends Exception {
    private String detail;

    public WrongLoginException() {
        detail = "Логин должен содержать от 5 до 20 символов латинского алфавита и цифры";
    }

    public WrongLoginException(String message) {
        super (message);
        detail = message;
    }

    @Override
    public String toString() {
        return "WrongLoginException: " + detail;
    }
}
