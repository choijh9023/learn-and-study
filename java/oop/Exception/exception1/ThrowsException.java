package oop.Exception.exception1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
//다중Catch
public class ThrowsException {
    public static void main(String[] args) {
        ThrowsException test = new ThrowsException();
        try{

            test.loadClass("src/","fwwef");
        }
        catch(FileNotFoundException  | ClassNotFoundException cF){ //Surround try/multi-catch 선택하여 생성
            cF.getMessage();        //문제가 생긴 내용을 파일에 저장한 것을 log
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    //throws 예외 처리 미루기 : 메서드를 호출한 위치에서 예외를 처리하라!
    private Class loadClass(String fileNmae, String className)throws FileNotFoundException,ClassNotFoundException{
        FileInputStream fis = new FileInputStream(fileNmae);
        Class c = Class.forName(className);
        return c;
    }
}
