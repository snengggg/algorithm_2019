import java.util.Scanner;

public class Solution_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int max;
		for(int t = 1; t<= T; t++) {
			max = -1;
			for(int i = 0; i < 10; i++) {
				max = Math.max(max, sc.nextInt());
			}
			System.out.println("#" + t + " " + max);
		}
	}

}