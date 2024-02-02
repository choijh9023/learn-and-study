package project.SJmemo;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

// 메모장 응용프로그램 만들기
// 파일 입출력 + 컬렉션
// [기능]
//      - 메모 쓰기
//      - 메모 읽기
//      - 메모 삭제
//
// [데이터]
//      - 메모: 고유번호, 작성자, 메모내용, 날짜, 중요도
//      - 파일: memo.dat
//
// [프로그램 흐름]
//      - 프로그램 시작: 파일 모든 내용 읽기(파일 입출력) --> 메모리 저장(컬렉션)
//      - 프로그램 사용: 메모리 조작(컬렉션)
//      - 프로그램 종료: 메모리 저장(컬렉션) > 모든 파일 내용 쓰기(파일 입출력)
//
// 기능요구사항
//      -menu: 콘솔 첫 화면에 출력할 화면이며, 각 항목중에 선택값을 입력받습니다.
//      -pause: 각 기능에서 공통으로 들어갈 화면전환을 엔터로 할 수 있게 만들었습니다. 각 기능(메소드)마다 들어갑니다.
//      -add: 메모장의 쓰기 기능을 구현. 메모에 들어갈 값을 각각 따로 입력받아서 저장하고 메모내용에 해당하는 부분은 입력시 사용자가 엔터를 쓴다는 것을 감안하여 \r\n(엔터처리)하여,
//              만약 메모를 다 작성하고 'exit'를 입력하면 이전화면으로 나올 수 있게 구현합니다.
//              각각 입력받은 값을 Memo클래스 대입하고, ArrayList 배열에 추가합니다.
//      -getseq: 메모장 기능에 해당되는 고유번호. 만약 현재 memo.dat에 메모된 값이 총 3개라면 최대값에서 +1을 해주어 그다음 메모장 고유번호의 중복이 불가하게 설정합니다.
//      -getMemo: 확인할 메모의 고유번호를 입력받으면 그 고유번호를 확인하고 세부내용을 보여줍니다.
//      -part: 메모 읽기/삭제에 작업을 하기전, 해당 메모의 일부분 내용만 출력 해주는 메소드.
//             미리 입력받은 content (메모내용)를 불러와서 엔터 부분을 공백처리 해주며, 내용의 길이만큼 '...'이 나오게 처리 합니다.
//      -list: 메모장에 저장된 내용들을 읽습니다., 저장된 내용들의 일부분만 먼저 확인하고 세부내용은 고유번호를 선택하면 Memo 클래스에서 객체를 생성하여 대입된 값을 출력하게 해줍니다.
//              입력해야할 고유번호가 아닌 엔터키나 0을 입력하면 출력되지 않고 다음단계로 넘어갑니다.
//      -delete: 삭제하기전 메모장의 내용을 일부분만 확인 할 수 있게 먼저 출력해주며,  그 다음 삭제할 고유번호를 입력받은 뒤, ArrayList배열의 저장된 값중 고유번호와 일치하는 객체가 삭제됩니다.
//      -load: 사용자에게 콘솔 출력전 맨 처음 선언되며, 지정해준 DATA 경로값을 읽어오며 memo.dat의 형식인 CSV로 기록한 값을 콤마로 구분하였기 때문에 split(",")으로
//              각 콤마마다 값을 Memo 클래스에서 불러온 고유번호, 이름, 날짜, 중요도를 임의로 지정해준 배열에 저장시킨다.
//              또한 메모 내용은 memo가 끝나는 지점인 "============"이 아닐때 까지 변수에 메모내용을 엔터(\r\n)를 구분해서 저장시킨다.
//              마지막으로 그렇게 대입한 값을 ArrayList 배열에 추가한다.
//      - save: 마지막 단계 쓰기작업을 하는 BufferedWriter와 FileWriter 호출하여 Memo 클래스에 있는 값을 ArrayList로 저장시킨다.
public class MemoDao {
    private static String[] menuList = {"1. 메모 쓰기", "2. 메모 읽기", "3. 메모 삭제", "4. 종료"};
    static Scanner sc = new Scanner(System.in);
    static List<Memo> memoList = new ArrayList<>();
    static String DATA = "src/ssg0130/javaIO/test/memo.dat";

