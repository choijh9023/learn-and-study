package Loop3;

public class Loop9059_Ex {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < 5 -i; j++) {
                System.out.print(" "); //5번
            }
            for (int a = 0; a < 2 * i - 1; a++) {
                System.out.print("*"); //1번
            }System.out.println();

        }

    }
}