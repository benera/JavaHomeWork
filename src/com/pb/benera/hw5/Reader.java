package com.pb.benera.hw5;

public class Reader {
    private String name;
    private int number;
    private String faculty;
    private String birthday;
    private String phone;

    public Reader(String name,int number,String faculty,String birthday,String phone ){
        this.name=name;
        this.number=number;
        this.faculty=faculty;
        this.birthday=birthday;
        this.phone=phone;

    }
    public Reader() {
    }

    public String getName() {return name;}

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public void takeBook(int number) {
        System.out.println(this.name + " взял " + number + " книги.");
    }

    public void takeBook(String... books) {
        System.out.println(this.name + " взял  книги:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.println(this.name + " взял  книги:");
        for (Book book : books) {
            System.out.println(book.getName() + " (" + book.getAuthor() + " "+ book.getYear ()+ " г."+")");
        }
        System.out.println();
    }
    public void returnBook(int number) {
        System.out.println(this.name + " вернул " + number + " книги.");
    }

    public void returnBook(String... books) {
        System.out.println(this.name + " вернул  книги:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.println(this.name + " вернул  книги:");
        for (Book book : books) {
            System.out.println(book.getName() + " (" + book.getAuthor() + " "+ book.getYear ()+ " г."+")");
        }
        System.out.println();
    }

    public String getInfo() {
        return "[name:"+name+", number:"+number+", faculty:"+faculty+", birthday:"+birthday+", phone:"+phone+"]";
    }

}
