package qsp.looping;

public class multiples5 {
public static void main(String[] args) {
	int sum=0;
	int result=0;
	for(int i=0;i<=100;i++) {
		if(i%5==0) {
			sum+=i;
		}
	}
			result=sum;
			System.out.println("sum="+result);
		}
	}

