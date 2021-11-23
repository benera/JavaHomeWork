package com.pb.benera.hw9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileNumbers {

    public void createNumbersFile() {
        int N = 10;
        int M = 10;
        String mas = "";
        final String filePath = "/home/aleksandra/Рабочий стол/numbers.txt";

        try (BufferedWriter writer = Files.newBufferedWriter (Paths.get (filePath))) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    mas = mas + (int) ((Math.random ( )) * 100) + " ";
                }
                mas = mas + "\n";
            }
            writer.write (mas);
        } catch (IOException ioException) {
            ioException.printStackTrace ( );
        }

    }


    public void createOddNumbersFile() {
        final String filePath = "/home/aleksandra/Рабочий стол/numbers.txt";
        final String filePath2 = "/home/aleksandra/Рабочий стол/odd-numbers.txt";
        List <String> lines = new ArrayList <> ( );
        try (BufferedReader reader = Files.newBufferedReader (Paths.get (filePath))) {
            while ((reader.ready ( ))) {
                lines.add (reader.readLine ( ));
            }
            Integer[][] mas2 = new Integer[10][10];
            for (int i = 0; i < mas2.length; i++) {
                for (int j = 0; j < mas2.length; j++) {
                    String[] line = lines.get (i).split (" ");
                    mas2[i][j] = Integer.parseInt (line[j]);
                }

            }
            for (int i = 0; i < mas2.length; i++) {
                for (int j = 0; j < mas2.length; j++) {
                    if (mas2[i][j] % 2 == 0) {
                        mas2[i][j] = 0;
                    }
                }
            }

            try (BufferedWriter writer = Files.newBufferedWriter (Paths.get (filePath2))) {
                for (int i = 0; i < mas2.length; i++) {
                    for (int j = 0; j < mas2.length; j++) {
                        writer.write (String.valueOf (mas2[i][j]));
                        writer.write (" ");
                    }
                    writer.write ("\r\n");
                }


            } catch (IOException e) {
                e.printStackTrace ( );
            }
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }
}
