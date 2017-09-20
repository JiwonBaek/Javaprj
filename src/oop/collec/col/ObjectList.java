package oop.collec.col;

public class ObjectList {
	
	private Object[] list;
	private int index;
	private int capacity;
	
	public ObjectList(){
		list = new Object[3];
		index = 0;
		capacity =3;
	}

	public void add(Object object) {

		if(index>=capacity ) {
			//1.새로운 배열 생성
			Object[] temp= new Object[capacity+2];
			
			//2.이동
			for(int i=0;i<list.length;i++)
				temp[i]=list[i];
			//3. 새로운 배열을 exams로 호칭을 바꾼다.
			    list=temp;
			    //4. 새로운 용량을 표기한다.
				capacity=capacity+2;
		}
		
	     list[index++]=object;
	}
	

	public int size() {
		// TODO Auto-generated method stub
		return index;
	}

	public Object get(int i) {
		// TODO Auto-generated method stub
		return list[i];
	}
	
}
