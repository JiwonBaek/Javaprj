package oop;

import java.util.Scanner;

public class Exam {
		   
	       private int kor;
		   private int eng;
		   private int math;

		      
		       public Exam() { //������ : �� ���� ����ϴ� �ʱ�ȭ �Լ�
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
					
							System.out.print("����������������������������������������������������������������������\n");
							System.out.print("��            ���� ���                                                                               ��\n");
							System.out.print("����������������������������������������������������������������������\n");
							
			
							 total =kor +eng +math;
						     avg = total / 3;
						     
							System.out.printf("���� :%d\n",kor);
							System.out.printf("���� :%d\n",eng);
							System.out.printf("���� :%d\n",math);
							System.out.printf("�� �� :%d\n",total);
							System.out.printf("��� :%f\n",avg);
							System.out.println("------------------------------");
					
				
						   }
						
						   public void input() {
						      // TODO Auto-generated method stub
							   Scanner scan = new Scanner(System.in);
							    
							        int kor=this.kor;
									int eng=this.eng; 
									int math=this.math;
										
								
									System.out.print("����������������������������������������������������������������������\n");
									System.out.print("��            ����    �Է�                                                                            ��\n");
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
										eng= scan.nextInt();
									   }while(eng<0||eng>100);
											
									do{
										if(math<0||math>100)
										System.out.println("0~100������ ������ �Է����ּ���.");
										
										System.out.print("���� :\n");
										math = scan.nextInt();
									  }while(math<0||math>100);
									
											this.kor=kor;//��ȿ���� �������� ������ �迭 ���� �����Ѵ�.
											this.eng=eng;
											this.math=math;
							 }

   
}


