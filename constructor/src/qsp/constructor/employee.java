package qsp.constructor;

public class employee {
int eid;
String ename;
int esalary;
public void work() {
	System.out.println("working");
}
public void eat() {
	System.out.println("eating");

}
employee(int eid,String ename, int esalary){
	this.eid=eid;
	this.ename=ename;
	this.esalary=esalary;
}
}