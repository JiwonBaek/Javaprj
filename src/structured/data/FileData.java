package structured.data;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class FileData {

	public static void main(String[] args) throws IOException {

		  
		String fin = "C:\\workspace\\JavaPj\\res\\data.txt";
		FileReader fr = new FileReader (fin);
        Scanner sc =new Scanner(fr);
		

		//float avg=0;
         int count = 0;
		 double total = 0;
	     double avg;
	
		 double[]  a = new double[20]; 
        
        for(int i=0; i<20; i++)
		 {
			 a[i] = sc.nextDouble();
			 count ++;
			 total = total + a[i];
			 System.out.print(" "+a[i]);
			
		 }
		 
         System.out.println();
		 avg = total / count;
		 System.out.printf("ЦђБе : %5.2f\n", avg);
		 sc.close();
		 fr.close();
	}
	    
}
	

