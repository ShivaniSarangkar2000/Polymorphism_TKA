package dynamicdispatch;

public class Test2 {

	public static void main(String[] args) {
		A a1 = new B(); //Dynamic dispatch

		System.out.println(a1.a);
		System.out.println(a1.b);
	//	System.out.println(a1.c); //c cannot be resolved or is not a field
		a1.m1();
		a1.m2(); //Overriding m2() of class B
	//	a1.m3();  //The method m3() is undefined for the type A

	}
	}


