package network;

import java.net.Socket;

public class MyClient {
    public static void main(String[] args) {
        try {

            Socket socket = new Socket("127.0.0.1", 50001);


            socket.close();
        } catch (Exception e) {


        }
    }
}
