package shinsegaeTranning.javaBasic;

public class JavaBasic6 {
    public static void main(String[] args) {
            int num = 4;
        for (int i = 1; i <= 5; i++) {
            for(int j = 0; j<5-i;j++){
                System.out.printf(" ");
            }
            for(int a = 0 ; a<5-num ; a++){
                System.out.printf("*");
            } num--;
            System.out.println();
        }
    }
}
