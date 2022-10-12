package week1.day3;

public class primeNumber {

	  public static void main(String[] args) {
		  // local variables
	    int n = 13;
	    int count = 0;
	    // if condition
	    if (n <= 1) {
	      System.out.println("The number is not prime");
	      return;
	    }
	    for (int i = 1; i <= n / 2; i++) {
	      if (n % i == 0) {
	        count++;
	      }
	    }

	    if (count > 1) {
	        System.out.println("The number is not prime");
	    }
	    else {
	      System.out.println("The number is prime");
	    }
	  }
	}