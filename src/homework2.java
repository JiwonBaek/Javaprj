
public class homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			char[] al= new char[100];
			 int count =0; 
			 al[0]= 65;
			 
			for(int j=0;j<100;j++)
		     for(int i=0; i<26; i++)//알파벳 출력 반복문
		     { 	
		    	count++;
		    	if(count<=50)
		    	{
		      	System.out.print(al[i]);
		      	al[i+1]=(char) (al[i]+1);
		    	}
		     }
	         System.out.print(" ");
	
		
			}


}


/*모범답안
	for(int i=0; i<50; i++)
    System.out.printf("%c",'A'+(i%26));
*/