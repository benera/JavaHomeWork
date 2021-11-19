package com.pb.benera.hw8;

import java.util.Scanner;

public class OnlineShop {

    public static void main(String[] args) {
        int count = 0;
        System.out.println ("==============Регистрация====================");
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Введите логин для регистрации");
        String login = scanner.nextLine ( );
        System.out.println ("Введите пароль для регистрации");
        String password = scanner.nextLine ( );
        System.out.println ("Подтвердите пароль: ");
        String confirmPassword = scanner.nextLine ( );
        Auth user = new Auth ( );
        try {
            user.signUp (login, password, confirmPassword);
            System.out.println ("Поздравляем!\nРегистрация пользователя " + login + " выполнена успешно!");
            System.out.println ("=============================================");
            count++;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println (e.getMessage ( ));

        }
        while (count > 0) {
            System.out.println ("==============Авторизация====================");
            System.out.println ("Введите логин для входа");
            login = scanner.nextLine ( );
            System.out.println ("Введите пароль для входа");
            password = scanner.nextLine ( );
            try {
                user.signIn (login, password);
                System.out.println ("Поздравляем!\nАвторизация пользователя " + login + " выполнена успешно!");
                System.out.println ("=============================================");
                break;

            } catch (WrongLoginException | WrongPasswordException e) {
                System.out.println (e.getMessage ( ));

            }
        }
    }
}
