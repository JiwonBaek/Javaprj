 package functions;

import java.util.Scanner;

public class Hello5 {

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
            inputExam(exams);
            break;
         case 2:
            printExam(exams);
            break;
         case 3:   
            break EXIT;
         }
      }
   }

   public static void printExam(Exam[] exams) {
      // TODO Auto-generated method stub
	   
	    int kors=0; int engs =0; int maths=0;
		
		int total;
		float avg;
		
	System.out.print("┌─────────────────────────────────┐\n");
	System.out.print("│            성적 출력                                                                               │\n");
	System.out.print("└─────────────────────────────────┘\n");
	

	
	//while(i<3) //i=0;으로 설정하면 조건문 i<3의 3이 반복되는 수이다.
	for(int i =0; i<3; i++)
		{
				 kors=exams[i].kor;
				 engs=exams[i].eng;
				 maths=exams[i].math;
				
				 total =kors +engs +maths;
			     avg = total / 3;
			     
				System.out.printf("국어 :%d\n",kors);
				System.out.printf("영어 :%d\n",engs);
				System.out.printf("수학 :%d\n",maths);
				System.out.printf("총 점 :%d\n",total);
				System.out.printf("평균 :%f\n",avg);
				System.out.println("------------------------------");
			   //i++;
	 }
	}
	   
      


   public static void inputExam(Exam[] exams) {
      // TODO Auto-generated method stub
	   Scanner scan = new Scanner(System.in);
	   
	    System.out.print("┌──────────────────────────┐\n");
		System.out.print("│            성적    입력                                                       |\n");
		System.out.print("└──────────────────────────┘\n");
		
		int kors=0; int engs =0; int maths=0;
		
		for(int i=0; i<3; i++)//반복 3번
		{
						 
		do{
			if(kors<0|| kors>100)
			System.out.println("0~100까지의 값만을 입력해주세요.");
			
		    System.out.print("국어 :\n");//다시 성적을 입력할 수 있게 설정
		    kors= scan.nextInt();
	 	 
		   }while(kors<0||kors>100);
		
		
		    //0보다 작거나 100보다 크다면, 거짓이 될 때 까지 무한히 루프
		 do{
			if(engs<0||engs>100)
			System.out.println("0~100까지의 값만을 입력해주세요.");
			
			System.out.print("영어 :\n");
			engs = scan.nextInt();
			
		   }while(engs<0||engs>100);
				
		do{
			if(maths<0||maths>100)
			System.out.println("0~100까지의 값만을 입력해주세요.");
			
			System.out.print("수학 :\n");
			maths = scan.nextInt();
			
		  }while(maths<0||maths>100);
				
		        exams[i].kor =kors ;
				exams[i].eng=engs;
				exams[i].math=maths;
			  
		}
	
   }

			

   

   public static int inputMenu(int menu) {
      // TODO Auto-generated method stub
	 
	        
	   
			System.out.print("┌─────────────────────────────────┐\n");
			System.out.print("│                                                                                                        │\n");
			System.out.print("│            메인 메뉴                                                                               │\n");
			System.out.print("│                                                                                                        │\n");
			System.out.print("└─────────────────────────────────┘\n");	
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 종료");
			System.out.print("선택>"); 
		    Scanner scan = new Scanner(System.in);
		    menu = scan.nextInt();
		      
			
			return menu;
	   
     
   }

}