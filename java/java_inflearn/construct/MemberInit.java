package java_inflearn.construct;
//24년 1월 13일 김영한 인프런 강의 this

/**내용
 * 맴버 변수에 접근하려면 앞에 this.라고 해주면 된다. 여기서 this는 인스턴스 자신의
 * 참조값을 가리킨다.
 *this는 생략할 수 있다. 이 경우 변수를 찾을떄 가까운 지역변수(매개변수도 지역변수다)를 먼저 찾고
 * 그 다음으로 맴버변수를 찾는다. 맴버변수도 없으면 오류가 발생한다.
 *------------------------------------------------------------
 */


public class MemberInit {
    String name;
    int age;
    int grade;
    void Initmember(String name, int age, int grade) {

        this.name = name;
        this.age = age;
        this.grade = grade;
    }

}
