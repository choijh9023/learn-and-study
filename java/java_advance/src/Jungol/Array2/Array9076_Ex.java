package Jungol.Array2;

public class Array9076_Ex {
    public static void main(String[] args) {
        int []arr = new int[40];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < 40; i++) {
            arr[i]=arr[i-1]+arr[i-2];

        }
        System.out.println("피보나치 수열 10항 : "+arr[9]);
        System.out.println("피보나치 수열 20항 : "+arr[19]);
        System.out.println("피보나치 수열 30항 : "+arr[29]);
        System.out.println("피보나치 수열 40항 : "+arr[39]);
    }
}
