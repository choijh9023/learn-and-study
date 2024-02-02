package network;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class MyClientEx2 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 50001);

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("야 연결좀해보자 연습좀해보게 \n이렇게 하는게 맞나 ");
            bw.flush();
            bw.close();
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
