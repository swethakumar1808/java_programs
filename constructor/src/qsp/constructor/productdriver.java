package qsp.constructor;


public class productdriver {
	public static void main(String[] args) {
		product p=new product(101,"sweth",1000);
		p.addtocart();
		System.out.println(p.pid);
		System.out.println(p.pname);
		System.out.println(p.pprice);
}
}