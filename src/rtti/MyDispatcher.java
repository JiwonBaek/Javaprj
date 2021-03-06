package rtti;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyDispatcher {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException {

		Class<?> cls = Class.forName("rtti.MyClass");
		MyClass myClass = (MyClass) cls.newInstance();
		Class<?>[] noparams = {};

		myClass.bbb();

		Method[] methods = myClass.getClass().getDeclaredMethods();

		System.out.println(methods.length);

		for (Method m : methods) {
			System.out.println("Method Name :" + m.getName());

			if (m.isAnnotationPresent(Print.class)) {// Print 어노테이션이 설정된 메소드
				Annotation ano = m.getAnnotation(Print.class);
				Print printAno = (Print) ano;

				if (printAno.enable()) {// 어노테이션의 enable 속성이 true인 메소드만 호출
					Method method = cls.getDeclaredMethod(m.getName(), noparams);
					method.invoke(myClass);
					/* System.out.println("있다.");어노테이션이 있는지 확인하는 프린트문 */
				}

				/*
				 * if (m.getName().equals("aaa")) {
				 */ /* for (Parameter p : m.getParameters()) { */
				/* String ptype = p.getParameterizedType().getTypeName(); */
				/* System.out.print("aaa() parameter name : " + p.getName()); */
				/* System.out.print("aaa() parameter type : " + ptype); */
				/* } */
				/* } */
			}

		}
	}
}
