import java.io.IOException;
import java.util.Scanner;

class Hello {



public static void main(String[] args) throws IOException

	{
		int kor;
		int eng;
		int math;
		int total;
		float avg;
		int menu;
		Scanner scan = new Scanner(System.in);
		
		kor = 0;//���� ����Ʈ �� ����, ���� �ʱ�ȭ
		eng = 0;
		math = 0;
		
		     here: //���� �ݺ����� ���۵Ǵ� �� �κп� �ϴ� ���� �۵��� �� �ȴ�.
	         while(true) {
				System.out.print("����������������������������������������������������������������������\n");
				System.out.print("��                                 ��\n");
				System.out.print("��            ���� �޴�                                 ��\n");
				System.out.print("��                                 ��\n");
				System.out.print("����������������������������������������������������������������������\n");	
				System.out.println("1. ���� �Է�");
				System.out.println("2. ���� ���");
				System.out.println("3. ����");
				System.out.print("����>");
				menu=scan.nextInt();
			 
				switch(menu) {
				case 1://1�� ���� �Է��Ͽ��� �� �Ʒ� ���, if(menu==1)
				
				System.out.print("����������������������������������������������������������������������\n");
				System.out.print("��                                 ��\n");
				System.out.print("��            ����    �Է�                              ��\n");
				System.out.print("��                                 ��\n");
				System.out.print("����������������������������������������������������������������������\n");
				
			
				do{
					if(kor<0||kor>100)
					System.out.println("0~100������ ������ �Է����ּ���.");
					
				    System.out.print("���� :\n");//�ٽ� ������ �Է��� �� �ְ� ����
				    kor = scan.nextInt();
				}while(kor<0||kor>100);
				//0���� �۰ų� 100���� ũ�ٸ�, ������ �� �� ���� ������ ����
				
				do{
					if(eng<0||eng>100)
					System.out.println("0~100������ ������ �Է����ּ���.");
					
					System.out.print("���� :\n");
					eng = scan.nextInt();
				}while(eng<0||eng>100);
				
				do{
					if(math<0||math>100)
					System.out.println("0~100������ ������ �Է����ּ���.");
					
					System.out.print("���� :\n");
					math = scan.nextInt();
				}while(math<0||math>100);
				
				break;//break; ���� �� ������� ���� �޴������̿��� ��ü������� -> break;�� ���� ���ϴ� �޴��� ���븸 ��µȴ�.
				
				case 2://2�� ���� �Է��Ͽ��� �� �Ʒ� ���
			    
				 total = kor + eng + math;
				 avg = total / 3;
			 
				System.out.print("����������������������������������������������������������������������\n");
				System.out.print("��                                 ��\n");
				System.out.print("��            ���� ���                                 ��\n");
				System.out.print("��                                 ��\n");
				System.out.print("����������������������������������������������������������������������\n");
				
				//int i=0;
				
				//while(i<3) //i=0;���� �����ϸ� ���ǹ� i<3�� 3�� �ݺ��Ǵ� ���̴�.
				for(int i =0; i<3; i++)
				{
				System.out.println("���� :"+kor);
				System.out.println("���� :"+eng);
				System.out.println("���� :"+math);
				System.out.println("�� �� :"+total);
				System.out.println("��� :"+avg);
				System.out.printf("���: %e\n",avg);
				System.out.println("------------------------------");
				   //i++;
				}
				
				break;
			
			    case 3:
				break here;//3�� ���� �Է��Ͽ��� �� �Ʒ� ��� , break;�� ��� �κ����� ���ư��� �󺧷� ������ �ؾ� �۵��� �ȴ�.
			    
			    default: //1~3�� ������ �Է��� �� ���
				 System.out.println("�߸��� ��ȣ�� �Է��ϼ̽��ϴ�! ��ȣ : 1~3�� �����ּž� �մϴ�.");
	          }
	
				//System.out.printf("1:%d\n 2: %10d \n 3: %-10d\n",3,3,3); //10d�� 10ĭ �ڿ� ������ ���, -10d�� �������� 
				//System.out.printf(" ���: %6.2f\n",54.587845); ���ϴ� �ڸ���ŭ �Ҽ����� �ҷ��´�.
	 }
	}

}

