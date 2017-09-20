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
         case 1: // �Խñ� �Է�
            inputNotice();
            break;
         case 2: // �Խñ� ��ȸ
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
			
			System.out.printf("ID : %s, ���� : %s, �ۼ��� : %s\n",n.getId(),n.getTitle(),n.getContent());
		}
	
		
	
      
   }

   private static void inputNotice() throws ClassNotFoundException, SQLException {
      
      //��������� NOTICE �����͸� �Է� �޾ƾ� ����?
	   System.out.println("ID, ����, �ۼ��ڸ� �Է����ּ���!");
		
	    Scanner scan    = new Scanner(System.in);
	    System.out.println("ID�� �Է����ּ���!");
	    String  id      = scan.next();
	    System.out.println("������ �Է����ּ���!");
		String  title   = scan.next();
		System.out.println("�ۼ��ڸ��� �Է����ּ���!");
		String  content = scan.next();
		
      
      String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
      String sql = "INSERT INTO NOTICE(ID, TITLE, CONTENT) VALUES('"+id+"','"+title+"','"+content+"')";
      
      // Jdbc ����̹� �ε�
      Class.forName("oracle.jdbc.driver.OracleDriver");
      
      // ���� / ����
      Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
      
      // ����
      Statement st = con.createStatement();
      
      st.executeUpdate(sql);
      
      st.close();
      con.close();
      
   }

   private static int inputMenu() {
	     int menu;
		System.out.print("����������������������������������������������\n");
		System.out.print("��                     ��\n");
		System.out.print("��      ���� �޴�      ��\n");
		System.out.print("��                     ��\n");
		System.out.print("����������������������������������������������\n");	
		System.out.println("1. �Խñ� �Է�");
		System.out.println("2. �Խñ� ��ȸ");
		System.out.println("3. ����");
		System.out.print("����>"); 
	   
		Scanner scan = new Scanner(System.in);
	    return menu = scan.nextInt();
    
   }

}