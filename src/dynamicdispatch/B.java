package dynamicdispatch;

public class B extends A {
	String b = "TKA";
	int c = 60;
	@Override
	void m2() {
		System.out.println(333);
	}

	void m3() {
		System.out.println(444);
	}

}
