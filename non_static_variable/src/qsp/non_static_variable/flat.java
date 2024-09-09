package qsp.non_static_variable;

public class flat {
	String tv;
	String ref;
	double price;
public static void main(String[] args) {
	flat f1=new flat();
	f1.tv="L.G";
	f1.ref="Samsung";
	f1.price=10000;
	System.out.println(f1.tv);
	System.out.println(f1.ref);
	System.out.println(f1.price);
}
}
