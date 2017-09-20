package oop.collec.col;

import java.util.Iterator;

public class GList<����> implements Iterable<����> {

	private ����[] list;
	private int index;
	private int capacity;
	// private int current;

	public GList() {
		list = (����[]) new Object[3];
		index = 0;
		capacity = 3;
		// current=-1;
	}

	public void add(���� object)  {

		if (index >= capacity) {
			// 1.���ο� �迭 ����
			����[] temp = (����[]) new Object[capacity + 2];

			// 2.�̵�
			for (int i = 0; i < list.length; i++)
				temp[i] = list[i];
			// 3. ���ο� �迭�� exams�� ȣĪ�� �ٲ۴�.
			list = temp;
			// 4. ���ο� �뷮�� ǥ���Ѵ�.
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

	class GIterator implements Iterator<����>{
		private int current;

		public GIterator() {
			current = -1;
		}

		// -������ ��ȸ
		public ���� next() {

			return list[current];
		}

		public boolean hasNext() {
			++current;

			return current < index; // �⺻ ���°� boolean���̿��� �񱳿����� ������� �ʰ� �������� ���� ����� �� �ִ�.
			// return current<list.length;
		}
	}

	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new GIterator();
	}

	
}

