package network;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import java.net.Socket;

public class TestCilent {
    public static void main(String[] args) {

        try {
            // 서버로 보낼 소켓 생성하기
            Socket socket = new Socket("127.0.0.1", 50002);

            //데이터 보내는 출력 스트림 생성
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            // 데이터 출력하기
            bw.write("저 이거 써도대요요? ");

            bw.flush();

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 서버로 보낼 데이터 소켓을 통해서 보내기
    }
}
