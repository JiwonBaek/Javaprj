import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileData {

	public static void main(String[] args)throws IOException {
		
		int[] nums =new int[] {55,34,99,65,2,34,4};
		
        FileInputStream ���� = new FileInputStream("res/data.txt");
        Scanner ���  = new Scanner(����);
        
		//FileOutputStream ���� = new FileOutputStream("res/data.txt");
        //PrintStream ���� = new PrintStream(����);
        
       
        
     /*   num = ����.read();
        System.out.println(num);
        num = ����.read();
        System.out.println(num);
        num = ����.read();
        System.out.println(num);
        */
     
        int num ; 
        while((num=����.read())!=-1) 
        	System.out.println(num);
       
     
        
        ���.close();
        ����.close();
        
		
		/*for(int i =0; i<7;i++)
	     ����.printf("%d",nums[i]);

	    ����.close();
	    ����.close();
	    */
	    System.out.println("end");
	}

}
