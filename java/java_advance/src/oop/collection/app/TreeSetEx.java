package oop.collection.app;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx {

        //TreeSet에 무작위로 점수를 입력하고 검색하는 방법
        public static void main(String[] args) {
            TreeSet<Integer> scores = new TreeSet<>();

            //Integer 점수 저장
            scores.add(75);
            scores.add(80);
            scores.add(87);
            scores.add(70);
            scores.add(65);
            scores.add(50);
            scores.add(90);
            scores.add(95);

            //점수를 foreach 문을 이용하여  scores의 점수들을 출력
            for(Integer s : scores) {
                System.out.print(s + " ");
            }
            System.out.println("\n");

            //특정 점수를 가져오기
            //가장낮은 점수 출력
            //가장 높은 점수 출력
            //90점 아래 점수
            //90점 위 점수
            //90점이거나 바로 아래 점수
            //80점 이거나 바로 위의 점수
            System.out.println("가장 낮은 점수: " + scores.first());
            System.out.println("가장 높은 점수: " + scores.last());
            System.out.println("90점 아래 점수: " + scores.lower(90));
            System.out.println("90점 위의 점수: " + scores.higher(90));
            System.out.println("90점이거나 바로 아래 점수: " + scores.floor(90));
            System.out.println("80점이거나 바로 위의 점수: " + scores.ceiling(80) + "\n");

            //내림차순 정렬하기
            NavigableSet<Integer> descendingScores = scores.descendingSet();
            for(Integer s : descendingScores) {
                System.out.print(s + " ");
            }
            System.out.println("\n");

            //범위 검색(80<=)
            NavigableSet<Integer> rangeSet = scores.tailSet(80, true);
            for(Integer s : rangeSet) {
                System.out.print(s + " ");
            }
            System.out.println("\n");


            //범위 검색(80<= scores < 90 )
            rangeSet = scores.subSet(80, true, 90, false);
            for(Integer s : rangeSet) {
                System.out.print(s + " ");
            }
        }

}
