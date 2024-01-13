package interface_0;

public class Main {

    public static void main(String[] args) {

        Bank bank = new KBBank(); // 이것은 인터페이스 type인 bank 변수에 KBBank 클래스를 객체화 시킨것이다.
        bank.withDraw(100);
        bank.deposit(100);
        bank.findDormancyAccount("763231");
        Bank.BCAuth("KBBank"); // 인터페이스로의 직접접근이다.

        System.out.println("\n*************인스턴스 교체!!***************\n");

        bank = new KakaoBank();
        bank.withDraw(100);
        bank.deposit(100);
        bank.findDormancyAccount("4311");
        Bank.BCAuth("SHBank"); // 인터페이스로의 직접접근이다.

        System.out.println("\n*************카카오은행 연동 실패!!***************\n");
        //호환성 불가
		/*
		bank = new KakaoBank();
		bank.withDraw(100);
		bank.deposit(100);
		bank.findDormancyAccount("4311");
		*/

        System.out.println("\n*************대학교 주은행  교체!!***************\n");

        bank = new KBBank(); //new KBBank();
        bank.withDraw(20000);
        bank.deposit(1000);
        bank.findDormancyAccount("855512");
        Bank.BCAuth("SHBank");

    }
}
