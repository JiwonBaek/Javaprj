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
		
		System.out.println("프로그램 종료");
		

	}
	
	private static void download(GList<Integer> list, int num) {
		// TODO Auto-generated method stub
		/*for(int i=0;i<100;i++)
			System.out.printf("%d : %d%%\n",num,list.get(i));*/
		
		//GList 사용
		//GIterator iter = list.new GIterator();
		/*GIterator iter = list.iterator();//데이터 열거 서비스 추가하고자 함으로 사용
		while(iter.hasNext())
			System.out.printf("%d : %d%%\n",num,iter.next());*///인덱스가 공유되고 있는 상태, currunt가 공유가 되면 안된다! 손실되는 값이 발생하기 때문이다.
		
		
		//ArrayList 사용
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
		
		System.out.println("프로그램 종료");
		

	}
	
	private static void download(ArrayList<Integer> list, int num) {
		
		
	    //데이터 열거 서비스 추가하고자 함으로 사용
		인덱스가 공유되고 있는 상태, currunt가 공유가 되면 안된다! 손실되는 값이 발생하기 때문이다.
	
		for(Integer n : list)
		System.out.printf("%d : %d%%\n", num,n);
	
		
	}

}
*/