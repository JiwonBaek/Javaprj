package rtti;


public class MyClass {
	@Print(enable=true)
	public void hehehe() {
		System.out.println("jehoho");
	}
	
	@Print(enable=false)
	public void bbb() {
		System.out.println("Hello");
	}
	@Print(enable=true)
	public void aaa() {
		System.out.println("exam.total()");
	}

}
