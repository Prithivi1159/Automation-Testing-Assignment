package week1.day1;

public class TwoWheeler {
	int noOfWheels=2;
	short noOfMirror=2;
	long chassisNumber=24554226546L;
	boolean isPunchered= false;
	String bikeName= "Duke";
	double runningKM = 24235.15564552;
public static void main(String[] args) {
		TwoWheeler bikespecification=new TwoWheeler();
		System.out.println("No of Wheels = "+bikespecification.noOfWheels);
		System.out.println("No of Mirrors = "+bikespecification.noOfMirror);
		System.out.println("Chassis Number = "+bikespecification.chassisNumber);
		System.out.println("Is punchered = "+bikespecification.isPunchered);
		System.out.println("Bike model = "+bikespecification.bikeName);
		System.out.println("Kilo meters covered= "+bikespecification.runningKM);
	}
}
