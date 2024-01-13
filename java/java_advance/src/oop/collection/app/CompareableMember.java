package oop.collection.app;

import oop.collection.HashSet.Member;

import java.util.TreeSet;

public class CompareableMember {
    public static void main(String[] args) {
        TreeSet<Member> member = new TreeSet<>();
        //객체 저장
        member.add(new Member("김진영,", 22));
        member.add(new Member("김진아,", 21));
        member.add(new Member("김소영,", 20));
        member.add(new Member("김진영,", 25));

        for (Member member1 : member) {
            System.out.println(member1.name + " "+ member1.age);
        }
        TreeSet<Integer> numers = new TreeSet<>();
        numers.add(4);
        numers.add(1);
        numers.add(14);
        numers.add(10);
        for (Integer numer : numers) System.out.println(numer);
    }
}
