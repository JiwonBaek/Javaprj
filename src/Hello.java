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
		
		kor = 0;//변수 디폴트 값 설정, 변수 초기화
		eng = 0;
		math = 0;
		
		     here: //라벨은 반복문이 시작되는 앞 부분에 하는 것이 작동이 잘 된다.
	         while(true) {
				System.out.print("┌─────────────────────────────────┐\n");
				System.out.print("│                                 │\n");
				System.out.print("│            메인 메뉴                                 │\n");
				System.out.print("│                                 │\n");
				System.out.print("└─────────────────────────────────┘\n");	
				System.out.println("1. 성적 입력");
				System.out.println("2. 성적 출력");
				System.out.println("3. 종료");
				System.out.print("선택>");
				menu=scan.nextInt();
			 
				switch(menu) {
				case 1://1번 값을 입력하였을 때 아래 출력, if(menu==1)
				
				System.out.print("┌─────────────────────────────────┐\n");
				System.out.print("│                                 │\n");
				System.out.print("│            성적    입력                              │\n");
				System.out.print("│                                 │\n");
				System.out.print("└─────────────────────────────────┘\n");
				
			
				do{
					if(kor<0||kor>100)
					System.out.println("0~100까지의 값만을 입력해주세요.");
					
				    System.out.print("국어 :\n");//다시 성적을 입력할 수 있게 설정
				    kor = scan.nextInt();
				}while(kor<0||kor>100);
				//0보다 작거나 100보다 크다면, 거짓이 될 때 까지 무한히 루프
				
				do{
					if(eng<0||eng>100)
					System.out.println("0~100까지의 값만을 입력해주세요.");
					
					System.out.print("영어 :\n");
					eng = scan.nextInt();
				}while(eng<0||eng>100);
				
				do{
					if(math<0||math>100)
					System.out.println("0~100까지의 값만을 입력해주세요.");
					
					System.out.print("수학 :\n");
					math = scan.nextInt();
				}while(math<0||math>100);
				
				break;//break; 문을 안 사용했을 때는 메뉴선택이여도 전체내용출력 -> break;문 사용시 원하는 메뉴의 내용만 출력된다.
				
				case 2://2번 값을 입력하였을 때 아래 출력
			    
				 total = kor + eng + math;
				 avg = total / 3;
			 
				System.out.print("┌─────────────────────────────────┐\n");
				System.out.print("│                                 │\n");
				System.out.print("│            성적 출력                                 │\n");
				System.out.print("│                                 │\n");
				System.out.print("└─────────────────────────────────┘\n");
				
				//int i=0;
				
				//while(i<3) //i=0;으로 설정하면 조건문 i<3의 3이 반복되는 수이다.
				for(int i =0; i<3; i++)
				{
				System.out.println("국어 :"+kor);
				System.out.println("영어 :"+eng);
				System.out.println("수학 :"+math);
				System.out.println("총 점 :"+total);
				System.out.println("평균 :"+avg);
				System.out.printf("평균: %e\n",avg);
				System.out.println("------------------------------");
				   //i++;
				}
				
				break;
			
			    case 3:
				break here;//3번 값을 입력하였을 때 아래 출력 , break;는 어디 부분으로 돌아갈지 라벨로 설정을 해야 작동이 된다.
			    
			    default: //1~3번 값외의 입력일 때 출력
				 System.out.println("잘못된 번호를 입력하셨습니다! 번호 : 1~3을 눌러주셔야 합니다.");
	          }
	
				//System.out.printf("1:%d\n 2: %10d \n 3: %-10d\n",3,3,3); //10d는 10칸 뒤에 정수형 출력, -10d는 왼쪽으로 
				//System.out.printf(" 평균: %6.2f\n",54.587845); 원하는 자리만큼 소수점을 불러온다.
	 }
	}

}

