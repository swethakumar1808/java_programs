package qsp.looping;

public class perfect {
public static void main(String[] args) {
	int a=6;
	int sum=0;
	for(int i=1;i<=a/2;i++) {
		if(a%i==0) {
			sum=sum+i;
		}
	}

	if(sum==a) {
		System.out.println("perfect number");
	}
	else {
		System.out.println("not perfect");
	}
	}
}



