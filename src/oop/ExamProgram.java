package oop;
import java.util.Scanner;

public class ExamProgram {
   
	public static void main(String[] args) {
		            
		      Exam exam = new Exam();
		      
		    
		      int menu = 0;
		      
		      EXIT:
		      while(true) {
		         //1. ���θ޴� �Է�
		         menu = inputMenu(menu);
		         
		         switch(menu) {
		         case 1:
		            exam.input();
		            break;
		         case 2:		      
		            exam.print();
		            break;
		            
		         case 3:   
		            break EXIT;
		         }
		      }
		   }
	
		   public static int inputMenu(int menu)
		   {
		      // TODO Auto-generated method stub
			    
			   
				System.out.print("����������������������������������������������\n");
				System.out.print("��                     ��\n");
				System.out.print("��      ���� �޴�      ��\n");
				System.out.print("��                     ��\n");
				System.out.print("����������������������������������������������\n");	
				System.out.println("1. ���� �Է�");
				System.out.println("2. ���� ���");
				System.out.println("3. ����");
				System.out.print("����>"); 
			    Scanner scan = new Scanner(System.in);
			    return menu = scan.nextInt();
			      
				
		
		   }
}

		
		
		
		
		
		



