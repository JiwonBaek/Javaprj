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
		System.out.println("ã���ô� ���� �Է��ϼ���!");
		Scanner scan = new Scanner(System.in);
		String A = scan.next();// String Ÿ���� �޴´�.

		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		String sql = "SELECT * FROM NOTICE";

		// jdbc ����̹� �ε�

		Class.forName("oracle.jdbc.driver.OracleDriver");
		// ���� ����
		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");

		// ����
		Statement st = con.createStatement();

		// ��� ��������
		ResultSet rs = st.executeQuery(sql);

		// ��� ����ϱ�

		while (rs.next())
			if (rs.getString("title").indexOf(A) >= 0)// 'A'��� ���ڸ� ���� ���ڸ� ã�� ��, ���ھȿ� A�� �� ���ԵǸ� �ȴ�.
				System.out.printf("ID : %s, TITLE : %s\n", rs.getString("id"), rs.getString("title"));

		rs.close();
		st.close();
		con.close();

		*/
		
		System.out.println("ã���ô� ���� �Է��ϼ���!");
		Scanner scan = new Scanner(System.in);
		String A = scan.next();//String Ÿ���� �޴´�.
		
		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		String sql = "SELECT * FROM NOTICE WHERE TITLE LIKE '%"+A+"%'";

		// jdbc ����̹� �ε�

		Class.forName("oracle.jdbc.driver.OracleDriver");
		// ���� ����
		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");

		// ����
		Statement st = con.createStatement();

		// ��� ��������
		ResultSet rs = st.executeQuery(sql);

		// ��� ����ϱ�
		
		while (rs.next())
			System.out.printf("ID : %s, TITLE : %s\n",rs.getString("id"),rs.getString("title"));
			//if (rs.getString("title").indexOf("A") >= 0)// 'A'��� ���ڸ� ���� ���ڸ� ã�� ��, ���ھȿ� A�� �� ���ԵǸ� �ȴ�.
				

		rs.close();
		st.close();
		con.close();

	}

}
