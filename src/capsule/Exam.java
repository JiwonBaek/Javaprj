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
		
	   
    }
   }

   public static void input(Exam[] exams) {
      // TODO Auto-generated method stub
	   Scanner scan = new Scanner(System.in);
	    
	    int kors=0;
		int engs=0;
		int maths=0;
	
		
			System.out.print("����������������������������������������������������������������������\n");
			System.out.print("��            ����    �Է�                                                                            ��\n");
			System.out.print("����������������������������������������������������������������������\n");
			
		
			for(int i=0; i<3; i++)//�ݺ� 3��
			{
			 
			do{
				if(kors<0||kors>100)
				System.out.println("0~100������ ������ �Է����ּ���.");
				
			    System.out.print("���� :\n");//�ٽ� ������ �Է��� �� �ְ� ����
			    kors = scan.nextInt();
			   }while(kors<0||kors>100);
			
			
			    //0���� �۰ų� 100���� ũ�ٸ�, ������ �� �� ���� ������ ����
			 do{
				if(engs<0||engs>100)
				System.out.println("0~100������ ������ �Է����ּ���.");
				
				System.out.print("���� :\n");
				engs= scan.nextInt();
			   }while(engs<0||engs>100);
					
			do{
				if(maths<0||maths>100)
				System.out.println("0~100������ ������ �Է����ּ���.");
				
				System.out.print("���� :\n");
				maths = scan.nextInt();
			  }while(maths<0||maths>100);
			
					exams[i].kor=kors;//��ȿ���� �������� ������ �迭 ���� �����Ѵ�.
					exams[i].eng=engs;
					exams[i].math=maths;
	 }
   }
}