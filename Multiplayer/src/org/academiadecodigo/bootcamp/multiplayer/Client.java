package org.academiadecodigo.bootcamp.multiplayer;

import java.io.IOException;
import java.net.Socket;

/**
 * Created by codecadet on 21/06/17.
 */
public class Client {
    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("localhost", 8080);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
