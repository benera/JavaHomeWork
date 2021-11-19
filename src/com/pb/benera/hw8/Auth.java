package com.pb.benera.hw8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Auth {
    private String login;
    private String password;

    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        Pattern patternLogin = Pattern.compile ("[a-zA-Z0-9]{5,20}");
        Matcher matcherLogin = patternLogin.matcher (login);
        if (!matcherLogin.matches ( )) {
            throw new WrongLoginException ("Логин должен содержать от 5 до 20 символов и цифр латинского алфавита ");

        }
        Pattern patternPassword = Pattern.compile ("[a-zA-Z0-9_]{5,}");
        Matcher matcherPassword = patternPassword.matcher (password);
        if (!matcherPassword.matches ( )) {
            throw new WrongPasswordException ("Пароль должен быть от 5 символов латинского алфавита, цифр и знака '_'");

        }
        if (!password.equals (confirmPassword)) {
            throw new WrongPasswordException ("Пароли не совпадают,повторите попытку");

        } else
            this.login = login;
        this.password = password;

    }

    public void signIn(String login, String password) throws WrongLoginException, WrongPasswordException {
        if (this.login.equals (login) && this.password.equals (password))
            System.out.println ("Авторизация прошла успешно");
        else
            throw new WrongLoginException ("Данные учетной записи не найдены ,повторите попытку");
    }
}
