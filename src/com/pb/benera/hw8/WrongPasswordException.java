package com.pb.benera.hw8;

public class WrongPasswordException extends Exception {
    private String detail;

    public WrongPasswordException() {
        detail = "Пароль должен быть от 5 символов латинского алфавита, цифр и знака '_'";
    }

    public WrongPasswordException(String message) {
        super (message);
        detail = message;
    }

    @Override
    public String toString() {
        return "WrongPasswordException: " + detail;
    }
}

