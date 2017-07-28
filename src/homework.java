
public class homework {
	
	public static void main(String[] args) {
		
	char[] al= new char[50];
	 
	al[0]= 90;//unicode 'z'의 수로 초기값 설정
	 
     for(int i=0; i<26; i++)
     { 	
    	
      	System.out.print(al[i]);
      	al[i+1]=(char) (al[i]-1);//반복 될 때마다 저장되는 값은 1씩 작아진다. 
     
     }
		
	}

}


/* 모범답안
  int size ='Z'-'A'+1;
 
for(int=0;i<size;i++)
System.out.printf("%c",'Z'-i);

*/