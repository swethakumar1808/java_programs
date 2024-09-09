package qsp.looping;

public class count {
public static void main(String[] args) {
	int num=1234;
	int count=0;
	while(num!=0){
		num/=10;
		count++;
	}
	System.out.println(count);
		}
}

