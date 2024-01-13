package oop.Generic;

import oop.collection.List.Board;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Generic8 {
    public static <T extends Comparable<T> & Cloneable>void printList(List<?> list){

            list.forEach(System.out::println);


    }



    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>(List.of(1,2, 3, 4, 5, 6, 7, 8, 9));
        List<String> strList = new ArrayList<>(List.of("str","good","baek","woo","god"));

        //Board 게시글을 저장한 리스트를 만들어 해당 글 내용(content)을 출력하도록
        // Board toString메소드에서 content만 리턴하는것으로 바꿔주면 된다.
        List<Board> boards = new ArrayList<>(List.of(new Board("처음 쓰는 글 ", "신난다 재미난다 ", "최문석"),
                new Board("두번쨰 쓰는 글","좋았어","백정훈"),
                new Board("새번째 쓰는 글 ","뿌이잉", "정휘제")));
        boards.add(new Board("어서오세요", "이러면 이해가 될거야", "ㅋㅋㅋ ")); // 별도 객체 생성 방식
        printList(numberList);
        printList(strList);
        printList(boards);

    }


}
