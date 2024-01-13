package oop.day4.inher.Family;

public class SubFather extends Grandfather{
    private String familyName;
    private String father;
    private String HouseAddress;

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public void setHouseAddress(String houseAddress) {
        HouseAddress = houseAddress;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getHouseAddress() {
        return HouseAddress;
    }

    SubFather(){
        super();
        this.familyName=familyName;
        this.HouseAddress=HouseAddress;
    }

    public void printFather(){
        System.out.printf("나의 아버지는 %s\n",getFamilyName());
        System.out.printf("나의 집은 %s \n",getHouseAddress());
        System.out.printf("나는 %s입니다! \n나는 %s로부터 상속받습니다.",getFather(),getName());
        printGrandFather();
    }
}
