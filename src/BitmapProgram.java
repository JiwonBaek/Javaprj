import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BitmapProgram {

	public static void main(String[] args)throws IOException {
              
		FileInputStream fin = new FileInputStream("res/uu.bmp");
		FileOutputStream fout = new FileOutputStream("res/uu_copy.bmp");
		
		byte[] fileHeader = new byte[14];
		byte[] bmpHeader = new byte[12];
		byte[] buf = new byte[1024];
		
		/*fin.read(fileHeader);
		fin.read(bmpHeader);
		*/
		
		int len;
	
		while((len = fin.read(buf))!=-1)
		{			
			fout.write(buf,0,len);
		}//파일 복사
		  
		
		/* int w1 = ((int)bmpHeader[4]) & 0x000000ff <<0; 
			int w2 = ((int)bmpHeader[5])  <<8;
			int w3 = ((int)bmpHeader[6])  <<16;
			int w4 = ((int)bmpHeader[7])  <<24;
			int w5 = (w1|w2|w3|w4);
        
		System.out.printf("width : %d",w5);*/
				
		
		
		fin.close();
		fout.close();

	}

}

		/*FileInputStream fin = new FileInputStream("res/uu.bmp");
		
		
		byte[] fileHeader = new byte[14];
		byte[] bmpHeader = new byte[12];
		
		fin.read(fileHeader);
		fin.read(bmpHeader);


	    int w1 = ((int)bmpHeader[4]) & 0x000000ff <<0; 
		int w2 = ((int)bmpHeader[5])  <<8;
		int w3 = ((int)bmpHeader[6])  <<16;
		int w4 = ((int)bmpHeader[7])  <<24;
		int w5 = (w1|w2|w3|w4);
    
	   System.out.printf("width : %d",w5);
			
	
	
		fin.close();
		fout.close();*/

