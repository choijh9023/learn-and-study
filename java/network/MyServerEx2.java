package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerEx2 {
    public static void main(String[] args) {
        try {
            // 서버 소켓을 생성하고 50001 포트에 자동으로 바인딩
            ServerSocket serverSocket = new ServerSocket(50001);
            System.out.println("소켓 생성했고 accept했다");
            // 클라이언트의 연결을 기다리고, 연결이 수립되면 해당 소켓을 반환
            Socket socket = serverSocket.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String data = br.readLine();
            System.out.println("받은 데이터 출력 = " + data);
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
