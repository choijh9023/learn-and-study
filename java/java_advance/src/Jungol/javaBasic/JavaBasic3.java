package Jungol.javaBasic;

public class JavaBasic3 {
    public static void main(String[] args) {


        while (true) {
            int disc1 = (int) (Math.random() * 6) + 1;
            int disc2 = (int) (Math.random() * 6) + 1;

            System.out.printf("(%d, %d)", disc1, disc2);
            if ((disc1 + disc2) != 5) {
                continue;
            }

            if ((disc1 + disc2) == 5) {
                break;
            }


        }
    }
}
