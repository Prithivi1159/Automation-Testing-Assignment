package week1day2;

public class Car {
	public void applybrake() {
		System.out.println("Applybrake");
	}
public void applyGear() {
	System.out.println("Apply gear");

}
public void switchOnAc() {
	System.out.println("Switch on AC");
}
public void applyAccelerate() {
	System.out.println("Apply Accelerate");
}
public static void main(String[] args) {
	Car actions = new Car();
	actions.applybrake();
	actions.applyGear();
	actions.switchOnAc();
	actions.applyAccelerate();
}
}
