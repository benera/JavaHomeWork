package com.pb.benera.hw12;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.*;

import static java.lang.System.in;

public class PhoneBook {

    List <Subscriber> subscribers = new ArrayList <> ( );
    LocalDateTime localDateTime = LocalDateTime.now ( );
    Scanner scanner = new Scanner (in);

    public void add() {
        String name;
        String birthdate;
        String phone;
        String address;
        System.out.println ("Введите данные абонента");
        System.out.println ("ФИО:");
        name = scanner.next ( );
        System.out.println ("Дата рождения:");
        birthdate = scanner.next ( );
        System.out.println ("Tелефон (если нужно добавить несколько номеров,ввод через пробел):");
        phone = scanner.next ( );
        System.out.println ("Адрес:");
        address = scanner.next ( );
        subscribers.add (new Subscriber (name, birthdate, phone, address, localDateTime));
        subscribers.add (new Subscriber ("Вася", "14/05/2020", "757", "Днепр", localDateTime));
    }

    public void remove() {
        if (!subscribers.isEmpty ( )) {
            System.out.println ("Введите номер телефона абонента,которого нужно удалить: ");
            String number = scanner.next ( );
            boolean flag = subscribers.removeIf (subscriber -> Objects.equals (subscriber.getPhone ( ), number));

            if (flag) {
                System.out.println ("Абонент удален");
            } else System.out.println ("Номер телефона абонента некорректен,повторите попытку");
        } else System.out.println ("Абоненты не найдены,добавьте нового абонента и повторите операцию");
    }

    public void search() {
        if (!subscribers.isEmpty ( )) {
            System.out.println ("Выберите атрибут по которому искать абонента(1 - ФИО ,2 - Номер телефона):");
            int choice = scanner.nextInt ( );
            switch (choice) {
                case 1:
                    System.out.println ("Введите  ФИО абонента: ");
                    String name = scanner.next ( );
                    subscribers.stream ( ).filter (subscriber -> subscriber.getName ( ).equals (name)).forEach (System.out::println);
                    break;
                case 2:
                    System.out.println ("Введите  номер телефона абонента:");
                    String phone = scanner.next ( );
                    subscribers.stream ( ).filter (subscriber -> subscriber.getPhone ( ).equals (phone)).forEach (System.out::println);
                    break;
            }

        } else System.out.println ("Абоненты не найдены,добавьте нового абонента и повторите операцию");
    }


    public void show() {
        if (!subscribers.isEmpty ( )) {
            System.out.println ("Выберите атрибут по которому отсортировать и вывести на экран абонентов (1 - по адресу; 2 - по номеру телефона;):");
            int choice = scanner.nextInt ( );
            switch (choice) {
                case 1:
                    subscribers.stream ( ).sorted ((x1, x2) -> x1.getAddress ( ).compareToIgnoreCase (x2.getAddress ( ))).forEach (System.out::println);
                    break;
                case 2:
                    subscribers.stream ( ).sorted ((x1, x2) -> x1.getPhone ( ).compareToIgnoreCase (x2.getPhone ( ))).forEach (System.out::println);
                    break;
            }
        } else System.out.println ("Абоненты не найдены,добавьте нового абонента и повторите операцию");
    }


    public void edit() {
        if (!subscribers.isEmpty ( )) {
            System.out.println ("Введите ФИО абонента,которого хотите редактировать:");
            String name = scanner.next ( );
            for (Subscriber subscriber : subscribers) {
                if (subscriber == null) {
                    System.out.println ("Абонент не существует,повторите попытку!");
                    break;
                }
                if (subscriber.getName ( ).equals (name)) {
                    System.out.println ("Выберите атрибут,который хотите изменить:\n 1 - ФИО;" + "\n 2 - Дата рождения;" + "\n 3 - Телефон;" + "\n 4 - Адрес;");
                    int choice = scanner.nextInt ( );
                    switch (choice) {
                        case 1:
                            System.out.println ("Введите новое ФИО: ");
                            String newName = scanner.next ( );
                            subscriber.setName (newName);
                            subscriber.setDatetime (localDateTime);
                            System.out.println ("ФИО изменено. Новое ФИО: " + subscriber.getName ( ));
                            break;
                        case 2:
                            System.out.println ("Введите новую дату рождения: ");
                            String newBirthdate = scanner.next ( );
                            subscriber.setBirthdate (newBirthdate);
                            subscriber.setDatetime (localDateTime);
                            System.out.println ("Дата рождения  изменена");
                            break;
                        case 3:
                            System.out.println ("Введите новый номер телефона(если нужно добавить несколько номеров,ввод через пробел):");
                            String newPhone = scanner.next ( );
                            subscriber.setPhone (newPhone);
                            subscriber.setDatetime (localDateTime);
                            System.out.println ("Номер телефона изменен");
                            break;
                        case 4:
                            System.out.println ("Введите новый адрес: ");
                            String newAddress = scanner.next ( );
                            subscriber.setAddress (newAddress);
                            subscriber.setDatetime (localDateTime);
                            System.out.println ("Адрес изменен");

                    }
                } else System.out.println ("Данные введены некорректно,повторите попытку!");
                break;
            }
        } else System.out.println ("Абоненты не найдены,добавьте нового абонента и повторите операцию");
    }

    public void createFile() throws JsonProcessingException {
        if (!subscribers.isEmpty ( )) {
            final String filePath = "/home/aleksandra/Рабочий стол/PhoneBook2.json";
            ObjectMapper objectMapper = new ObjectMapper ( );
            objectMapper.enable (SerializationFeature.INDENT_OUTPUT);
            SimpleModule module = new SimpleModule ( );
            module.addSerializer (LocalDateTime.class, new LocalDateTimeSerializer ( ));
            module.addDeserializer (LocalDateTime.class, new LocalDateTimeDeserializer ( ));
            objectMapper.registerModule (module);
            String json = objectMapper.writeValueAsString (subscribers);
            try (BufferedWriter writer = Files.newBufferedWriter (Paths.get (filePath))) {
                writer.write (json);
                System.out.println ("Данные записаны в файл");
            } catch (IOException e) {
                e.printStackTrace ( );
            }
        } else System.out.println ("Абоненты не найдены,добавьте нового абонента и повторите операцию");
    }

    public void donwloadFile() {
        if (!subscribers.isEmpty ( )) {
            System.out.println ("\n <<<<< ЧТЕНИЕ ФАЙЛА......>>>>>");
            final String filePath = "/home/aleksandra/Рабочий стол/PhoneBook2.json";
            String lines;
            try (BufferedReader reader = Files.newBufferedReader (Paths.get (filePath))) {
                while ((lines = reader.readLine ( )) != null) {
                    System.out.println (lines);
                }
                System.out.println ( );
            } catch (IOException e) {
                e.printStackTrace ( );
            }


        } else System.out.println ("Абоненты не найдены,добавьте нового абонента и повторите операцию");
    }
}
