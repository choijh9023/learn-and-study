package oop.collection.List.board.boardEx;

import java.util.ArrayList;
import java.util.List;



public class ArrayEx1 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(10);// 0번쨰 10
        list1.add(20); // 1번쨰 20
        list1.set(1, 100); // 1번쨰 100으로
        list1.remove(1); //1번쨰 삭제
        System.out.println(list1.hashCode());
        System.out.println(list1.size());

        //정수형 타입으로 2행 5열 배열에 1,2,3,4,5 6,7,8,9,10 초기화 해당 데이터를 할당하세요
        //Integer[][] idata = new Integer[2][5];
        Integer idata[][] = {{1,2,3,4,5},{6,7,8,9,10}};

        //5 출력
        System.out.println(idata[0][4]);
        //8 출력
        System.out.println(idata[1][2]);

        String dataset[] = {
                "Braund, Mr. Owen Harris",
                "Cumings, Mrs. John Bradley (Florence Briggs Thayer)",
                "Heikkinen, Miss. Laina",
                "Futrelle, Mrs. Jacques Heath (Lily May Peel)",
                "Allen, Mr. William Henry",
                "Moran, Mr. James",
                "McCarthy, Mr. Timothy J",
                "Palsson, Master. Gosta Leonard",
                "Johnson, Mrs. Oscar W (Elisabeth Vilhelmina Berg)",
                "Nasser, Mrs. Nicholas (Adele Achem)",
                "Sandstrom, Miss. Marguerite Rut",
                "Bonnell, Miss. Elizabeth",
                "Saundercock, Mr. William Henry",
                "Andersson, Mr. Anders Johan",
                "Vestrom, Miss. Hulda Amanda Adolfina",
                "Hewlett, Mrs. (Mary D Kingcome) ",
                "Rice, Master. Eugene",
                "Williams, Mr. Charles Eugene",
                "Vander Planke, Mrs. Julius (Emelia Maria Vandemoortele)",
                "Masselmani, Mrs. Fatima",
                "Fynney, Mr. Joseph J",
                "Beesley, Mr. Lawrence",
                "McGowan, Miss. Anna",
                "Sloper, Mr. William Thompson",
                "Palsson, Miss. Torborg Danira",
                "Asplund, Mrs. Carl Oscar (Selma Augusta Emilia Johansson)",
                "Emir, Mr. Farred Chehab",
                "Fortune, Mr. Charles Alexander",
                "Dwyer, Miss. Ellen",
                "Todoroff, Mr. Lalio"


        };
        Integer count = 0;
        for (int i = 0; i < dataset.length; i++) {
            if(dataset[i].indexOf("M")>=0){
                count++;
            }
        }
        System.out.println(count);
        Integer count1 = 0;
        for (int i = 0; i < dataset.length; i++) {
            if(dataset[i].contains("l")){
                count1++;
                System.out.println(dataset[i]);
            }
        }
        System.out.println(count1);

    }
}
