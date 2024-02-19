package java_inflearn.construct;

import java.util.Arrays;
import java.util.MissingFormatArgumentException;

/**24년 2월 8일 인프런 생성자 강의
 * 생성자는 인스턴스를 생성하고 나서 즉시 호출된다. 생성자를 호출하는 방법은 다음 코드와 같이
 * new 명령어 다음에 생성자 이름과 매개변수에 맞추어 인수를 전달하면 된다.
 * new 생성자이름(생성자에 맞는 인수 목록)
 * new 클래스이름(생성자에 맞는 인수 목록)
 * 참고로 생성자이름이 클래스 이름이기 때문에 둘다 맞는 표현이다.
 *
 * new MemberConstruct("user1", 15,90)
 *
 * 생성자의 장점
 * 중복 호출 제거
 * 생성자가 없던 시절에는 생성 직후에 어떤 작업을 수행하기 위해 다음과 같이 메서드를 직접 한번 더 호출해야 했다.
 * 생성자 덕분에 객체를 생성하면서 동시에 생성 직후에 필요한 작업을 한번에 처리할 수 있게 되었다.
 *생성자 등장 전 MemberInit member = new MemberInit();
 * member.initMember("user1",15,90);
 *
 * 생성자 등장 후
 * MemberConstruct member = new MemberConstruct("user1",15,90);
 *
 * 제약 - 생성자 호출 필수
 * 객체를 생성할때 미리 정의를 해놓은 틀을 틀린다면 호출이 되지 않는다.
 * 생성자를 생성하면 입력값에 제약을 넣어줄 수 있다.
 *
 */
public class ConstructMain1 {
    public static void main(String[] args) {
        /**
         *
         */
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 19, 99);
        MemberConstruct[] memberlist = {member1, member2};
        MemberConstruct[] memberlist2 = new MemberConstruct[2];
        memberlist2[0] = member1;
        memberlist2[1] = member2;
        for (MemberConstruct memberConstruct : memberlist) {
            System.out.println(memberConstruct.toString());
        }
        System.out.println(memberlist);
        System.out.println(memberlist2);
        System.out.println(Arrays.stream(memberlist).findFirst());





    }
}
