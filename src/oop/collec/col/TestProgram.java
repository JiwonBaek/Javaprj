package oop.collec.col;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestProgram {

	public static void main(String[] args) {

		Map<String,String> student =new HashMap<>();
		student.put("�̸�", "ȫ�浿");
		student.put("����", "17");
		student.put("��ȭ��ȣ", "010-5687-6895");
		
		System.out.println(student.get("�̸�"));
		
		for(String key : student.keySet())
			System.out.printf("key = %s, value : %s\n",key,student.get(key));
		
		
		
		/*List<Integer> list = new ArrayList<>();
		
		
		list.add(8);
		*/
		/*Set set = new LinkedHashSet();
		
		set.add(3);
		set.add(8);
		set.add(1);
		set.add(22);
		set.add(4);//�ߺ��� ���� ��µ��� �ʴ´�.
		
		for(Object o : set)
			System.out.println(o); //
		*/
		
		
		/*GList list = new GList();//
		// GList<String> list= new GList<String>();//������ �������� ����� �� �ִ�.
		// ObjectList list = new ObjectList();
		list.add(3);
		list.add("hello");

		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

		while (list.hasNext())
			System.out.println(list.next());//true ���� ������ ���� ����� ���
		*/

	}

}
