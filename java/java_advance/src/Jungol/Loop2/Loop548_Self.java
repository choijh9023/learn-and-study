package Jungol.Loop2;
public class Loop548_Self { //행과 열로 생각하면 쉬웠다.
    public static void main(String[] args) {
        for(int i =2 ;i <= 4 ;i ++){
            for(int j= 1 ; j<=5;j++ ){
                int k=i*j;
                System.out.printf(i +" * " + j +" = " +"%2d" +"   ",k);
            }
            System.out.println();
        }


    }
}
