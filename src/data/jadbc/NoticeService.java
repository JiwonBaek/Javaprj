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
		 System.out.println("찾으시는 게시글 제목을 입력하세요!");
			Scanner scan = new Scanner(System.in);
			String notice = scan.next();//String 타입을 받는당.
			
		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		//String sql = "SELECT * FROM NOTICE";
		String sql = "SELECT * FROM NOTICE WHERE TITLE LIKE '%"+notice+"%'";

		// jdbc 드라이버 로드

		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 연결 인증
		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");

		// 실행
		Statement st = con.createStatement();

		// 결과 가져오기
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
		
		// 결과 사용하기
		// 'A'라는 글자를 갖는 문자를 찾는 열, 글자안에 A가 다 포함되면 된당.
				
		 rs.close();	
		 st.close();
	     con.close();
		
	     
	     return list;

		
	}

	
}
