package polymorphism;

public class Calculator {

	// constructor overloading

	Calculator() {

	}

	Calculator(int p) {

	}

	Calculator(float f) {

	}

//Method overloading

	void sum(int a) {
		System.out.println(a + a);
	}

	int sum(int a, int b) {
		return a + b;
	}

	void sum(int a, double b) {
		System.out.println(a + b);
	}

	double sum(double a, double b) {
		return a + b;
	}
}
