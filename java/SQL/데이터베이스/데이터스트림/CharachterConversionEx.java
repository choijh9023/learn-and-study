package SQL.데이터베이스.데이터스트림;

import java.io.*;

// UTF - 8 문자셋으로 파일에 문자열을 저장하고, 저장된 문자를 다시 일어서 콘솔에 출력하는 프로그램을 만드시오
public class CharachterConversionEx{
    public static void main(String[] args)throws Exception {
        write("너에게 닿기를!!이렇게 하면 그만아니야? ");
        read();


    }

    public static void write(String str)throws Exception {
        //FileWriter fw = new FileWriter("")
        OutputStream os = new FileOutputStream("data.txt");
        Writer writer = new OutputStreamWriter(os,"UTF-8"); // UTF-8로 변경해서 작성하라
        writer.write(str);
        writer.flush();
        writer.close();
    }

    public static void read()throws Exception {
        //인풋스트림과 리드를 사용한 경우
        InputStream is = new FileInputStream("data.txt");
        Reader reader = new InputStreamReader(is,"UTF-8");

        char[] data = new char[100];
        int num = reader.read(data);
        reader.close();
        String str = new String(data);
        System.out.println(str);

        //버퍼드리더를 쓰는 경우는 줄이 여러줄일경우(엔터를 기준으로) 와일 트루문으로 출력을 하면 된다.
        // 안그러면 한줄로 출력이 된다.
        //버퍼드리더가 좀 더 향상된 스트림이다.
        FileReader is1 = new FileReader("data.txt");
        BufferedReader reader1 = new BufferedReader(is1);
        String data1 = reader1.readLine();
        System.out.println(data1);
   }

}
