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
			//1.���ο� �迭 ����
			Object[] temp= new Object[capacity+2];
			
			//2.�̵�
			for(int i=0;i<list.length;i++)
				temp[i]=list[i];
			//3. ���ο� �迭�� exams�� ȣĪ�� �ٲ۴�.
			    list=temp;
			    //4. ���ο� �뷮�� ǥ���Ѵ�.
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
