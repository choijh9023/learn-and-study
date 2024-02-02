package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerEx1 {
    public static void main(String[] args) throws IOException {

        // 1. 서버소켓 생성
        ServerSocket serverSocket = new ServerSocket(50001);

        //2. 클라이언트의 socket과 접속 할 수 잇도록 accpet서버소켓에 바인드
        System.out.println("서버 소캣 생성햇다잉! ");
        Socket socket =serverSocket.accept();

        //3.client가 보낸 메세지 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String message = br.readLine();
        System.out.println("클라이언트가 보낸 메세지 = " + message);

        //4. client가 보낸 메세지에 대한 응답 보내기
      //  InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();

      //  String ClientIp = isa.getHostName();
      //  int portNo = isa.getPort();

       // serverSocket.close();
       // socket.close();
       // System.out.println("소켓끝낸다.");

    }
}
