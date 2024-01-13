package oop.collection.List;
//24년 1월 2일 수업 신세계백엔드 오전수업
//컬렉션 강의 (게시판 만들기 수업)

public class BoardMain { //
    public static void main(String[] args) {


        BoardDao dao = new BoardDao();
//    List<Board> boardList = dao.getBoardList();

        //dao에 전체 게시물의 수를 제공하는 boardSize() 작성하여 전체 게시물 수확인
//    dao.boardSize();
//
//    dao.getBoardAll(boardList);

        //boardList에 글쓴사람의 이름을 전달하여 해당 글쓴이가 있는지를 확인한 후 있다면
        //글쓴이의 으름과 글 주제, 내용을 리턴 하여 출력하는
        //writerSearch(String writer) 메소드를 작성하세요

//    String writer = "JHJ";
//    dao.writerSearch(writer);

        //dao에 boardInsert(String subject, String writer, String content)메소드를 작성하여 새로운 글이 추가기능 구현하세요
        dao.boardInsert("쓰레드 프로그래밍1","sym","멀티스레드 프로그래밍 학습");
    }
}