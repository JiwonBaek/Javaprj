package oop.collec.col;

import java.util.Scanner;

public class ExamConsole {// 입출력 담당

	private ExamList exams;
	
	/*private Exam[] exams;
	private int index;
	private int capacity =3;
	*/
	public ExamConsole() {
		exams =new ExamList();
		/*exams = new Exam[3];
		index = 0;
		capacity =3;
*/
		/*for (int i = 0; i < 3; i++)
			exams[i] = new Exam();*/
	}

	public void setExam(Exam exam) {
		this.exams = exams;
	}

	public void input() {

		Scanner scan = new Scanner(System.in);

		int kor = 0;
		int eng = 0;
		int math = 0;

		System.out.print("┌─────────────────────────────────┐\n");
		System.out.print("│            성적    입력         │\n");
		System.out.print("└─────────────────────────────────┘\n");

	
		do {
			if (kor < 0 || kor > 100)
				System.out.println("0~100까지의 값만을 입력해주세요.");

			System.out.print("국어 :\n");// 다시 성적을 입력할 수 있게 설정
			kor = scan.nextInt();
		} while (kor < 0 || kor > 100);

		// 0보다 작거나 100보다 크다면, 거짓이 될 때 까지 무한히 루프
		do {
			if (eng < 0 || eng > 100)
				System.out.println("0~100까지의 값만을 입력해주세요.");

			System.out.print("영어 :\n");
			eng = scan.nextInt();
		} while (eng < 0 || eng > 100);

		do {
			if (math < 0 || math > 100)
				System.out.println("0~100까지의 값만을 입력해주세요.");

			System.out.print("수학 :\n");
			math = scan.nextInt();
		} while (math < 0 || math > 100);

		Exam exam = new Exam();
		exam.setKor(kor);// public으로 변경하거나 캡슐깨는 것을 방지해 함수를 사용한다.
		exam.setEng(eng);
		exam.setMath(math);

	
	/*	
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
		}*/
		
		exams.add(exam);
	
		
	}

	public void print() {

		System.out.print("┌─────────────────────────────────┐\n");
		System.out.print("│            성적 출력            │\n");
		System.out.print("└─────────────────────────────────┘\n");

		for (int i = 0; i <exams.size(); i++) {
			//Exam exam = exams[i];
			Exam exam=exams.get(i);
			
			int kor = exam.getKor();
			int eng = exam.getEng();
			int math = exam.getMath();

			int total;
			double avg;

			total = exam.total();
			avg = exam.avg();

			System.out.printf("국어 :%d\n", kor);
			System.out.printf("영어 :%d\n", eng);
			System.out.printf("수학 :%d\n", math);
			System.out.printf("총 점 :%d\n", total);
			System.out.printf("평균 :%f\n", avg);
			System.out.println("------------------------------");
		}
	}

}
