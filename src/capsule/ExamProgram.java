package capsule;
import java.util.Scanner;

public class ExamProgram {
   
	public static void main(String[] args) {
		            
		      Exam[] exams = new Exam[3];
		      
		      for(int i=0; i<3; i++)
		         exams[i] = new Exam();
		            
		      int menu = 0;
		      
		      EXIT:
		      while(true) {
		         //1. ���θ޴� �Է�
		         menu = inputMenu(menu);
		         
		         switch(menu) {
		         case 1:
		            Exam.input(exams);
		            break;
		         case 2:
		            Exam.print(exams);
		            break;
		         case 3:   
		            break EXIT;
		         }
		      }
		   }
	
		   public static int inputMenu(int menu)
		   {
		      // TODO Auto-generated method stub
			    
			   
				System.out.print("����������������������������������������������������������������������\n");
				System.out.print("��                                                                                                        ��\n");
				System.out.print("��            ���� �޴�                                                                               ��\n");
				System.out.print("��                                                                                                        ��\n");
				System.out.print("����������������������������������������������������������������������\n");	
				System.out.println("1. ���� �Է�");
				System.out.println("2. ���� ���");
				System.out.println("3. ����");
				System.out.print("����>"); 
			    Scanner scan = new Scanner(System.in);
			    return menu = scan.nextInt();
			      
				
		
		   }
}

		
		
		
		
		
		



