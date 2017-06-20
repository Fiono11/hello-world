package org.academiadecodigo.bootcamp.server;

import java.io.*;
import java.net.Socket;

/**
 * Created by codecadet on 19/06/17.
 */
public class Client implements Runnable {

    private static Socket clientSocket;

    public static void main(String[] args) {

        try {
            clientSocket = new Socket("localhost", Server.port);
            DataInputStream in = new DataInputStream(clientSocket.getInputStream());
            PrintStream out = new PrintStream(clientSocket.getOutputStream());
            new Thread(new Client()).start();

            while (true) {
                System.out.println(in.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            PrintStream out = new PrintStream(clientSocket.getOutputStream());
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                out.println(keyboard.readLine()); // ação bloqueante
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
