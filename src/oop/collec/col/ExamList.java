package oop.collec.col;

public class ExamList {
	
	private Exam[] exams;
	private int index;
	private int capacity;
	
	public ExamList(){
		exams = new Exam[3];
		index = 0;
		capacity =3;
		
	}

	public void add(Exam exam) {

		if(index>=capacity ) {
			//1.���ο� �迭 ����
			Exam[] temp= new Exam[capacity+2];
			
			//2.�̵�
			for(int i=0;i<exams.length;i++)
				temp[i]=exams[i];
			//3. ���ο� �迭�� exams�� ȣĪ�� �ٲ۴�.
			    exams=temp;
			    //4. ���ο� �뷮�� ǥ���Ѵ�.
				capacity=capacity+2;
		}
		
	     exams[index++]=exam;
	}
	

	public int size() {
		// TODO Auto-generated method stub
		return index;
	}

	public Exam get(int i) {
		// TODO Auto-generated method stub
		return exams[i];
	}
	
}
