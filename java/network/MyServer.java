package network;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) throws IOException {

        // 1. 서버소켓 생성
        ServerSocket ss = new ServerSocket(50001);
        System.out.println("서버 소캣 생성햇다잉! ");
        //2. 클라이언트의 socket과 접속 할 수 잇도록 accpet서버소켓에 바인드
       // ss.bind(new InetSocketAddress(50001));
        Socket socket = ss.accept();

      //  InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();

      //  String ClientIp = isa.getHostName();
      //  int portNo = isa.getPort();

        ss.close();
        socket.close();
        System.out.println("소켓끝낸다.");

    }
}
