package structured.data;
import java.util.Scanner;

public class OmokProgram2 {

	public static void main(String[] args) {
			 
		 
		 Omok[] omoks= new Omok[10]; 
		Omok omok = new Omok();
	
		 
	     printBoard();
	    input(omoks);
	    printBoard(omoks); 

	}

	private static void input(Omok[] omoks) {
		// TODO Auto-generated method stub
		Omok omok = new Omok();
		
		System.out.print("x sp y : ");
	    Scanner scan = new Scanner(System.in);
	      
		  omok.x = scan.nextInt();
	      omok.y = scan.nextInt();
		
	}

	private static void printBoard(Omok[] omoks) {
		// TODO Auto-generated method stub
		Omok omok = new Omok();
		
			int ox =omok.x;
			int oy= omok.y;
			
			for(int y=0; y<15; y++)
		      { 
		         for(int x=0; x<20; x++)      
		            if(x == ox && y == oy)
		               System.out.print("¡Û");
		            else
		               System.out.print("¦«");
		               System.out.println();
		      }
	}

	


	private static void      printBoard() {
		// TODO Auto-generated method stub
		 
		for(int y=0; y<15; y++)
	      {
	         for(int x=0; x<20; x++)      
	               System.out.print("¦«");
	         
	         System.out.println();
	      }
	}


}
