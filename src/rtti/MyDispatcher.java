package rtti;

public class MyDispatcher {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		MyClass myClass = (MyClass)Class.forName("rtti.MyClass").newInstance();
		
		myClass.print();

	}

}
