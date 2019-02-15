package dp_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bjoon_11062_2 {

	static int[] arr;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		int n, l, r, g, cnt;

		for (int t = 1; t <= T; t++) {
			n = Integer.parseInt(br.readLine());
			arr = new int[n];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			l = 0;
			r = n - 1;
			g = 0;
			cnt = -1;

			while (l < r - 1) {
				cnt++;
				if (card(l, r)) {
					if (cnt % 2 == 0) {
						g += arr[l];
					}
					l++;

				} else {
					if (cnt % 2 == 0) {
						g += arr[r];
					}
					r--;
				}
			}
			if((++cnt) % 2 == 0) {
				g += Math.max(arr[l], arr[r]);
			}else {
				g += Math.min(arr[l], arr[r]);
			}
			
			System.out.println(g);
		}
	}
	public static boolean card(int l, int r) {
		if (arr[l] + arr[r - 1] > arr[l + 1] + arr[r]) {
			return true;
		} else if (arr[l] + arr[r - 1] < arr[l + 1] + arr[r]) {
			return false;
		} else {
			if (arr[l] > arr[r]) {
				return true;
			} else {
				return false;
			}
		}
	}
}
