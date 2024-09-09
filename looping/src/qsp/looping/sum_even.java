package qsp.looping;
import java.io.*;
public class sum_even {
	public static void main(String[] args) {
	int sum=0;
	int v=10;
	for(int i=1;i<=v;i++){
		if(i%2==0) {
		sum+=i;
		System.out.println(sum);
	}
}
}
}
