package data.jadbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoticeService {


	public List<Notice> getList()throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		 System.out.println("ã���ô� �Խñ� ������ �Է��ϼ���!");
			Scanner scan = new Scanner(System.in);
			String notice = scan.next();//String Ÿ���� �޴´�.
			
		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		//String sql = "SELECT * FROM NOTICE";
		String sql = "SELECT * FROM NOTICE WHERE TITLE LIKE '%"+notice+"%'";

		// jdbc ����̹� �ε�

		Class.forName("oracle.jdbc.driver.OracleDriver");
		// ���� ����
		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");

		// ����
		Statement st = con.createStatement();

		// ��� ��������
		ResultSet rs = st.executeQuery(sql);

		//Model
		List<Notice>list =new ArrayList<>();
		
		while(rs.next()) {
			Notice n = new Notice();
			n.setId(rs.getString("ID"));
			n.setTitle(rs.getString("TITLE"));
			n.setContent(rs.getString("CONTENT"));
			
			list.add(n);
		}
		
		// ��� ����ϱ�
		// 'A'��� ���ڸ� ���� ���ڸ� ã�� ��, ���ھȿ� A�� �� ���ԵǸ� �ȴ�.
				
		 rs.close();	
		 st.close();
	     con.close();
		
	     
	     return list;

		
	}

	
}
