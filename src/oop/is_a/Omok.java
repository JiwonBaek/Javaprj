package oop.is_a;

import java.util.Scanner;

public class Omok {

	private int x;
	private int y;

	public Omok() {
		this(1, 1);
	}

	public Omok(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void input() {
		// TODO Auto-generated method stub
		int x = this.x;
		int y = this.y;

		System.out.print("x sp y : ");
		Scanner scan = new Scanner(System.in);

		x = scan.nextInt();
		y = scan.nextInt();

		this.x = x;
		this.y = y;

	}

	public void print() {
		// TODO Auto-generated method stub

		int ox = this.x;
		int oy = this.y;

		for (int y = 0; y < 15; y++) {
			for (int x = 0; x < 20; x++)
				if (x == ox && y == oy)
					System.out.print("¡Û");
				else
					System.out.print("¦«");
			System.out.println();
		}
	}

	/*public void printBoard() { // TODO Auto-generated method stub

		for (int y = 0; y < 15; y++) {
			for (int x = 0; x < 20; x++)
				System.out.print("¦«");
		}

		System.out.println();
	}*/

}
