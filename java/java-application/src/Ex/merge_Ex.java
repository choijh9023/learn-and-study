package Ex;

public class merge_Ex {
    private String name;
    //필드선언
    private int tel;
    public merge_Ex(){}
    //기본생성자
    public merge_Ex(String name,int tel){
        this.name = name;
        this. tel = tel;
        //함수
    }
    void merge_Ex1(String name){
        this.name = name;
        //함수
    }
    void printInfo(){
        System.out.println(name);
    }
}
