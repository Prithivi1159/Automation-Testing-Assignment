package week1.day3;

public class fibonacciSeries {
	// calling the variable inside the main method so we 
	//use the globle variable as static
	static int A = 0;
	static int B = 1;
	static int  C;
	public static void main(String[] args) {
		System.out.print(A +" "+B);
		// Range into 8 so we give greater then 9
		for (int i = 2; i < 9; i++) {
			
			//sum the first number and second number
				C = A+B;
				System.out.print(" "+C);
				// swapping the values
				A=B;
				B = C; 
				
				
				
				
				
			}
			
			
			
			
			
			
			
		}
	}
	
