package oop.collection.app;

import java.util.TreeMap;

public class TreeMapEx {
    //TreeMap에 학생의 이름과 점수를 입력하고 검색하는 방법을 구현해 봅시다.
    public static void main(String[] args) {
        TreeMap<String , Integer> scores = new TreeMap();

        //이름(String, 점수 Integer) 저장
        scores.put("sam",75);
        scores.put("Tom",80);
        scores.put("sara",87);
        scores.put("sin",70);
        scores.put("adward",65);
        scores.put("kim",50);
        scores.put("kate",90);
        scores.put("billy",95);

        //foreach 문을 이용하여 오름차순 정렬된 scores의 학생의 이름과 점수들을 출력

        //특정 점수를 가져오기
        //가장낮은 점수 출력
        //가장 높은 점수 출력
        //90점 아래 점수
        //90점 위 점수
        //90점이거나 바로 아래 점수
        //80점 이거나 바로 위의 점수

        //내림차순 정렬하기


        //범위 검색(key : 이름이 b~k 학생의이름 과 점수 출력하라 )


        //범위 검색( 점수:80<= scores < 90 의 학생의 이름과 점수를 출력하라 )

    }

}
