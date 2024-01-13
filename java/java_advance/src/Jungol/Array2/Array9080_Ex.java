package Jungol.Array2;
// 공부 해볼것
public class Array9080_Ex {
    public static void main(String[] args) {
        int [][]a= new int[5][5];
        a[0][0]=1;
        System.out.println(1);
        for (int i = 1; i < 5; i++) {
            a[i][0]=1;
            a[i][i]=1;
            System.out.print("1 ");
            for (int j = 1; j < i; j++) {
                a[i][j]=a[i-1][j-1]+a[i-1][j];
                System.out.print(a[i][j] + " ");
            }
            System.out.println("1");
        }
    }
}


