package stream.collect;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionEx {
    public static void main(String[] args) {
        List<Member> memberlist = Arrays.asList
                (new Member(1, "백정훈", "M"),
                        new Member(2, "백종우", "M"),
                        new Member(3, "문지환", "M"),
                        new Member(4, "최문순", "F"),
                        new Member(5, "전두슌", "F"));

        List<Member> menList = memberlist.stream().
                filter(member -> member.getGender().equals("M")).toList();

        List<Member> menList2 = menList.stream()
                .filter(member -> member.getGender().equals("M"))
                .collect(Collectors.toList());
        System.out.println("남자만 출력한 방법 1 = " + menList);
        System.out.println("남자만 출력한 방법 2 = " + menList2);

        //회원정보 리시트에서 이름만 추출하고 출력하세요
        memberlist.stream().forEach(member -> System.out.println(member.getName())); // 포이치문을 사용하여 이름만 뺴서 출력하는 부분
        //회원의 회원 번호를 키로 회원의 이름을 값으로 하여 Map으로 생성하고 출력하세요
        // 이거 잘모르니까  잘 해볼것
        Map<Integer, String> map = memberlist.stream() // 맵은 이렇게 생성하고 출력하면 된다. (참조변수)
                .collect(Collectors.toMap(member -> member.getNo(), member -> member.getName()));
        //

        System.out.println("Map을 사용해서 출력한 결과 = " + map);

        //"M" "F" 키로 설정하여 List<Member>를 값으로 갖는 map을 생성하세요.
        Map<String, List<Member>> genderGroup
                = memberlist.stream().collect(Collectors.groupingBy(Member::getGender));
        System.out.println("==남성회원 리스트==");
        List<Member> maleMemberList = genderGroup.get("M");
        maleMemberList.stream().forEach(member -> System.out.println(member.getName()));

        System.out.println("==여성회원 리스트==");
        List<Member> femaleMemberList = genderGroup.get("F");
        femaleMemberList.stream().forEach(member -> System.out.println(member.getName()));
    }
}
