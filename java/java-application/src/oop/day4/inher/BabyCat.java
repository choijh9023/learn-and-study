package oop.day4.inher;

public class BabyCat extends ParentCat{//그림보면 알수 있다. // extends 뒤에는 무조건 하나밖에 못온다 왜냐? 단일상속이기때문에
private String color;
public
BabyCat(){

}

BabyCat(String color){
    super(); //super라는것은 부모생성자를 부르는것이다.
    this.color = color;
}
public void meow(){

    System.out.println("냐오옹!");
}
public void printInfo(){
    System.out.println(super.breed); // 부모(ParantCat)에서 가져오는것이다. 참고로 super.가 없어도 된다 만약 parentcat에서
                                    //protected 를 private로 바꾸면 가져올 수 없다.
    super.getBread();
    System.out.println(this.color);
}
}
