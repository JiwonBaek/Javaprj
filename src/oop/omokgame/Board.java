package oop.omokgame;

public class Board {

	private int[][] board;

	public void create() {

		board = new int[15][20];
		for (int x = 0; x < 15; x++) {
			for (int y = 0; y < 20; y++)
				board[x][y] = 0;
		}

	}

	public void print() {

		for (int x = 0; x < 15; x++) {
			for (int y = 0; y < 20; y++)
				if (board[x][y] == 1)
					System.out.print("¡Û");
				else

					System.out.print("¦«");
			System.out.println();
		}

	}

	public void put(Omok omok) {

		int x = omok.x;
		int y = omok.y;
		board[x][y] = 1;

	}

}
