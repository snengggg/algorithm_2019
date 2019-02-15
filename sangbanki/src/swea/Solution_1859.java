package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1859 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		int N;
		int[] basket;
		long maxCost;
		int curPrice = 0;
		
		for(int testcase = 1; testcase <= T; testcase++) {
		
			N = Integer.parseInt(br.readLine());
			basket = new int[N];
			curPrice = 0;
			maxCost = 0;
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < N; i++) {
				basket[i] = Integer.parseInt(st.nextToken());
			}
			curPrice = basket[N-1];
			for(int i = N-2; i >= 0; i--) {
				if(basket[i] < curPrice) {
					maxCost += curPrice - basket[i];
				}else {
					curPrice = basket[i];
				}
			}
			
			System.out.println("#" + testcase + " " + maxCost);
		}		
	}

}
