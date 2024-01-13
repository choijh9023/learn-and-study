package stream.collect;

public class Member {
    private String name;
    private Integer no;
    private String gender;

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", no=" + no +
                ", gender='" + gender + '\'' +
                ", point=" + point +
                '}';
    }

    private Integer point;

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Member(Integer no, String name, String gender) {
        this.name = name;
        this.no = no;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Integer getNo() {
        return no;
    }

    public String getGender() {
        return gender;
    }

    public Integer getPoint() {
        return point;
    }
}
