
public class homework {
	
	public static void main(String[] args) {
		
	char[] al= new char[50];
	 
	al[0]= 90;//unicode 'z'�� ���� �ʱⰪ ����
	 
     for(int i=0; i<26; i++)
     { 	
    	
      	System.out.print(al[i]);
      	al[i+1]=(char) (al[i]-1);//�ݺ� �� ������ ����Ǵ� ���� 1�� �۾�����. 
     
     }
		
	}

}


/* ������
  int size ='Z'-'A'+1;
 
for(int=0;i<size;i++)
System.out.printf("%c",'Z'-i);

*/