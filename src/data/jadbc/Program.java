package data.jadbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import oracle.net.aso.n;

public class Program {

   public static void main(String[] args) throws ClassNotFoundException, SQLException {
      
	   
	  
	   
      while(true) {
    	
    	  
         switch(inputMenu())
         {
         case 1: // 게시글 입력
            inputNotice();
            break;
         case 2: // 게시글 조회
            listNotice();
            break;
         case 3:
        	 break;
            
         }
      }
   }

   private static void listNotice() throws ClassNotFoundException, SQLException {
	   
	   NoticeService service = new NoticeService();

		//-------view-------------
		List<Notice>list =service.getList();
		
	   for(Notice n : list) {
			
			System.out.printf("ID : %s, 제목 : %s, 작성자 : %s\n",n.getId(),n.getTitle(),n.getContent());
		}
	
		
	
      
   }

   private static void inputNotice() throws ClassNotFoundException, SQLException {
      
      //사용자한테 NOTICE 데이터를 입력 받아야 하지?
	   System.out.println("ID, 제목, 작성자를 입력해주세요!");
		
	    Scanner scan    = new Scanner(System.in);
	    System.out.println("ID를 입력해주세요!");
	    String  id      = scan.next();
	    System.out.println("제목을 입력해주세요!");
		String  title   = scan.next();
		System.out.println("작성자를를 입력해주세요!");
		String  content = scan.next();
		
      
      String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
      String sql = "INSERT INTO NOTICE(ID, TITLE, CONTENT) VALUES('"+id+"','"+title+"','"+content+"')";
      
      // Jdbc 드라이버 로드
      Class.forName("oracle.jdbc.driver.OracleDriver");
      
      // 연결 / 인증
      Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
      
      // 실행
      Statement st = con.createStatement();
      
      st.executeUpdate(sql);
      
      st.close();
      con.close();
      
   }

   private static int inputMenu() {
	     int menu;
		System.out.print("┌─────────────────────┐\n");
		System.out.print("│                     │\n");
		System.out.print("│      메인 메뉴      │\n");
		System.out.print("│                     │\n");
		System.out.print("└─────────────────────┘\n");	
		System.out.println("1. 게시글 입력");
		System.out.println("2. 게시글 조회");
		System.out.println("3. 종료");
		System.out.print("선택>"); 
	   
		Scanner scan = new Scanner(System.in);
	    return menu = scan.nextInt();
    
   }

}