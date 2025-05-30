package polymorphism;

public class VolumeCalculator {

	double calculateVolume(double side) {
		return side*side*side;
	}
	
	double calculateVolume(double length, double breadth, double height) {
		return length*breadth*height;
	}
	double calculateVolume(double radius, double height) {
	     return Math.PI*radius*radius*height;
	}
}
