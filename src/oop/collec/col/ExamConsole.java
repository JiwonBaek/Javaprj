package oop.collec.col;

import java.util.Scanner;

public class ExamConsole {// ����� ���

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

		System.out.print("����������������������������������������������������������������������\n");
		System.out.print("��            ����    �Է�         ��\n");
		System.out.print("����������������������������������������������������������������������\n");

	
		do {
			if (kor < 0 || kor > 100)
				System.out.println("0~100������ ������ �Է����ּ���.");

			System.out.print("���� :\n");// �ٽ� ������ �Է��� �� �ְ� ����
			kor = scan.nextInt();
		} while (kor < 0 || kor > 100);

		// 0���� �۰ų� 100���� ũ�ٸ�, ������ �� �� ���� ������ ����
		do {
			if (eng < 0 || eng > 100)
				System.out.println("0~100������ ������ �Է����ּ���.");

			System.out.print("���� :\n");
			eng = scan.nextInt();
		} while (eng < 0 || eng > 100);

		do {
			if (math < 0 || math > 100)
				System.out.println("0~100������ ������ �Է����ּ���.");

			System.out.print("���� :\n");
			math = scan.nextInt();
		} while (math < 0 || math > 100);

		Exam exam = new Exam();
		exam.setKor(kor);// public���� �����ϰų� ĸ������ ���� ������ �Լ��� ����Ѵ�.
		exam.setEng(eng);
		exam.setMath(math);

	
	/*	
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
		}*/
		
		exams.add(exam);
	
		
	}

	public void print() {

		System.out.print("����������������������������������������������������������������������\n");
		System.out.print("��            ���� ���            ��\n");
		System.out.print("����������������������������������������������������������������������\n");

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

			System.out.printf("���� :%d\n", kor);
			System.out.printf("���� :%d\n", eng);
			System.out.printf("���� :%d\n", math);
			System.out.printf("�� �� :%d\n", total);
			System.out.printf("��� :%f\n", avg);
			System.out.println("------------------------------");
		}
	}

}
