package wrapping;

public class Program {

	public static void main(String[] args) {
		/*
		int n=3;
		//String s=Integer.toString(n);
		
		String s = String.valueOf(n);
		
		double d= 3.4;
		String sd =Double.toString(d);
		
		double b= Double.parseDouble(sd);
		
		//String s= new String("hello").length();
	*/
		/*String name1 ="������";
		String name2 = "������";
		
		System.out.print(name1==name2); //->�ּҰ� ������ ���ϴ� ����
		*/
		
		String str="��ȣ��,���缮,�ŵ���,�輺��";
		
		System.out.println(str.length());
		System.out.println(str.indexOf("."));
		int endIndex = str.indexOf(",");
		System.out.println(str.substring(0, endIndex));
		
		String[] names = str.split(",");
		System.out.println(names[2]);
		
	}

}
