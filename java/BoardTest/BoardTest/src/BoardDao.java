
package src;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BoardDao {

        Scanner sc = new Scanner(System.in);
        List<Board> boards = new ArrayList<>();
        static int i = 1;
        public Board create() {
            System.out.println("***create");
            System.out.println("[세 개시물 입력]");
            System.out.println("제목: ");
            String title = sc.nextLine();
            System.out.println("내용: ");
            String content = sc.nextLine();
            System.out.println("작성자: ");
            String writer = sc.nextLine();

            System.out.println("게시글을 업로드 하시겠습니까? ");
            System.out.println("보조 메뉴 1.OK | 2.Cancel");
            System.out.println("메뉴 선택 ");
            String menuNum = sc.nextLine();
            Board row = new Board(i++, title, content,writer);
            row.setDate(getCurrentDate());
            if (menuNum.equals("1")){
                boards.add(row);
            }else{boards.remove(row);}


            return row;

             /*   try {
                    boards.add(row);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    exit();
                }*/
        }

        public void read() {
            if(boards.isEmpty()){
                System.out.println("읽을 게시물이 없습니다.");
                System.out.println("메인메뉴로 돌아갑니다");}
            else{System.out.println("---------------------------------------------");
                System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
                //Arrays.boards.forEach(s -> System.out.println(s));
                //list.forEach(s -> System.out.println(s));
                for (Board board : boards) {
                    System.out.printf("%-6d%-12s%-16s%-40s\n", board.getBno(), board.getBwriter(), board.getDate(), board.getBtitle());

                }
                System.out.println("[읽어볼 게시물을 번호를 입력해주세요]");

                readOne();}





        }
    public void readOne() {
        int num = Integer.parseInt(sc.next());
        Board b = null;
        for (Board board : boards) {
            if(num == board.getBno()){
                b= board;
                System.out.printf("bno :\n" + num);
                System.out.println("##########");
                System.out.println("번호 : "+ num);
                System.out.println("제목 :" + board.getBtitle());
                System.out.println("내용 :" + board.getBcontent());
                System.out.println("작성자 :" + board.getBwriter());
                System.out.println("날짜 : " + board.getDate());
                System.out.println("---------------------------------------------");
                System.out.println("보조메뉴 : 1. Update | 2. Delete | 3. List");
                System.out.println("메뉴선택 :");
                int menuNum = Integer.parseInt(sc.next());
                sc.nextLine();
                if (menuNum == 1) {
                    Update(num);
                }
                if (menuNum == 2) {
//                    delete(num);
                    delete(b);


                }
                if(menuNum ==3){
                }
                break;
            }
        }


    }
//    public void delete(int bno) { // 여기가 문제
//        boards.removeIf( row -> row.getBno() == bno);
//    }

    public void delete(Board board) {
            boards.remove(board);
    }

    public void Update(int bno) {
        for (Board board : boards) {
            if (board.getBno() == bno) {
                System.out.println("[수정내용 입력]");
                System.out.println("제목: ");
                String title = sc.nextLine();
                System.out.println("내용: ");
                String content = sc.nextLine();
                System.out.println("작성자: ");
                String writer = sc.nextLine();
                board.setBtitle(title);
                board.setBwriter(writer);
                board.setBcontent(content);
            }
        }
    }



    public String getCurrentDate() {
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        String CurrentDate = date.format(new Date());

        return CurrentDate;
    }

    public void Clear() {
        if (boards.isEmpty()) {
            System.out.println("삭제할 게시물이 존재하지 않습니다.");
            System.out.println("메인메뉴로 돌아갑니다");
        }else{ boards.clear();}

    }

    public void exit() {
        System.exit(0);}

}

