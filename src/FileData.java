import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileData {

	public static void main(String[] args)throws IOException {
		
		int[] nums =new int[] {55,34,99,65,2,34,4};
		
        FileInputStream 형주 = new FileInputStream("res/data.txt");
        Scanner 명건  = new Scanner(형주);
        
		//FileOutputStream 용주 = new FileOutputStream("res/data.txt");
        //PrintStream 은녕 = new PrintStream(용주);
        
       
        
     /*   num = 형주.read();
        System.out.println(num);
        num = 형주.read();
        System.out.println(num);
        num = 형주.read();
        System.out.println(num);
        */
     
        int num ; 
        while((num=형주.read())!=-1) 
        	System.out.println(num);
       
     
        
        명건.close();
        형주.close();
        
		
		/*for(int i =0; i<7;i++)
	     은녕.printf("%d",nums[i]);

	    은녕.close();
	    용주.close();
	    */
	    System.out.println("end");
	}

}
