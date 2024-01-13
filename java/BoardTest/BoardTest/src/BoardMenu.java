package src;
import java.util.Scanner;

public class BoardMenu {

    BoardDao dao = new BoardDao();

    Scanner sc = new Scanner(System.in);
    public void mainmenu() {
        System.out.println("-------------------------------------");
        System.out.println("메인메뉴 : 1. Creat | 2. Read | 3. Clear | 4. Exit");
        System.out.println("메뉴선택");
        String menuNum = sc.nextLine();
        switch (menuNum){
            case "1" -> {dao.create(); mainmenu();}
            case "2" -> {dao.read(); mainmenu();}
            case "3" -> {dao.Clear(); mainmenu();}
            case "4" -> dao.exit();
        }
    }
}
