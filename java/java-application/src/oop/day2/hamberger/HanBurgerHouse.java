package oop.day2.hamberger;

public class HanBurgerHouse {

    public static void main(String[] args) {
        /*//모든재료가 있는 햄버거
        Hamburger hamburger1 = new Hamburger(2,2,2,2,2);
        //빵과 패티와 치즈와 토마토가 햄버거
        Hamburger hamburger2 = new Hamburger(1,1,1,1);
        //빵과 패티와 치즈만 있는 햄버거
        Hamburger hamburger3 = new Hamburger(1,1, 1);
        */
        //2. JavaBean 패턴을 이용하여 햄버거 만들기
        HamburgerBean hamburgerBean1 = new HamburgerBean(); // 햄버거 만들어달라고 요청 -> 객체생성한거임
        // 빵과 패티 치즈2장 있는 햄버거 (떱치즈주세요오/.....?!?!?!?!!?!?!)
        hamburgerBean1.setBun(1); // 번을 하나 샛에서 가져온거임
        hamburgerBean1.setPatty(1); // 패티를 샛으로 햄버거 빈1객체에서 가져온거임
        hamburgerBean1.setCheese(2); //빈1객체에서 치즈를 2장 가져온거임
        // 빵과 패티(2) 토마토(2) 햄버거

        hamburgerBean1.setBun(1);
        hamburgerBean1.setPatty(2);
        hamburgerBean1.setTomato(2);

        //샛터방식의 문제점
        //1.객체 생성 일관성(컨시스턴스) --> 정체성의 문제 야기 ex) ->(햄버거냐 or 샌드위치냐),
        // 1--> 의 이유는 객체 생성부분과 값이 설정되는 부분이 물리적으로 분리되었기 때문에 // 샛터방식은 모두 선택변수(지역변수)를 사용했다.
        // 2.불변성 문제 야기
        //  2-->의 이유는 샛터방식은 private를 사용할 수 없다--> 이것은 보안의 문제와 데이터를 신뢰할 수 없고 데이터가 변경될 수 있는
        // 약점이 있다.

        //햄버거는 무조건 패티와, 빵이 있어야 하는데

        //3.생성자 객체, 자바빈즈 패턴의 장점만을 취한 Builder  패턴을 적용하여 Hamburger Builder클래스를 작성하세요
        // 작성하신 파일은 슬랙=> 실습채널에 제출해 주세요!
        HamburgerBuilder hamburgerBuilder = new HamburgerBuilder.Builder(2,2).cheese(3).build();

    }
}
