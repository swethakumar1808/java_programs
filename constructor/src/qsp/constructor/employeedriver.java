package qsp.constructor;

public class employeedriver {
public static void main(String[] args) {
	employee e=new employee(1,"sweth",1000);
	e.work();
	e.eat();
	System.out.println(e.eid);
	System.out.println(e.ename);
	System.out.println(e.esalary);
}
}
