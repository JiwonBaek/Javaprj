package oop.collec.col;

import java.util.ArrayList;

import oop.collec.col.GList.GIterator;





public class AsyncProgram {

	
	
	
	public static void main(String[] args) {
	     GList<Integer> list =new GList<>();
		
		for(int i=0;i<100;i++)
		 list.add(i+1);
		
		Thread th1 = new Thread(new Runnable() {
			
				public void run() {
					download(list,1);
				}

		});
		
		//Thread th1 = new Thread(()->{download(list,1);});
		
		th1.start();
		download(list,2);
		
		System.out.println("���α׷� ����");
		

	}
	
	private static void download(GList<Integer> list, int num) {
		// TODO Auto-generated method stub
		/*for(int i=0;i<100;i++)
			System.out.printf("%d : %d%%\n",num,list.get(i));*/
		
		//GList ���
		//GIterator iter = list.new GIterator();
		/*GIterator iter = list.iterator();//������ ���� ���� �߰��ϰ��� ������ ���
		while(iter.hasNext())
			System.out.printf("%d : %d%%\n",num,iter.next());*///�ε����� �����ǰ� �ִ� ����, currunt�� ������ �Ǹ� �ȵȴ�! �սǵǴ� ���� �߻��ϱ� �����̴�.
		
		
		//ArrayList ���
		for(Integer n : list)
		{
			System.out.printf("%d : %d%%\n", num,n);
		}
		
	}

}


/*public class AsyncProgram {

	
	
	
	public static void main(String[] args) {
	     ArrayList<Integer> list =new ArrayList<>();
		
		for(int i=0;i<100;i++)
		 list.add(i+1);
		
		Thread th1 = new Thread(new Runnable() {
			
				public void run() {
					download(list,1);
				}

		});
		
		//Thread th1 = new Thread(()->{download(list,1);});
		
		th1.start();
		download(list,2);
		
		System.out.println("���α׷� ����");
		

	}
	
	private static void download(ArrayList<Integer> list, int num) {
		
		
	    //������ ���� ���� �߰��ϰ��� ������ ���
		�ε����� �����ǰ� �ִ� ����, currunt�� ������ �Ǹ� �ȵȴ�! �սǵǴ� ���� �߻��ϱ� �����̴�.
	
		for(Integer n : list)
		System.out.printf("%d : %d%%\n", num,n);
	
		
	}

}
*/