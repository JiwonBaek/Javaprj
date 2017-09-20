package oop.collec.col;

import java.util.Iterator;

public class GList<용주> implements Iterable<용주> {

	private 용주[] list;
	private int index;
	private int capacity;
	// private int current;

	public GList() {
		list = (용주[]) new Object[3];
		index = 0;
		capacity = 3;
		// current=-1;
	}

	public void add(용주 object)  {

		if (index >= capacity) {
			// 1.새로운 배열 생성
			용주[] temp = (용주[]) new Object[capacity + 2];

			// 2.이동
			for (int i = 0; i < list.length; i++)
				temp[i] = list[i];
			// 3. 새로운 배열을 exams로 호칭을 바꾼다.
			list = temp;
			// 4. 새로운 용량을 표기한다.
			capacity = capacity + 2;
		}

		list[index++] = object;
	}

	public int size() {
		// TODO Auto-generated method stub
		return index;
	}

	public Object get(int i) {
		// TODO Auto-generated method stub
		return list[i];
	}

	class GIterator implements Iterator<용주>{
		private int current;

		public GIterator() {
			current = -1;
		}

		// -데이터 조회
		public 용주 next() {

			return list[current];
		}

		public boolean hasNext() {
			++current;

			return current < index; // 기본 형태가 boolean형이여서 비교연산을 사용하지 않고 리턴으로 값을 출력할 수 있다.
			// return current<list.length;
		}
	}

	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new GIterator();
	}

	
}

