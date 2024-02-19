package practice;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BoardDao {
    ConnectionBoard cb = new ConnectionBoard();
    BoardDao(){}
    Scanner sc = new Scanner(System.in);

    public void callmenu(
    ) {
        mainmenu();
    }
    public void mainmenu() {

        System.out.println("게시판을 실행합니다");
        System.out.println("원하는 메뉴를 클릭해주세요");
        System.out.println("1.create | 2.read | 3.clear | 4. exit");
        String menunum = sc.nextLine();
        switch (menunum) {
            case "1" -> create();
            case "2" -> read();
            case "3" -> clear();
            case "4" -> exit();
            default -> {System.out.println("다시 입력주세요");callmenu();}
        }
    }

    public void create() {
        ConnectionBoard instance = ConnectionBoard.getInstance();
        try {
            String sql = new StringBuilder().append("INSERT into boards ")
                    .append("bwriter,btitle,bcontent,bdate")
                    .append("values (?,?,?,now())").toString();

            PreparedStatement pstmt = instance.getConn().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            System.out.println("작성자");
            String writer = sc.nextLine();
            pstmt.setString(1,writer);
            System.out.println("제목");
            String title = sc.nextLine();
            pstmt.setString(2,title);
            System.out.println("내용");
            String content = sc.nextLine();
            pstmt.setString(3,content);

            String c = "select * from boards";
            PreparedStatement pc = cb.getConn().prepareStatement(c);
            System.out.println(pc);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void read() {

    }

    public void clear() {
    }

    public void exit() {
        System.exit(0);
    }
}
