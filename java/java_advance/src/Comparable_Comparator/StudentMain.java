package Comparable_Comparator;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class StudentMain {
    public static void main(String[] args) {
        Student student[] = new Student[5];
        //순서대로 "이름", 학번, 학점
        student[0] = new Student("Dave", 20240001, 4.2);
        student[1] = new Student("Amie", 20160001, 4.5);
        student[2] = new Student("Emma", 20110001, 3.5);
        student[3] = new Student("Brad", 20130001, 2.8);
        student[4] = new Student("Cara", 20140001, 4.2);
        //Student 클래스가 있다.
        //5명의 학생들의 정보를 관리하기 위해
        //Student 배열을 생성하여, 학번순으로 정렬해서 나타내고자 한다.  Comparable을 이용하여 정렬하세요
        Arrays.sort(student); // Arrays.sort는 잠깐 재정렬이 아니라 확정적으로 배열을 재정렬해주는것이다.
        System.out.println("학번 오름차순 정렬");
        Arrays.stream(student).forEach(stu -> System.out.println(stu)); // 포이치문 람다식

        /*과제2)
        Comparable을 이용해 학번 오름차순대로 정렬을 하였다.
        이 5명의 학생들 중에 성적우수자 2명을 선정하여 장학금을 지급하려 한다.
                이 때, 성적이 같은 학생이 여러 명이라면 학번이 빠른 순서대로 정하려고 한다.
                성적이 높은 학생 2명을 편하게 찾기 위해서 학생들을 "성적이 높은 순으로 정렬한 뒤, 앞에서 2명을 선택"
        성적이 높은 순서대로 정렬하는 후
        Student클래스의 기본 정렬 기준은 "학번 오름차순"이므로 이 기본 정렬 기준과 다른 새로운 정렬 기준을 세워야 하므로, Comparator를 이용하여
        Arrays.sort()내부에 정렬 기준으로 구현하시오.
        정렬 조건
        1) 학점이 높은 순서대로 (학점 내림차순)
        2) 학점이 같다면 학번이 빠른 순서대로(학번 오름차순)*/

        // 아직 이 부분 잘 이해하지 못했다.

        System.out.println("학점 내림차순 후 학번 오름차순 정렬");
        Arrays.sort(student, Student.COMPARATOR);
        Arrays.stream(student).limit(2).forEach(s -> System.out.println(s));

        Arrays.sort(student, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.score == o2.score) {
                    return Integer.compare(o1.id, o2.id);
                }
                return Double.compare((o2.id), o1.id);
            }
        });

        int cnt = 0;
        for(Student student1: student) {
            cnt++;
            if(cnt > 2) break;
            else System.out.println(student1.toString());

        }
    }}
