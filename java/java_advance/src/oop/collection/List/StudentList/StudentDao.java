package oop.collection.List.StudentList;

import oop.collection.List.Board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//여기서는 다오에 관한 모든것들이 오면 된다.
public class StudentDao {
    List<Student> studentList = new ArrayList<>(); // 스튜던트를 관리하기위한 리스트 생성
    Scanner sc = new Scanner(System.in); //성적 입력을 위한 생성시

    public void stuList() { // list 객체 생성
        studentList.add(new Student("제갈호상", 1));
        studentList.add(new Student("제갈휘제", 2));
        studentList.add(new Student("제갈문석", 3));
    }

    //fori를 사용해서 student를 하나씩 접근해서 setter를 사용해서 성적 기입
    public void studentExamInsert() { // 학생 성적 데이터 입력기
        for (Student student : studentList) { //성적기입 끝
            int[] scores = new int[3]; // 포문 끝나면 얘는 끝
            System.out.println(student.getName() + "의 국어, 영어, 수학 성적입력");
            scores[0] = Integer.parseInt(sc.nextLine());
            scores[1] = Integer.parseInt(sc.nextLine());
            scores[2] = Integer.parseInt(sc.nextLine());
            student.setScores(scores); // 이렇게 들어가는것을 몰랐다.
        }
    }

    // student를 찾았으니 getter를 통해서 성적을 가져와 sum에 더하고 sum을 기반으로 avg구하기
    public void studentRecordpPrint() { //학생 평균과 총점 구하는 기능
        System.out.println("조회할 학생의 학번을 적어주세요 ");
        int num = Integer.parseInt(sc.nextLine());
        int total = 0;
        int avg;
        for (Student student : studentList) {
            if (num == (student.getStuno()))
                for (int j = 0; j <= 2; j++) {
                    total += student.scores[j];
                }
        }
        avg = total / 3;
        System.out.println("조회하신 학생의 총점은 : " + total);
        System.out.println("조회하신 학생의 평균은 : " + avg);
    }

    public void studentPickPrint() { //학번으로 선택한 학생의 데이터 정보 및 성적 출력
        System.out.println("성적과 정보를 출력할 학생의 학번을 입력하세요");
        int stno = Integer.parseInt(sc.nextLine());
        for (Student student : studentList) {
            if (stno == student.getStuno()) {
                System.out.println("학생이름 :" + student.getName());
                System.out.println("학생번호 :" + student.getStuno());
                System.out.println("성적==========================");
                System.out.println("국어 : " + student.getScores()[0]);
                System.out.println("영어 : " + student.getScores()[1]);
                System.out.println("수학 : " + student.getScores()[2]);
            }
        }
    }

    public void studentPrintAll() { //전체 정보 및 성적 출력
        for (Student student : studentList) {
            System.out.println("학생이름 :" + student.getName());
            System.out.println("학생번호 :" + student.getStuno());
            System.out.println("성적==========================");
            System.out.println("국어 : " + student.getScores()[0]);
            System.out.println("영어 : " + student.getScores()[1]);
            System.out.println("수학 : " + student.getScores()[2]);
            System.out.println("==================================");
        }
    }

    public void studentUpdate() {
        System.out.println("성적을 변경할 학생의 학번을 적어주세요 ");
        int stno = Integer.parseInt(sc.nextLine());

        int[] scores = new int[3];
        for (Student student : studentList) {
           if(student.getStuno()==stno) {
               System.out.println("변경할 학생의 이름은 : "+student.getName());
               scores[0] = Integer.parseInt(sc.nextLine());
               scores[1] = Integer.parseInt(sc.nextLine());
               scores[2] = Integer.parseInt(sc.nextLine());
               student.setScores(scores);
           }

        }


    }
}

