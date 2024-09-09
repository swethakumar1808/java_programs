package qsp.looping;

public class armstrong {
	public static void main(String[] args) {

		int num = 371;
		int onum = 0;
		int remainder = 0;
		int result = 0;
		onum = num;
		while (onum != 0) {
			remainder = onum % 10;
			result += Math.pow(remainder, 3);
			onum /= 10;
		}
		if (result == num) {
			System.out.println("armstrong");
		} else {
			System.out.println("not armstrong");
		}
	}
}
