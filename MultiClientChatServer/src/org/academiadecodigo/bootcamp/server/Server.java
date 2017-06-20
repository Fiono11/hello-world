package org.academiadecodigo.bootcamp.server;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

/**
 * Created by codecadet on 19/06/17.
 */
public class Server implements Runnable {

    private static ServerSocket serverSocket;
    private static LinkedList<Socket> clientSockets;
    public static final int port = 8080;

    public static void main(String[] args) {

        try {
            serverSocket = new ServerSocket(port);
            clientSockets = new LinkedList<>();

            while (true) {
                Socket clientSocket = serverSocket.accept();
                clientSockets.add(clientSocket);
                DataInputStream in = new DataInputStream(clientSocket.getInputStream());
                PrintStream out = new PrintStream(clientSocket.getOutputStream());
                new Thread(new Server()).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {

        try {
            Socket clientSocket = clientSockets.getLast();
            DataInputStream in = new DataInputStream(clientSocket.getInputStream());
            PrintStream out = new PrintStream(clientSocket.getOutputStream());
            out.println("What's your name?");
            String name = in.readLine();
            out.println("Welcome, " + name + "!");
                while (true) {

                    String message = in.readLine();
                    for (Socket socket : clientSockets) {
                        if (socket != clientSocket) {
                            PrintStream os = new PrintStream(socket.getOutputStream());
                            os.println(message);
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
        }
    }
}
