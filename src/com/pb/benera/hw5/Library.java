package com.pb.benera.hw5;


public class Library {
    public static void main(String[] args) {
      Book book1=new Book ( "Приключения","Иванов И. И.",2000 );
      Book book2=new Book ( "Словарь","Сидоров А. В.",1980 );
      Book book3=new Book ( "Энциклопедия","Гусев К. В.",2010 );
      Book[] books = {book1, book2, book3};

      Reader reader1 = new Reader ( "Петров В. В.",1,"Финансы и кредит","17/08/1989","+380640070445");
      Reader reader2 = new Reader ( "Сидоров А. А.",2,"Банковское дело","01/01/1989","+380648570335");
      Reader reader3 = new Reader ( "Левченко К. В.",3,"Бухгалтерский учёт","30/10/1989","+380639990888");
      Reader[] readers = {reader1, reader2, reader3};

        System.out.println("Список книг:");
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
        System.out.println();

        System.out.println("Список читателей:");
        for (Reader reader : readers) {
            System.out.println( reader.getInfo());
        }
        System.out.println();

        reader1.takeBook(3);
        reader2.takeBook("Приключения,Словарь,Энциклопедия");
        reader3.takeBook(book1, book2,book3);

        reader1.returnBook(2);
        reader2.returnBook("Приключения, Словарь");
        reader3.returnBook(book3);
    }
}
