package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
    public static void main(String[] args) {
        //서버 소켓 생성
        try {
            ServerSocket serverSocket = new ServerSocket(50002);
            System.out.println("서버 오픈했습니다. 환영해요");
            //소켓 감시 accept
            Socket socket = serverSocket.accept();


            //클라이언트로 부터 받은 데이터 출력하기
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String data = br.readLine();
            System.out.println("클라이언트가 보낸 데이터 " + data);
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
