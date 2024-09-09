package qsp.constructor;

public class student {
int id;
String name;
student(int i, String n){
	id=i;
	name=n;
}
public static void main(String[] args) {
	student s1=new student(101,"pinku");
	
student s2=new student(201,"pinki");
System.out.println(s1.id);
System.out.println(s1.name);
System.out.println(s2.id);
System.out.println(s2.name);
}
}
