package network;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;

public class MyClientEx1 {
    public static void main(String[] args) {
        try {

            Socket socket = new Socket("127.0.0.1", 50001);
            //Server에 보낼 데이터 준비해서 보내기
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            /**1.위에 코드 뜻은  문자를 출력하기위해 버퍼드writer 생성
             * 2.bw는 보조스트림이기 때문에 상위클래스인 아웃풋스트림writer생성
             * 3.그것은 소켓을 통해서 내보내겟다.
             */
             bw.write("눈떠라 데이터 출력한다 서버야 ");
             bw.flush();
             bw.newLine();

            //server에서 보낸 데이터를 받아서 출력하기

            socket.close();


        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
