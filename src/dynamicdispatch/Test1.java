package dynamicdispatch;

public class Test1 {

	public static void main(String[] args) {
		B a1 = new B();

		System.out.println(a1.a);
		System.out.println(a1.b);
		System.out.println(a1.c); 
		a1.m1();
		a1.m2();//Overriding
		a1.m3(); 

	}

}
