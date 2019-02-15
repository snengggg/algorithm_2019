package parcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bjoon_1388 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int toggleCnt = 0;

		// String[] line = new String[4];
		// String str;
		// for(int i = 0; i < N; i++) {
		// str = br.readLine();
		// String[] line = str.split("|");
		// for(String s : line) {
		// System.out.print(s + " ");
		// }
		// System.out.println();
		//
		// for(int j = 1; j < M; j++) {
		// if(str.charAt(j-1) != str.charAt(j)) {
		// toggleCnt++;
		// }
		// }
		// toggleCnt++;
		// }
		char a = ' ';

		String[] str = new String[N + M];
		for (int i = 0; i < N; i++) {
			str[i] = br.readLine();
			for (int j = 0; j < M; j++) {
				if (i == 0) {
					str[N + j] = Character.toString(str[i].charAt(j));
				} else {
					str[N + j] += str[i].charAt(j);
				}
			}
		}
		for (int i = 0; i < N + M; i++) {
			System.out.println(str[i]);
		}

	}

}
