package Loop3;

public class Loop9057_Ex {
    public static void main(String[] args) {
        for(int i =0;i<=2;i++){
            for(int j =0;j<=i;j++){
                System.out.printf("*");
            }
            System.out.println();
        }  // 더한걸 빼주면 된다.
        for(int i =0;i<=2;i++){
            for(int j =2;j>=i;j--){
                System.out.printf("*");
            }
            System.out.println();
        }

    }
}
