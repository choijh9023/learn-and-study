package java_inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//24년 1월
public class Ex1 {
    public static void main(String[] args) {
            printWcsTAsciiArt();
       /* List<Integer> answer = new ArrayList<>();
        answer.add(0,4);
        answer.add(1,3);
        System.out.println(answer.get(1));
        String a = "aa";
        System.out.println(a+a);*/

    }
    public static void printWcsTAsciiArt() {
        String wcsTArt =
                "   W   W  CCCC  SSS   -  TTTTT \n" +
                        "   W   W C      S         TT  \n" +
                        "   W W W C       SSS      TT  \n" +
                        "   W W W C           S    TT  \n" +
                        "    W W   CCCC  SSSS      TT  \n";

        System.out.println(wcsTArt);
    }
}
