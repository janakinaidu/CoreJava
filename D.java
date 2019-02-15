package dyamicpolymorpism;

public class D {
	public static void util(SuperClass superClass) {
		superClass.methodOfSuperClass();
		// For each execution of this method, different objects will be passed
		// to it.
		// which Object will be used is determined during run time only.
		// This shows dynamic polymorphism.
	}

	public static void main(String[] args) {
		SuperClass superClass1 = new SuperClass();
		SubClass subClass = new SubClass();
		SuperClass superClass2 = new SuperClass();

		util(superClass1);
		util(subClass);
		util(superClass2);
		
		D();
	}
	
	//Warning: This Method has a constructor name
	public static void D(){
		System.out.println("i am From Method D");
	}
}
