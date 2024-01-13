package HwBoard;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BoardDao {
  List<Board> boardList = new ArrayList<>();

  Scanner sc = new Scanner(System.in);
  static int i = 1;

  BoardDao() {
    boardList.add(new Board(i++, "책제목1", "내용1", "서유미1", getDate()));
    boardList.add(new Board(i++, "책제목2", "내용2", "서유미2", getDate()));
    boardList.add(new Board(i++, "책제목3", "내용3", "서유미3", getDate()));
  }

  public void listBoredsPrint() {
    for (Board row : boardList) {
      boardPrint(row);
    }
  }

  public void boardPrint(Board board) {
    System.out.printf("%-6d%-12s%-16s%-20s\n", board.getBno(), board.getBwriter(), board.getData(), board.getBtitle());
  }

  public String getDate() {
    SimpleDateFormat date = new SimpleDateFormat("yyyy-mm-dd");
    String day = date.format(new Date());
    return day;
  }

  public void addBoard() {
    System.out.print("제목입력: ");
    String title = sc.nextLine();
    System.out.print("내용입력: ");
    String content = sc.nextLine();
    System.out.print("작성자 입력: ");
    String writer = sc.nextLine();
    Board board = new Board(i++, title, content, writer, getDate());
    boardList.add(board);
  }

  public void readBoard(int inputBno) {
    for (Board row : boardList) {
      if (row.getBno() == inputBno) {
        boardPrint(row);
      }
    }
  }

  public boolean verifyBno(int inputBno) { // 게시물있는지 확인용
    boolean isBno = false;
    for (Board row : boardList) {
      if (row.getBno() == inputBno) {
        isBno = true;
        return isBno;
      }
    }
    if (!isBno) {
      System.out.println("==그딴거없습니다==");
    }
    return isBno;
  }

  public void update(int inputBno) {
    System.out.println("수정 내용 입력");
    System.out.print("제목: ");
    String title = sc.nextLine();
    System.out.print("내용: ");
    String content = sc.nextLine();
    System.out.print("작성자: ");
    String writer = sc.nextLine();

    System.out.println("1.OK | 2.Cancel");
    int select = 0;
    try{
      select = Integer.parseInt(sc.nextLine());
    }catch (NumberFormatException e){
      System.out.println(e.getMessage());
    }
    switch (select) {
      case 1 -> {
        for (Board row : boardList) {
          if (row.getBno() == inputBno) {
            row.setBtitle(title);
            row.setBcontent(content);
            row.setBwriter(writer);
          }
        }
        System.out.println("==수정 완료==");
      }
      case 2 -> {
        System.out.println("==수정하지 않습니다.==");
      }
      default -> {
        System.out.println("==잘못입력==");
      }
    }
  }

  public void delete(int inputBno) {
    boardList.removeIf(row -> row.getBno() == inputBno);
    System.out.println("==삭제되었습니다==\n");
  }

  public void clear() {
    boardList.clear();
    System.out.println("==전체삭제되었습니다==");
  }


}
