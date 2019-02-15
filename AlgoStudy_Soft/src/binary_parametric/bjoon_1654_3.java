package binary_parametric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bjoon_1654_3 {

	static int K;
	static int N;
	static int[] lan;
	static int res;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		K = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		lan = new int[K];
		
		for (int i = 0; i < K; i++) {
			lan[i] = Integer.parseInt(br.readLine());
			
		}

		curlen(0, lan[0]);

		System.out.println(res);

	}

	public static void curlen(int left, int right) {
		if (left == right - 1) {
			res = left;
			return;
		}
		int mid = (left + right) / 2;
		int lanNum = 0;
		for (int i = 0; i < K; i++) {
			lanNum += lan[i] / mid;
		}
		if (lanNum < N) {
			curlen(left, mid);
		} else if (lanNum > N) {
			curlen(mid, right);
		} else {
			while (mid < right) {
				lanNum = 0;
				mid++;
				for (int i = 0; i < K; i++) {
					lanNum += lan[i] / mid;
				}
				if (lanNum < N) {
					mid--;
					break;
				}
			}
			res = mid;
		}
	}

}
