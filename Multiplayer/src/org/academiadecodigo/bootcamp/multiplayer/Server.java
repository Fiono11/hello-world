package org.academiadecodigo.bootcamp.multiplayer;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by codecadet on 20/06/17.
 */
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            Socket clientSocket = serverSocket.accept();
            DataInputStream in = new DataInputStream(clientSocket.getInputStream());
            Game game = new Game();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
