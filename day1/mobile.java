package week1.day1;

public class mobile {
String mobileBrandName = "redmi note 11";
char mobileLogo = 'X';
short noOfMobilePiece = 54;
int mobileNumber = 95979556;
long mobileIMEInumber = 51564464516548415L;
float mobilePrice = 4556.455F;
boolean isDamaged = false;
public static void main(String[] args) {
	mobile mobiledetails = new mobile();
	System.out.println("Mobile Brand Name = "+mobiledetails.mobileBrandName);
	System.out.println("Mobile Logo = "+mobiledetails.mobileLogo);
	System.out.println("No of Mobile Piece = "+mobiledetails.noOfMobilePiece);
	System.out.println("Mobile Number = "+mobiledetails.mobileNumber);
	System.out.println("Mobile IMEI Number ="+mobiledetails.mobileIMEInumber);
	System.out.println("Mobile Price ="+mobiledetails.mobilePrice);
	System.out.println(" Mobile is Damaged = "+mobiledetails.isDamaged);
	
	
}


}
