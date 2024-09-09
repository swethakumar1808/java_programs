package qsp.looping;
import java.util.Scanner;
public class oddeven {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int v=s.nextInt();
		for(int i=0;i<=v;i++) {
			if(i%2==0) {
				System.out.println(i+"even");
			}
			else {
			System.out.println(i+"odd");

			}
		}
	}

}
