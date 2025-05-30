package polymorphism2;

public class Test {

	public static void main(String[] args) {
		
		Amazon obj = new Myntra();
		
		System.out.println(obj.p);
		
		obj.m1();
		
		obj.m2();

	}

}
