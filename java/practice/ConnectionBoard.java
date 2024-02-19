package practice;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionBoard {

    ConnectionBoard(){}
    private static ConnectionBoard instance;  // 참조형 필드 반환용으로 선언

    static private Connection conn; // 정적필드 커넥션 필드 반환용선언
    public static ConnectionBoard getInstance() {
        if (instance == null) {
            instance = new ConnectionBoard();
        }
        return instance;
    }

    public Connection getConn() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("드라이버 연결 ");
            String url = "jdbc:mysql://localhost:3306/sqldb?serverTimezone=Asia/Seoul";
            String id = "root";
            String password = "9023";
            conn = DriverManager.getConnection(url, id, password);
            System.out.println("커넥션 연결");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;}


}
