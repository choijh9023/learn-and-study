package oop.collection.List;
/*
24년 1월 3일 오전 수업 백터리스트 강의
무슨내용인지 아파서 솔직히 기억이 하나도 안난다.
공부 필요
*/

import java.util.List;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        List<Integer> list1 = new Vector<>(); // list1 은 Integer객체만 저장할 수 있다.
        List<Object> list2 = new Vector(); // 모든 타입의 객체를 저장할 수 있다.
        list1.add(30);
        list2.add("M");
        list2.add(50);
        list2.add(30.5);
        System.out.println(list2);
        List<oop.collection.List.Board> boards = new Vector<>();

        Thread threadA = new Thread() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    boards.add(new Board("제목" + i, "내용 " + i, "작성자" + i));

                }
            }

        };
        Thread threadB = new Thread() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    boards.add(new Board("제목" + i, "내용" + i, "글쓴사람" + i));
                }
            }
        };

        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();

        } catch (Exception e) {
            e.printStackTrace();
        }

        int size = boards.size();
        System.out.println("총 글의 수 :" + size);

        for (Board board : boards) {
            System.out.printf("%s   , %s   , %s   \n", board.getWriter(), board.getSubject(), board.getContent());
        }
    }
}

