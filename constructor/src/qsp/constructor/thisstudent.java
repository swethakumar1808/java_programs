package qsp.constructor;

public class thisstudent {
	int id;
	String name;
	thisstudent(int id, String name){
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) {
		thisstudent s1=new thisstudent(101,"pinku");
		
	thisstudent s2=new thisstudent(201,"pinki");
	System.out.println(s1.id);
	System.out.println(s1.name);
	System.out.println(s2.id);
	System.out.println(s2.name);
}
}
