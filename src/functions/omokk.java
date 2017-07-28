package functions;
import java.util.Scanner;

public class omokk {

	public static void main(String[] args) {
		
		int ox=0, oy=0;
	    createOmok(ox,oy);
	    putOmok(ox,oy); 

	}

	private static void putOmok(int ox, int oy) {
		// TODO Auto-generated method stub\
		 
		System.out.print("x sp y : ");
	    Scanner scan = new Scanner(System.in);
	      
		 ox = scan.nextInt();
	      oy = scan.nextInt();
	      
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

	private static void createOmok(int ox, int oy) {
		// TODO Auto-generated method stub
		  for(int y=0; y<15; y++)
	      {
	         for(int x=0; x<20; x++)      
	               System.out.print("¦«");
	         
	         System.out.println();
	      }
	}

}
