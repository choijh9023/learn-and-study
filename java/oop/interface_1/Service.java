package oop.interface_1;

public interface Service {
      //default 메소드

       default void defaultMethod1(){
           System.out.println("defalutMethod1()의 코드");
           defaultCommon();
       }
       default void defaultMethod2(){
           System.out.println("defalutMethod2()의 코드");
           defaultCommon();
       }


     //private 메소드
      private void defaultCommon(){
          System.out.println("defaultMethod의 중복코드 1");
          System.out.println("defaultMethod의 중복코드 2");
      }


    //정적 메소드
      static void staticMethod1(){
          System.out.println("staticMethod1의 종속코드 1");
          staticCommon();
            }
      static void staticMethod2(){
          System.out.println("staticMethod1의 종속코드 2");
          staticCommon();
      }

      //private  static 메소드
      private static void staticCommon(){
          System.out.println("staticMethod 중복 코드 3");
          System.out.println("staticMethod 중복 코드 4");
      }


}
