package oop.omokgame;

public class Omokprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Board board = new Board();
		Omok omok = new Omok();
		OmokForm form = new OmokForm();
		
		board.create();
		board.print();
		
		form.print();
		omok.input();
		board.put(omok);
		board.print();
	
	}

}
