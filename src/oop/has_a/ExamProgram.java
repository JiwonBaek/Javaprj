package oop.has_a;

import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) {

		// Exam exam = new Exam(2,3,4);
		ExamConsole console = new ExamConsole();

		// console.setExam(exam);//dependency injection

		int menu = 0;

		EXIT: while (true) {
			// 1. ���θ޴� �Է�
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

		System.out.print("����������������������������������������������\n");
		System.out.print("��                     ��\n");
		System.out.print("��    ���� �޴�        ��\n");
		System.out.print("��                     ��\n");
		System.out.print("����������������������������������������������\n");
		System.out.println("1. ���� �Է�");
		System.out.println("2. ���� ���");
		System.out.println("3. ����");
		System.out.print("����>");
		Scanner scan = new Scanner(System.in);
		return menu = scan.nextInt();

	}
}
		
		
		
		
		



