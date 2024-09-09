package qsp.methods;

public class callingmethod {
	public static void main(String[]args) {
		System.out.println("I am Main");
		jeeva();
	}
	public static void jeeva(){
	System.out.println("i am jeeva");	
	vaish();
	}
	public static void vaish() {
		System.out.println("i am vaish");
		jeeva();
	}
}
