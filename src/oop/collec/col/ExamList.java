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
			//1.새로운 배열 생성
			Exam[] temp= new Exam[capacity+2];
			
			//2.이동
			for(int i=0;i<exams.length;i++)
				temp[i]=exams[i];
			//3. 새로운 배열을 exams로 호칭을 바꾼다.
			    exams=temp;
			    //4. 새로운 용량을 표기한다.
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
