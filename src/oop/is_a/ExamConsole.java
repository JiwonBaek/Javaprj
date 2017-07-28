package oop.is_a;

import java.util.Scanner;



public class ExamConsole {// 입출력 담당

	private Exam exam =new Exam();

	public ExamConsole() {
		exam=new Exam();
		// this.exam=exam;
	}

/*	public void setExam(Exam exam) {
		this.exam = exam;
	}*/

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

		exam.setKor(kor);// public으로 변경하거나 캡슐깨는 것을 방지해 함수를 사용한다.
		exam.setEng(eng);
		exam.setMath(math);
	}

	public void print() {

		int kor = exam.getKor();
		int eng = exam.getEng();
		int math = exam.getMath();

		int total;
		double avg;

		System.out.print("┌─────────────────────────────────┐\n");
		System.out.print("│            성적 출력            │\n");
		System.out.print("└─────────────────────────────────┘\n");

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
