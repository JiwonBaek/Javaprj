package oop.has_a;

import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) {

		// Exam exam = new Exam(2,3,4);
		ExamConsole console = new ExamConsole();

		// console.setExam(exam);//dependency injection

		int menu = 0;

		EXIT: while (true) {
			// 1. 메인메뉴 입력
			menu = inputMenu(menu);

			switch (menu) {
			case 1:
				console.input();
				break;
			case 2:
				console.print();
				break;

			case 3:
				break EXIT;
			}
		}
	}

	public static int inputMenu(int menu) {
		// TODO Auto-generated method stub

		System.out.print("┌─────────────────────┐\n");
		System.out.print("│                     │\n");
		System.out.print("│    메인 메뉴        │\n");
		System.out.print("│                     │\n");
		System.out.print("└─────────────────────┘\n");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 종료");
		System.out.print("선택>");
		Scanner scan = new Scanner(System.in);
		return menu = scan.nextInt();

	}
}
		
		
		
		
		



