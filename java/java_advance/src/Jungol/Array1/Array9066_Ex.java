package Jungol.Array1;

public class Array9066_Ex {
    public static void main(String[] args) {

        char[] charArray = new char[26];
        for (char i = 'A'; i <='Z'; i++) {

            charArray[i - 65] = i;

        }
        for(int a = 25; a>=0; a--){
            System.out.print( charArray[a] + " ");
        }
    }
}
