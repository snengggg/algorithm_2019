import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class swea_11062_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.setIn(new FileInputStream("res/11062.txt"));
		HashMap<String, Integer> pwd = new HashMap<>();
		pwd.put("0001101", 0);
		pwd.put("0011001", 1);
		pwd.put("0010011", 2);
		pwd.put("0111101", 3);
		pwd.put("0100011", 4);
		pwd.put("0110001", 5);
		pwd.put("0101111", 6);
		pwd.put("0111011", 7);
		pwd.put("0110111", 8);
		pwd.put("0001011", 9);

		StringBuilder sb;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		String[] str;

		for (int t = 1; t <= T; t++) {
			sb = new StringBuilder();
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int cnt = 0;
			str = new String[N];

			String substr = "";
			int[] subnum = new int[N];
			for (int i = 0; i < N; i++) {
				str[i] = br.readLine();
			}

			for (int i = 0; i < N - 4; i++) {
				for (int j = M - 1; j >= 55; j--) {
					if (str[i].charAt(j) - '0' == 1) {
						substr = str[i].substring(j - 55, j + 1);
						i = 101;
						break;
					}
				}
			}

			int[] pNum = new int[8];
			String pwdstr;
			int pwdcnt = 0;

			for (int i = 0; i < 56; i++) {
				pwdstr = substr.substring(i, i + 7);
				if (!pwd.containsKey(pwdstr)) {
					break;
				}
				pNum[cnt++] = pwd.get(pwdstr);
				i += 6;
			}

			int odd, even, sum = 0;

			odd = pNum[0] + pNum[2] + pNum[4] + pNum[6];
			even = pNum[1] + pNum[3] + pNum[5] + pNum[7];
			if ((odd * 3 + even) % 10 == 0) {
				sum = odd + even;
			}

			sb.append("#");
			sb.append(t);
			sb.append(" ");
			sb.append(sum);
			System.out.println(sb.toString());

		}

	}

}
