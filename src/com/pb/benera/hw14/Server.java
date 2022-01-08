package com.pb.benera.hw14;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    static class Handler implements Runnable {
        private final Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }


        @Override
        public void run() {
            String clientMessage;

            try {
                System.out.println (Thread.currentThread ( ).getName ( ) + ": Получен запрос от клиента");
                BufferedReader in = new BufferedReader (new InputStreamReader (socket.getInputStream ( )));
                PrintWriter out = new PrintWriter (socket.getOutputStream ( ), true);
                System.out.println ("Ждем сообщений......");
                while ((clientMessage = in.readLine ( )) != null) {
                    if ("exit".equalsIgnoreCase (clientMessage)) {
                        System.out.println (">>>>>>>>>>>>>>>>>>>>>>>>>>");
                        System.out.println (Thread.currentThread ( ).getName ( ) + " " + "Конец переписке");
                        out.println ("Сервер : Конец переписке");
                        break;
                    }
                    out.println ("Сервер :" + LocalDateTime.now ( ) + " " + clientMessage);
                    System.out.println ("Сервер печатает на консоль: " + clientMessage + "\n" + "Дата/время сообщения: " + LocalDateTime.now ( ));
                }

            } catch (IOException e) {
                e.printStackTrace ( );
            }
        }

        public static void main(String[] args) throws Exception {
            System.out.println ("Старт сервера");
            int serverPort = 1777;
            ServerSocket serverSocket = new ServerSocket (serverPort);
            System.out.println ("Сервер запущен на порту:" + serverPort);
            ExecutorService threadPool = Executors.newFixedThreadPool (5);

            while (true) {
                Socket clientSocket = serverSocket.accept ( );
                threadPool.submit (new Handler (clientSocket));


            }

        }


    }
}