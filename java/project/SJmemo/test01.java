package project.SJmemo;

import java.io.*;
import java.sql.ResultSet;

/*
파일 입출력 + 컬렉션

[기능]
 - 메모 쓰기
 - 메모 읽기
 - 메모 삭제

[데이터]
 - 메모 : 고유번호, 작성자, 메모내용, 날짜, 중요도
 - 파일 : memo.dat

[프로그램 흐름]
 - 프로그램 시작 : 파일 모든 내용 읽기 (파일 입출력) --> 메모리 저장(컬렉션)
 - 프로그램 사용 : 메모리 조작(컬렉션)
 - 프로그램 종료 : 메모리 저장(컬렉션) --> 파일 모든 내용 쓰기 (파일 입출력)
 */
public class test01 {
    public static void main(String[] args) {
        MemoDao dao = new MemoDao();
        dao.menu();
    }
}
