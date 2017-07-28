package oop.interf;

import java.util.Scanner;

public abstract class Exam {// 데이터 서비스 담당

	private int kor;
	private int eng;
	private int math;
	private AvgListener avgListener;

	public void setAvgListener(AvgListener avgListener) {
		this.avgListener = avgListener;
	}

	public Exam() { // 생성자 : 한 번만 사용하는 초기화 함수
		this(0, 0, 0);
	}

	public Exam(int kor, int eng, int math) {

		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public double avg() {

		return avgListener.avg();
	}

	public int total() {

		return kor + eng + math;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

}
