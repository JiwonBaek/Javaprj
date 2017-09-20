package rtti;

import java.lang.reflect.Method;

public class MyDispatcher {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		MyClass myClass = (MyClass)Class.forName("rtti.MyClass").newInstance();
		
		myClass.print();
		
		 Method[] methods=myClass.getClass().getMethods();
		 
		 System.out.println(methods.length);

	}

}
