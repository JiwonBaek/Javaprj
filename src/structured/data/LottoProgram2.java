/*package structured.data;
import java.util.Random;

public class LottoProgram2 {

	public static void main(String[] args) {

		 Lotto[] lottos =new Lotto[6];
		 
		  gen(lottos);
		  print(lottos);
		  sort(lottos);
		  print(lottos);
		  
		 }

		 private static void sort(Lotto[] lottos) 
		 {
			  	Lotto lotto =new Lotto();
			 
		      for (int j = 0; j < 5; j++) { 		
			  for (int i = 0, tmp; i < 5 - j; i++) {
				     if (lottos[i].x > lottos[i + 1].x) {
				     tmp = lottos[i].x;
				     lottos[i].x = lottos[i + 1].x;
				     lottos[i + 1].x = tmp;
		    }
		   }
		  }
		 }

		 private static void print(Lotto[] lottos) 
		 {
			
			 
		  for (int i = 0; i < 6; i++) {
			  Lotto lotto =new Lotto();
		   System.out.printf("%d ", lottos[i].x);
		  System.out.println();
		  }
		 }

		 
		 private static void gen(Lotto[] lottos) 
		 {  
			 Random rand = new Random();
		
		  for (int i = 0; i < 6; i++) {
			  Lotto lotto =new Lotto();
		      lottos[i].x = rand.nextInt(45) + 1;
		      lottos[i]=lotto;
		  }

		 }


	// 1~45 까지의 숫자 중복값 안나오게
}*/