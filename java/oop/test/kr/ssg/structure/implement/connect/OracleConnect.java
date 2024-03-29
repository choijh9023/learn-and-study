package oop.test.kr.ssg.structure.implement.connect;

// 자바 개발자는 오라클 connect 클래스를 구현할 필요가 없다. 벤더에서 제공
public class OracleConnect implements DbConnect {
	@Override
	public void getConnection(String url, String userId, String pwd) {
		System.out.println("url : " + url);
		System.out.println("userId : " + userId);
		System.out.println("pwd : " + pwd);
		System.out.println("Oracle DB 접속 성공!");
	}
}
