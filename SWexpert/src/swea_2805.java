import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_2805 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		int T = Integer.parseInt(br.readLine());
		int N;
		String str;
		int sum, temp, temp2;
		for (int t = 1; t <= T; t++) {
			sb = new StringBuilder();
			N = Integer.parseInt(br.readLine());
			sum = 0;
			temp = N / 2;
			temp2 = temp + 1;
			for (int i = 0; i < N; i++) {
				str = br.readLine();
				for (int j = temp; j < temp2; j++) {
					sum += str.charAt(j) - '0';
				}
				if (i < N / 2) {
					temp--;
					temp2++;
				}else {
					temp++;
					temp2--;
				}
			}
			sb.append("#");
			sb.append(t);
			sb.append(" ");
			sb.append(sum);
			System.out.println(sb.toString());
		}
	}

}
