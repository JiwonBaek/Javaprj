package oop.omokgame;

import java.util.Scanner;

public class Omok {

	public int x;
	public int y;

	public void input() {
		x=0;
		y=0;
		
		Scanner scan = new Scanner(System.in);

		x = scan.nextInt();
		y = scan.nextInt();

	}

}
