package SQL.데이터베이스.데이터스트림;

import java.io.Serializable;

public class Member implements Serializable {

    private static final long serialVersionUID = 10000000l;
    String name;
    transient Integer age; //transient 직렬화에서 제외하는것

    public Member(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
