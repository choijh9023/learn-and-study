package SQL.데이터베이스.데이터스트림;

import java.io.*;

//24년 1월 30 일
//용량 차이가 왜 다르게 나올까? 이유를 모르겟네
public class FileCopyEx {
    public static void main(String[] args) throws IOException {
        String originFileName = "C:/Temp/팬아트.png";
        String targetFileName = "C:/Temp/팬아트1.png";


        InputStream is = new FileInputStream(originFileName);
        OutputStream os = new FileOutputStream(targetFileName);

        byte[] data =  new byte[1024];
        while (true) {
            int num = is.read(data);
            if (num == -1)
                break;
                os.write(data,0,num);

        }
        /**
         * 아래transferTo는  16~ 21번 코드를 이 한줄로 축약할 수 있다
         */
        is.transferTo(os); //

        os.flush();
        os.close();
        System.out.println("카피완료! ");
    }
}
