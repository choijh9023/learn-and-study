package oop.collection.List;
//24년 1월 2일 수업 신세계백엔드 오전수업
//컬렉션 강의 (게시판 만들기 수업)
import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    List<Board> boardList = new ArrayList<Board>();

    public List<Board> getBoardList() {
        //인터페이스 타입선언, arraylist, linkedList..등등 다 담을 수 있다.

        //5명이 글을 작성하였습니다. 5명이 쓴 글에대해 글 쓴 순서대로 boardList에 저장하세요
        boardList.add(new Board("자바심화프로그래밍1", "오늘은 컬랙션 프레임워크1", "SYM"));
        boardList.add(new Board("자바심화프로그래밍2", "오늘은 컬랙션 프레임워크2", "JHJ"));
        boardList.add(new Board("자바심화프로그래밍3", "오늘은 컬랙션 프레임워크3", "SYM"));
        boardList.add(new Board("자바심화프로그래밍4", "오늘은 컬랙션 프레임워크4", "SYM"));
        boardList.add(new Board("자바심화프로그래밍5", "오늘은 컬랙션 프레임워크5", "SYM"));

        return boardList;
    }

    public void getBoardAll() {
        //Board의 전체 글 조회
        for (Board board : boardList) {
            System.out.println("글쓴이: " + board.getWriter() + " 제목: " + board.getSubject() + " 내용: " + board.getContent());
        }
    }

    public void boardSize() {
        System.out.println("현재 총 게시글 수는 " + boardList.size() + "입니다.");

    }

    public void writerSearch(String writer) {
        for (Board board : boardList) {
            if (board.getWriter().equals(writer)) {
                System.out.println("글쓴이: " + board.getWriter() + " 제목: " + board.getSubject() + " 내용: " + board.getContent());
            }
        }
    }

    public void boardInsert(String subject, String writer, String content) {
        Board board = new Board(subject, writer, content);
        boardList.add(board);
        getBoardAll();
    }

}