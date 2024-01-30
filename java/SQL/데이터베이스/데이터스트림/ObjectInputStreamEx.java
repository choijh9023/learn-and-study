package SQL.데이터베이스.데이터스트림;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

// 24년 1월 30일
// 객체 스트림 수업
public class ObjectInputStreamEx {
    public static void main(String[] args)throws Exception {
        FileOutputStream fs = new FileOutputStream("obj.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fs);

        //객체 생성
        Member member = new Member("박진영", 20);
        int[] arr = {1, 2, 3};

        // 객체를 역직렬화해서 파일에 저장
        // 객체는 입력할때 writeObject를 사용해야한다.
        // implements Serializable 객체가 있는 곳에 꼭 넣어줘야한다.
        oos.writeObject(member);
        oos.writeObject(arr);

        oos.flush();
        oos.close();
        fs.close();

        FileInputStream fis = new FileInputStream("obj.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Member m1 = (Member) ois.readObject();
        int[] arr2 = (int[]) ois.readObject();

        ois.close();
        fis.close();

        System.out.println(member);
        System.out.println(arr2);
        System.out.println(m1.name);
        System.out.println(m1.age);

        System.out.println(Arrays.toString(arr2));


    }

}
