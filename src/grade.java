import java.io.IOException;
import java.util.Scanner;

public class grade {
	
	public static void main(String[] args) throws IOException
	{
		
		int score;
		int total = 0 ;
		float avg  ;
		int menu = 0;
		int x=0; //�Է� ���� ������ �� ��
		int y=0; //�Է� ���� ������ ����
		
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
		 do{	                  
			    System.out.print("����������������������������������������������������������������������\n");
				System.out.print("��        ������ �Է��� �ֽʽÿ�                       ��\n");
				System.out.print("����������������������������������������������������������������������\n");	
				System.out.print("���� :");
				score = scan.nextInt();
				
				if(score<0|| score>100)
					System.out.println("0~100������ ������ �Է����ּ���.");
				else {
				x+=score;
				System.out.print("��� �Է��Ͻðڽ��ϱ�?\n");
				System.out.println("1. ��� �Է�");
				System.out.println("2. ���� ���");
				System.out.print("���� :");
				menu = scan.nextInt();
				y++;	//���� �� �͸�ŭ ����	
				}
								
		    }while(menu==1);
		 
	       	if(menu==2)
	        {
	        	total = total+x;
	        	avg = total/y; 
	        	System.out.print("����������������������������������������������������������������������\n");
				System.out.print("��            ���� ���                                 ��\n");
				System.out.print("����������������������������������������������������������������������\n");
			    System.out.printf("�� �� : %d\n",total);
			    System.out.printf("��� :%6.2f\n",avg);
			    break;
	        }
	       	if(menu>=3)
	       	{
	       		System.out.print("�� ���� �Է��Դϴ�.\n");
	       		break;
	       	}
		  }
	   }
     }