    // -getSeq: 메모장 기능에 해당되는 고유번호. 만약 현재 memo.dat에 메모된 값이 총 3개라면 최대값에서 +1을 해주어 그다음 메모장 고유번호의 중복이 불가하게 설정합니다.
    static String maxSeq = "0";
    static int textLength = 0;

    public static void menu() {
        System.out.println("==========[메모장]==========");
        load();

        for (String s : menuList) System.out.println(s);
        System.out.print("메뉴 선택 : ");
        String s = sc.nextLine();

        switch (s) {
            case "1":
                add();
                break;
            case "2":
                list();
                break;
            case "3":
                delete();
                break;
            case "4":
                System.out.println("종료합니다.");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                pause();
                break;
        }
    }

    // -add: 메모장의 쓰기 기능을 구현.
    //       메모에 들어갈 값을 각각 따로 입력받아서 저장하고 메모내용에 해당하는 부분은 입력시 사용자가 엔터를 쓴다는 것을 감안하여 \r\n(엔터처리)하여,
    //       만약 메모를 다 작성하고 'exit'를 입력하면 이전화면으로 나올 수 있게 구현합니다.
    private static void add() {

        StringBuilder sb = new StringBuilder(); // 메모장에 저장할 내용을 저장할 변수
        int seq = Integer.parseInt(maxSeq); // 메모의 고유번호를 저장할 변수

        try {
            System.out.println("입력 : (작성자,내용,중요도)");
            System.out.println("종료를 원하시면 exit를 입력하세요.");
            System.out.println("주의사항 : 내용은 최소 10글자 넘겨야합니다.");
            System.out.println("주의사항 : 중요도는 (A, B, C, D, E) 중에서 골라주세요");
            while (true) {
                System.out.println("작성자를 입력하세요.");
                String writer = sc.nextLine(); // 작성자
                if (writer.equals("exit")) break; // exit 입력시 종료하고 메뉴로 이동
                System.out.println("내용을 입력하세요. 내용을 그만 적고 싶으면 end 를 입력하세요.");
                String content = "";
                while (true) {
                    String line = sc.nextLine(); // 내용
                    if (line.equals("end")) {
                        break;
                    } else {
//                        content += line + "%";
                        // ***************************************
                        content += line + "\\n";
                    }
                }
                System.out.println("중요도를 입력하세요.");
                String level = sc.nextLine(); // 중요도
                if (level.equals("exit")) break; // exit 입력시 종료하고 메뉴로 이동

                    sb
                            .append(++seq).append(" | ") // 메모의 고유번호
                            .append(writer).append(" | ") // 작성자
                            .append(EnumTypeCheck(level)).append(" | ") // 중요도
                            .append(LocalDate.now()).append(" | ") // 날짜
                            .append(content).append("\r\n"); // 내용

            }

            Writer writer = new FileWriter(DATA, true);
            writer.write(sb.toString()); // 파일에 저장


            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        pause();
    }

    // enum 타입 체크 메소드
    // 잘못된 값이 들어오면 E를 반환
    private static String EnumTypeCheck(String s) {
        char c = s.toUpperCase().charAt(0);
        if (s.length() == 0 && ('A' < c && c < 'F')) return s.toUpperCase();
        else return "E";
    }

    // -getMemo: 확인할 메모의 고유번호를 입력받으면 그 고유번호를 확인하고 세부내용을 보여줍니다.
    private static void getMemo(int seq) {
        System.out.println("확인하고 싶은 메모의 고유번호를 입력하세요.");

        // 1. memoList에서 seq와 일치하는 객체를 찾아서 출력
        for (Memo memo : memoList) {
            if (memo.getSeq() == seq) {
                System.out.println("메모번호: " + memo.getSeq());
                System.out.println("작성자: " + memo.getWriter());
                System.out.println("내용: " + memo.printContent());
                System.out.println("날짜: " + memo.getCreateAt());
                System.out.println("중요도: " + memo.getLevel());
                break;
            }
        }
    }

    // -pause: 각 기능에서 공통으로 들어갈 화면전환을 엔터로 할 수 있게 만들었습니다. 각 기능(메소드)마다 들어갑니다.
    private static void pause() {
        menu();
    }

    // -part: 메모 읽기/삭제에 작업을 하기전, 해당 메모의 일부분 내용만 출력 해주는 메소드.
    //        미리 입력받은 content (메모내용)를 불러와서 엔터 부분을 공백처리 해주며, 내용의 길이만큼 '...'이 나오게 처리 합니다.
    private static void part(Memo memo) {
        // 메모장에 저장된 내용을 일부분만 출력
        System.out.printf("메모번호: %d \t | \t 작성자: %-20s \t | \t 내용: %s\n", memo.getSeq(), memo.getWriter(), memo.getContent().substring(0, 7) + "......");
    }

    // -list: 메모장에 저장된 내용들을 읽습니다.
    //        저장된 내용들의 일부분만 먼저 확인하고 세부내용은 고유번호를 선택하면 Memo 클래스에서 객체를 생성하여 대입된 값을 출력하게 해줍니다.
    //        입력해야할 고유번호가 아닌 엔터키나 0을 입력하면 출력되지 않고 다음단계로 넘어갑니다.
    private static void list() {
        for (Memo memo : memoList) {
            part(memo);
        }

        // 메모장에 저장된 내용을 세부내용 출력
        System.out.println("확인하고 싶은 메모의 고유번호를 입력하세요.");
        int seq = Integer.parseInt(sc.nextLine());
        getMemo(seq);

        pause();
    }

    // -delete: 삭제하기전 메모장의 내용을 일부분만 확인 할 수 있게 먼저 출력해주며,
    //          그 다음 삭제할 고유번호를 입력받은 뒤, ArrayList배열의 저장된 값중 고유번호와 일치하는 객체가 삭제됩니다.
    private static void delete() {
        for (Memo memo : memoList) {
            part(memo);
        }
        System.out.println("============");

        System.out.println("삭제할 메모의 고유번호를 입력하세요.");
        int seq = Integer.parseInt(sc.nextLine());

        // 1. memoList에서 seq와 일치하는 객체를 찾아서 삭제
        for (Memo memo : memoList) {
            if (memo.getSeq() == seq) {
                memoList.remove(memo);
                break;
            }
        }

        // 2. 삭제 한 내용을 memo.dat에 반영
        try {
            Writer writer = new FileWriter(DATA);

            // ArrayList에 저장된 내용을 StringBulider에 저장하여 파일에 쓰기
            StringBuilder sb = new StringBuilder();
            for (Memo memo : memoList) {
                sb.append(memo.getSeq()).append(",")
                        .append(memo.getWriter()).append(",")
                        .append(memo.getContent()).append(",")
                        .append(memo.getCreateAt()).append(",")
                        .append(memo.getLevel()).append("\r\n");
            }
            writer.write(sb.toString());

            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        pause();
    }

    // -load: 사용자에게 콘솔 출력전 맨 처음 선언되며, 지정해준 DATA 경로값을 읽어오며 memo.dat의 형식인 CSV로 기록한 값을 콤마로 구분하였기 때문에 split(",")으로
    //        각 콤마마다 값을 Memo 클래스에서 불러온 고유번호, 이름, 날짜, 중요도를 임의로 지정해준 배열에 저장시킨다.
    //        또한 메모 내용은 memo가 끝나는 지점인 "============"이 아닐때 까지 변수에 메모내용을 엔터(\r\n)를 구분해서 저장시킨다.
    //        마지막으로 그렇게 대입한 값을 ArrayList 배열에 추가한다.
    private static void load() {
        try {
            File file = new File(DATA);
            if (!file.exists()) return; // 파일이 존재하지 않으면 종료

            Reader reader = new FileReader(file);

            // 한줄씩 읽어와서 Memo 객체로 변환 후 ArrayList에 추가
            BufferedReader br = new BufferedReader(reader);


            memoList.clear(); // ArrayList 초기화
            while (true) {
                String line = br.readLine();
                if (line == null) break;
                Memo memo = Memo.fromCSV(line); // Memo 객체 생성
                memoList.add(memo); // ArrayList에 추가
                maxSeq = String.valueOf(memo.getSeq()); // 메모의 고유번호를 저장
            }

            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
