package oop.collection.List.board;
//24년 1월 2일 리펙토링 하는 방법


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BoardDao {
    //field
    private Scanner sc = new Scanner(System.in);
    private List<Board> boards = new ArrayList<Board>();
    // constructor

    //method
    public void list() {
        System.out.println();
        mainMenu();
    }

    public void mainMenu() {
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("1.메인 메뉴: 1.Create | 2.Read | 3. Clear | 4.Exit");
        System.out.println("메뉴 선택: ");
        String menuNo = sc.nextLine();
        System.out.println();

        switch (menuNo) {
            case "1" -> create();   //게시물 생성 기능
            case "2" -> read();
            case "3" -> clear();
            case "4" -> exit();
        }
    }

    private void exit() {
        System.out.println("***exit()메소드 실행됨 프로그램 종료합니다.");
        System.exit(0);
    }

    private void clear() {
        if (boards.isEmpty()) {
            System.out.println("게시판이 비어있습니다");
        }
        System.out.println("[게시물 전체 삭제]");
        System.out.println("---------------------------------------");
        System.out.println("보조 메뉴: 1. Ok  |   2. Cancel");
        boards.clear();
        System.out.println("[게시물 목록]");
        System.out.println("---------------------------------------");
        list();
    }

    private void read() {

        System.out.println("전체 게시물 출력");
        if (boards.isEmpty()) {
            System.out.println("읽을 게시물이 없습니다.");
            list();
        } else {
            for (Board row : boards) {

                System.out.printf("%-6d%-12s%-16s%-40s\n", row.getBno(), row.getBwriter(), row.getBdate(), row.getBtitle());
            }
            System.out.println("원하시는 게시물의 번호가 있으시면 입력해 주세요!");
            int bno = sc.nextInt();
            readOne(bno);
        }
    }

    private void readOne(int bno) {
//        bno = Integer.parseInt(sc.nextLine());
        for (Board row : boards) {
            if (row.getBno() == bno) {
                System.out.printf("%-6d%-12s%-16s%-40s\n", row.getBno(), row.getBwriter(), row.getBdate(), row.getBtitle());
                System.out.println("----------------------------");
                System.out.println("보조 메뉴: 1. Update  |   2. Delete | 3. List");
                System.out.println("메뉴 선택");
                int menumNum = sc.nextInt();
                sc.nextLine();
                if (menumNum == 1) {
                    upDate(bno);
                }
                if (menumNum == 2) {
                    boards.remove(row);
                    list();
                }
                if (menumNum == 3) {
                    for (Board ro : boards) {
                        System.out.printf("%-6d%-12s%-16s%-40s\n", ro.getBno(), ro.getBwriter(), ro.getBdate(), ro.getBtitle());
                    }
                    list();
                }
            }
        }
    }



    private void upDate(int bno) {
        Board row = new Board();
        row.setBno(bno);
        System.out.println("제목 : ");
        row.setBtitle(sc.nextLine());
        System.out.println("내용 : ");
        row.setBcontent(sc.nextLine());
        System.out.println("작성자 : ");
        row.setBwriter(sc.nextLine());
        row.setBdate(getCurrentDate());
        System.out.println("---------------------------------------");
        System.out.println("보조 메뉴: 1. Ok  |   2. Cancel");
        System.out.println("메뉴 선택: ");
        String menuNo = sc.nextLine();
        if (menuNo.equals("1")) {
            try {
                boards.set(bno - 1, row);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }


        list();
    }

    private Board create() {
        //입력받은 게시물의 제목, 내용, 작성자를 Board객체에 저장하여 게시글 하나를 생성한다.
        Board row = new Board();
        System.out.println("[새 게시물 입력]");
        row.setBno(boards.size() + 1);
        System.out.println("제목 : ");
        row.setBtitle(sc.nextLine());
        System.out.println("내용 : ");
        row.setBcontent(sc.nextLine());
        System.out.println("작성자 : ");
        row.setBwriter(sc.nextLine());
        row.setBdate(getCurrentDate());
        //보조메뉴 출력
        System.out.println("---------------------------------------");
        System.out.println("보조 메뉴: 1. Ok  |   2. Cancel");
        System.out.println("메뉴 선택: ");
        String menuNo = sc.nextLine();
        if (menuNo.equals("1")) {
            try {
                boards.add(row);
                System.out.println("게시물 추가 완료!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                exit();
            }
        }    //게시물 목록 출력
        read();
        list();

        return row;
    }

    public String getCurrentDate() {
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        String currentDate = date.format(new Date());
        return currentDate;


    }



}



