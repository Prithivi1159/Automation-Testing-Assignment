package week1day2;

public class Mobile {
	public void sendMessage() {
	System.out.println("Send Message");
}
public void shareDocument() {
System.out.println("Share document");

}
public void call() {
System.out.println("Call");
}
public static void main(String[] args) {
Mobile actions = new Mobile();
actions.sendMessage();
actions.shareDocument();
actions.call();
}

}
