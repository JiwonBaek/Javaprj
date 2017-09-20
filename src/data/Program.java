package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*
		System.out.println("찾으시는 값을 입력하세요!");
		Scanner scan = new Scanner(System.in);
		String A = scan.next();// String 타입을 받는당.

		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		String sql = "SELECT * FROM NOTICE";

		// jdbc 드라이버 로드

		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 연결 인증
		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");

		// 실행
		Statement st = con.createStatement();

		// 결과 가져오기
		ResultSet rs = st.executeQuery(sql);

		// 결과 사용하기

		while (rs.next())
			if (rs.getString("title").indexOf(A) >= 0)// 'A'라는 글자를 갖는 문자를 찾는 열, 글자안에 A가 다 포함되면 된당.
				System.out.printf("ID : %s, TITLE : %s\n", rs.getString("id"), rs.getString("title"));

		rs.close();
		st.close();
		con.close();

		*/
		
		System.out.println("찾으시는 값을 입력하세요!");
		Scanner scan = new Scanner(System.in);
		String A = scan.next();//String 타입을 받는당.
		
		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		String sql = "SELECT * FROM NOTICE WHERE TITLE LIKE '%"+A+"%'";

		// jdbc 드라이버 로드

		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 연결 인증
		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");

		// 실행
		Statement st = con.createStatement();

		// 결과 가져오기
		ResultSet rs = st.executeQuery(sql);

		// 결과 사용하기
		
		while (rs.next())
			System.out.printf("ID : %s, TITLE : %s\n",rs.getString("id"),rs.getString("title"));
			//if (rs.getString("title").indexOf("A") >= 0)// 'A'라는 글자를 갖는 문자를 찾는 열, 글자안에 A가 다 포함되면 된당.
				

		rs.close();
		st.close();
		con.close();

	}

}
