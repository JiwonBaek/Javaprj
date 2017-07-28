package capsule;

import java.util.Scanner;

public class Exam {
   int kor;
   int eng;
   int math;
   
   
   public static void print(Exam[] exams) {
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
		
	   
    }
   }

   public static void input(Exam[] exams) {
      // TODO Auto-generated method stub
	   Scanner scan = new Scanner(System.in);
	    
	    int kors=0;
		int engs=0;
		int maths=0;
	
		
			System.out.print("┌─────────────────────────────────┐\n");
			System.out.print("│            성적    입력                                                                            │\n");
			System.out.print("└─────────────────────────────────┘\n");
			
		
			for(int i=0; i<3; i++)//반복 3번
			{
			 
			do{
				if(kors<0||kors>100)
				System.out.println("0~100까지의 값만을 입력해주세요.");
				
			    System.out.print("국어 :\n");//다시 성적을 입력할 수 있게 설정
			    kors = scan.nextInt();
			   }while(kors<0||kors>100);
			
			
			    //0보다 작거나 100보다 크다면, 거짓이 될 때 까지 무한히 루프
			 do{
				if(engs<0||engs>100)
				System.out.println("0~100까지의 값만을 입력해주세요.");
				
				System.out.print("영어 :\n");
				engs= scan.nextInt();
			   }while(engs<0||engs>100);
					
			do{
				if(maths<0||maths>100)
				System.out.println("0~100까지의 값만을 입력해주세요.");
				
				System.out.print("수학 :\n");
				maths = scan.nextInt();
			  }while(maths<0||maths>100);
			
					exams[i].kor=kors;//유효성을 인증받은 값들을 배열 값에 저장한다.
					exams[i].eng=engs;
					exams[i].math=maths;
	 }
   }
}