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
         //1. ���θ޴� �Է�
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
		
	System.out.print("����������������������������������������������������������������������\n");
	System.out.print("��            ���� ���                                                                               ��\n");
	System.out.print("����������������������������������������������������������������������\n");
	

	
	//while(i<3) //i=0;���� �����ϸ� ���ǹ� i<3�� 3�� �ݺ��Ǵ� ���̴�.
	for(int i =0; i<3; i++)
		{
				 kors=exams[i].kor;
				 engs=exams[i].eng;
				 maths=exams[i].math;
				
				 total =kors +engs +maths;
			     avg = total / 3;
			     
				System.out.printf("���� :%d\n",kors);
				System.out.printf("���� :%d\n",engs);
				System.out.printf("���� :%d\n",maths);
				System.out.printf("�� �� :%d\n",total);
				System.out.printf("��� :%f\n",avg);
				System.out.println("------------------------------");
			   //i++;
	 }
	}
	   
      


   public static void inputExam(Exam[] exams) {
      // TODO Auto-generated method stub
	   Scanner scan = new Scanner(System.in);
	   
	    System.out.print("��������������������������������������������������������\n");
		System.out.print("��            ����    �Է�                                                       |\n");
		System.out.print("��������������������������������������������������������\n");
		
		int kors=0; int engs =0; int maths=0;
		
		for(int i=0; i<3; i++)//�ݺ� 3��
		{
						 
		do{
			if(kors<0|| kors>100)
			System.out.println("0~100������ ������ �Է����ּ���.");
			
		    System.out.print("���� :\n");//�ٽ� ������ �Է��� �� �ְ� ����
		    kors= scan.nextInt();
	 	 
		   }while(kors<0||kors>100);
		
		
		    //0���� �۰ų� 100���� ũ�ٸ�, ������ �� �� ���� ������ ����
		 do{
			if(engs<0||engs>100)
			System.out.println("0~100������ ������ �Է����ּ���.");
			
			System.out.print("���� :\n");
			engs = scan.nextInt();
			
		   }while(engs<0||engs>100);
				
		do{
			if(maths<0||maths>100)
			System.out.println("0~100������ ������ �Է����ּ���.");
			
			System.out.print("���� :\n");
			maths = scan.nextInt();
			
		  }while(maths<0||maths>100);
				
		        exams[i].kor =kors ;
				exams[i].eng=engs;
				exams[i].math=maths;
			  
		}
	
   }

			

   

   public static int inputMenu(int menu) {
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
		    menu = scan.nextInt();
		      
			
			return menu;
	   
     
   }

}