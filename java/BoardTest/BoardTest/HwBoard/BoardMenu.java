package HwBoard;
import java.util.Scanner;
import java.util.SortedMap;

public class BoardMenu {

  BoardDao boardDao = new BoardDao();
  Scanner sc = new Scanner(System.in);

  public void printMenu() {
    System.out.println("[게시물 목록]");
    System.out.println("-------------------------------------------");
    System.out.printf("%-6s%-14s%-16s%-20s\n", "no", "writer", "date", "title");
    System.out.println("-------------------------------------------");
    boardDao.listBoredsPrint();
    System.out.println("-------------------------------------------");
    mainMenu();
  }

  public void mainMenu() {
    System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
    System.out.print("메뉴 선택: ");

    int num = Integer.parseInt(sc.nextLine());

    switch (num) {
      case 1 -> {
        System.out.println("1.OK | 2.NO");
        if (1 == Integer.parseInt(sc.nextLine())) {
          boardDao.addBoard();
        }
        else System.out.println("==추가하지 않습니다==");
      }
      case 2 -> {
        System.out.println("[게시물 읽기]");
        System.out.print("bno입력: ");
        int inputBno = Integer.parseInt(sc.nextLine());
        if(boardDao.verifyBno(inputBno)){ // 있는 게시물인지 확인
          boardDao.readBoard(inputBno);

          System.out.println("1.Update | 2.Delete | 3.List");
          int inputNum = Integer.parseInt(sc.nextLine());

          switch (inputNum) {
            case 1 -> boardDao.update(inputBno);
            case 2 -> boardDao.delete(inputBno);
            case 3 -> System.out.println("==리스트로 돌아갑니다.==");
          }
        }
      }
      case 3 -> {
        System.out.println("[게시물 전체 삭제]");
        System.out.println("---------------------------------");
        System.out.println("1.OK | 2.NO");
        int inputNum = Integer.parseInt(sc.nextLine());
        switch (inputNum) {
          case 1 -> boardDao.clear();
          case 2 -> System.out.println("==전체삭제하기 취소==");
        }
      }
      case 4 -> System.exit(0);
    }
    printMenu();


  }
}
