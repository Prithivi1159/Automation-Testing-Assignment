package week1day4;

public class Duplicate {
public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		//Array length
		int arrayLength = arr.length;
		//initialize the count variable
		int count;
		//iterate from 0
		for (int i = 0; i <arrayLength ; i++) {
			//initialize the count 1
			count=1;
			for (int j = i+1; j < arr.length; j++) {
				
				//find the matches
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(arr[i]);
			}
		}
		
		
		
		

}
}
