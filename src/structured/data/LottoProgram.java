package structured.data;
import java.util.Random;

public class LottoProgram {

	public static void main(String[] args) {

		Lotto lotto =new Lotto();
		 
		  gen(lotto);
		  print(lotto);
		  sort(lotto);
		  print(lotto);
		 
		  
		 }


		private static void sort(Lotto lotto) 
		 {
		
			 
		      for (int j = 0; j < 5; j++) { 		
			  for (int i = 0, tmp; i < 5 - j; i++) {
				     if (lotto.x[i] > lotto.x[i + 1]) {
				     tmp = lotto.x[i];
				     lotto.x[i] = lotto.x[i + 1];
				     lotto.x[i + 1] = tmp;
		    }
		   }
		  }
		 }

		 private static void print(Lotto lotto) 
		 {
			
			 
		  for (int i = 0; i < 6; i++) 
		   System.out.printf("%d ", lotto.x[i]);
		  System.out.println();
		  
		 }

		 
		 private static void gen(Lotto lotto) 
		 {  
			 Random rand = new Random();
			  
		 }


	// 1~45 까지의 숫자 중복값 안나오게
}