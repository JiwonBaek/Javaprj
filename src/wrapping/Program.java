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
		/*String name1 ="아이유";
		String name2 = "아이유";
		
		System.out.print(name1==name2); //->주소가 같은지 비교하는 연산
		*/
		
		String str="강호동,유재석,신동엽,김성주";
		
		System.out.println(str.length());
		System.out.println(str.indexOf("."));
		int endIndex = str.indexOf(",");
		System.out.println(str.substring(0, endIndex));
		
		String[] names = str.split(",");
		System.out.println(names[2]);
		
	}

}
