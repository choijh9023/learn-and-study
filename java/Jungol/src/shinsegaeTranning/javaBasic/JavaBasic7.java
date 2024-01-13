package shinsegaeTranning.javaBasic;

public class JavaBasic7 {
    public static void main(String[] args) {
        int num =4;
        for (int i = 1; i <= 3; i++) {
            for(int k = 0 ; k<3-i ; k++ ){
                System.out.printf(" ");
            }
            for(int j = 0 ; j<5-num; j++){
                System.out.printf("@");
            }num-=2;
            System.out.println();
        }
            int j = 0 ;
            for (int i = 1 ; i<=3; i++){
                System.out.printf("-");
                for(int k =0 +j ; k<3-j; k++ ){
                    System.out.printf("@");
                } j++;
                System.out.println();
            }


    }
}
