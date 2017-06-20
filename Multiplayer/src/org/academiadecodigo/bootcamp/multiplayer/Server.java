package org.academiadecodigo.bootcamp.multiplayer;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * Created by codecadet on 20/06/17.
 */
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
