package week2.day1;

public class palindrome {
		public void main(String[] args) {
			
		
			String name="racecar";
			String reverseName="";
	            
			char[] charArray=name.toCharArray();
			for(int i=charArray.length-1; i>=0; i--) {
				reverseName=reverseName+charArray[i];
				
			}
			System.out.println(reverseName);

			
		if (reverseName.equals(name)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
			
			
		}
}