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
		         //1. 메인메뉴 입력
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
			    
			   
				System.out.print("┌─────────────────────────────────┐\n");
				System.out.print("│                                 │\n");
				System.out.print("│            메인 메뉴            │\n");
				System.out.print("│                                 │\n");
				System.out.print("└─────────────────────────────────┘\n");	
				System.out.println("1. 성적 입력");
				System.out.println("2. 성적 출력");
				System.out.println("3. 종료");
				System.out.print("선택>"); 
			    Scanner scan = new Scanner(System.in);
			    return menu = scan.nextInt();
			      
				
		
		   }
}

		
		
		
		
		
		



