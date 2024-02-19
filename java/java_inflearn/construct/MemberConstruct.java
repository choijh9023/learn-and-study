package java_inflearn.construct;
/**24년 1월 13일 오후 7시 김영한강사님 생성자 수업
 *
 * @생성자에 대한 개념 확실하게 다시 잡고 넘어가야한다.
 * @생성자에 대한 내용
 * 프로그래밍을 하다보면 객체를 생성하고 이후에 바로 초기값을 할당해야하는 경우가 많다.
 * 따라서 앞서 initMember(...)와 같은 메서드를 매번 만들어야 한다.
 * 그래서 대부분의 객체 지향언어는 객체를 생성하자마자 즉시 필요한 기능을 좀 더 편리하게 수행할 수 있도록
 * 생성자라는 기능을 제공한다. 생성자를 사용하면 객체를 생성하는 시점에 즉시 필요한 기능을 수행할 수 있다.
 * 생성자는 앞서 살펴본 initMember(...)와 같이 메서드와 유사하지만 몇가지 다른 특징이 있다.
 */
public class MemberConstruct {
    String name;
    int age;
    int grade;

    @Override
    public String toString() {
        return "MemberConstruct{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }

    /**
     * 아래가 매개변수가 있는 생성자다
     * 그리고 생성자는 반환타입이 없다.
     * 아래의 코드처럼 생성자는 메소드의 기능도 할 수 있다. 
     * @param name
     * @param age
     * @param grade
     */
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name +
                ",age = "+ age +
                ",grade= "+grade);

        this.age = age;
        this.name = name;
        this.grade = grade;
    }

}
