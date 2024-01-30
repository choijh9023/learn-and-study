package SQL.데이터베이스.데이터스트림;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx01 {
    public static void main(String[] args) {
        try{

            InputStream is = new FileInputStream("C:/Temp/test.text");

           while(true){
               int data = is.read();
               if(data==-1){
                   break; }
                   System.out.println(data);


           }
            is.close();
        } catch (FileNotFoundException e){ // 파일이 없을때의 예외발생시 예외처리
            e.printStackTrace();

        } catch (IOException io){
            io.printStackTrace();

        }


    }
}
