package polymorphism;

public class TestCal {

	public static void main(String[] args) {

//		Calculator c1 = new Calculator();
//		Calculator c2 = new Calculator(10);
//		Calculator c3 = new Calculator(20.5f);
//
//		c1.sum(10);
//
//		System.out.println(c1.sum(10, 20));
//
//		c1.sum(10, 10.5);
//
//		System.out.println(c1.sum(10.5, 20.5));

		
		VolumeCalculator v1 = new VolumeCalculator();
		
		System.out.println("Volume of Cube = "+v1.calculateVolume(10.5));
		System.out.println("Volume of Cuboid = "+ v1.calculateVolume(7.5, 4.5, 8.9));
		System.out.println("Volume of Cylinder = "+ v1.calculateVolume(5.5, 3.2));
	}

}
