package oop.interf;

import java.util.Scanner;

public abstract class ExamConsole {// ����� ���

	private Exam exam = newExam();

	/*
	 * public ExamConsole() { exam=newExam(); // this.exam=exam; }
	 */

	public abstract Exam newExam();

	/*
	 * public void setExam(Exam exam) { this.exam = exam; }
	 */
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

		exam.setKor(kor);// public���� �����ϰų� ĸ������ ���� ������ �Լ��� ����Ѵ�.
		exam.setEng(eng);
		exam.setMath(math);

		// onInput(exam);

	}

	// protected abstract void onInput(Exam exam);

	public void print() {

		int kor = exam.getKor();
		int eng = exam.getEng();
		int math = exam.getMath();

		int total;
		double avg;

		System.out.print("����������������������������������������������������������������������\n");
		System.out.print("��            ���� ���            ��\n");
		System.out.print("����������������������������������������������������������������������\n");

		total = exam.total();
		avg = exam.avg();

		System.out.printf("���� :%d\n", kor);
		System.out.printf("���� :%d\n", eng);
		System.out.printf("���� :%d\n", math);
		onPrint(exam);
		System.out.printf("�� �� :%d\n", total);
		System.out.printf("��� :%.2f\n", avg);
		System.out.println("------------------------------");

	}

	protected abstract void onPrint(Exam exam);
}
