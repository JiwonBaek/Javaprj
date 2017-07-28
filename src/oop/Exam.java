package oop;

import java.util.Scanner;

public class Exam {
		   
	       private int kor;
		   private int eng;
		   private int math;

		      
		       public Exam() { //생성자 : 한 번만 사용하는 초기화 함수
		    	  this(1,1,1);
		       }
   
		       public Exam(int kor, int eng, int math) { 
		    	   
		    	   this.kor=kor;
		    	   this.eng=eng;
		    	   this.math=math;
		       }
		       
			   public void print() {
			      // TODO Auto-generated method stub
			      
				   
				    int kor=this.kor; 
				    int eng=this.eng;
				    int math=this.math;
					
					int total;
					float avg;
					
							System.out.print("┌─────────────────────────────────┐\n");
							System.out.print("│            성적 출력                                                                               │\n");
							System.out.print("└─────────────────────────────────┘\n");
							
			
							 total =kor +eng +math;
						     avg = total / 3;
						     
							System.out.printf("국어 :%d\n",kor);
							System.out.printf("영어 :%d\n",eng);
							System.out.printf("수학 :%d\n",math);
							System.out.printf("총 점 :%d\n",total);
							System.out.printf("평균 :%f\n",avg);
							System.out.println("------------------------------");
					
				
						   }
						
						   public void input() {
						      // TODO Auto-generated method stub
							   Scanner scan = new Scanner(System.in);
							    
							        int kor=this.kor;
									int eng=this.eng; 
									int math=this.math;
										
								
									System.out.print("┌─────────────────────────────────┐\n");
									System.out.print("│            성적    입력                                                                            │\n");
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
										eng= scan.nextInt();
									   }while(eng<0||eng>100);
											
									do{
										if(math<0||math>100)
										System.out.println("0~100까지의 값만을 입력해주세요.");
										
										System.out.print("수학 :\n");
										math = scan.nextInt();
									  }while(math<0||math>100);
									
											this.kor=kor;//유효성을 인증받은 값들을 배열 값에 저장한다.
											this.eng=eng;
											this.math=math;
							 }

   
}


