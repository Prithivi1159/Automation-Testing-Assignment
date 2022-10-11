package week1day2;

public class Calculator {
	public void additionTwoNumbers(int A,int B) {
	int C = A+B;
	System.out.println(C);
	
	}

	public void subractionTwoNumber(int w,int f) {
		int e = w- f;
		System.out.println(e);
	
	}
	public void multipleTwoNumbers(double i,double j) {
		double g = i*j;
		System.out.println(g);
	}
	public void divideTwoNumbers(float k,float n) {
		float x = k/n;
		System.out.println(x);
	}
	public static void main(String[] args) {
		Calculator cals = new Calculator();
		cals.additionTwoNumbers(52, 45);
		cals.subractionTwoNumber(54, 78);
		cals.multipleTwoNumbers(47.4545, 23.4824556);
		cals.divideTwoNumbers(4541f, 52f);
	}
}
