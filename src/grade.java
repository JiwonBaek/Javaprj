import java.io.IOException;
import java.util.Scanner;

public class grade {
	
	public static void main(String[] args) throws IOException
	{
		
		int score;
		int total = 0 ;
		float avg  ;
		int menu = 0;
		int x=0; //입력 받은 성적의 총 합
		int y=0; //입력 받은 성적의 갯수
		
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
		 do{	                  
			    System.out.print("┌─────────────────────────────────┐\n");
				System.out.print("│        성적을 입력해 주십시오                       │\n");
				System.out.print("└─────────────────────────────────┘\n");	
				System.out.print("점수 :");
				score = scan.nextInt();
				
				if(score<0|| score>100)
					System.out.println("0~100까지의 값만을 입력해주세요.");
				else {
				x+=score;
				System.out.print("계속 입력하시겠습니까?\n");
				System.out.println("1. 계속 입력");
				System.out.println("2. 성적 출력");
				System.out.print("선택 :");
				menu = scan.nextInt();
				y++;	//루프 돈 것만큼 증가	
				}
								
		    }while(menu==1);
		 
	       	if(menu==2)
	        {
	        	total = total+x;
	        	avg = total/y; 
	        	System.out.print("┌─────────────────────────────────┐\n");
				System.out.print("│            성적 출력                                 │\n");
				System.out.print("└─────────────────────────────────┘\n");
			    System.out.printf("총 점 : %d\n",total);
			    System.out.printf("평균 :%6.2f\n",avg);
			    break;
	        }
	       	if(menu>=3)
	       	{
	       		System.out.print("잘 못된 입력입니다.\n");
	       		break;
	       	}
		  }
	   }
     }
