import java.util.*;
public class swea_1492_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			long N = sc.nextInt();
			long A = sc.nextInt();
			long B = sc.nextInt();
			long value, min = Long.MAX_VALUE;
			for(long C=1; C<=N/2; C++) {
				for(long R=C; C*R<=N; R++) {
					value = A*(R-C) + B*(N-R*C);
					if(value<min) min=value;
				}
			}
			System.out.format("#%d %d\n", tc, min);
		}
		sc.close();
	}
}