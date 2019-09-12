package baiscjava;

class A{
	void method1(String n){
		System.out.println("Method1");	
	}
	
	void method1(Object n){
	System.out.println("Method2");	
	}
}

public class Child extends A{

	public void ValidateHeader() {
		System.out.println("validation done");
		
	}
	static public void main(String ads[]){
		A a1=new A();
		a1.method1(null);
	}
}
