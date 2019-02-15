package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1208 {
	static int[] flat;
	static int lastNum;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int dump;
		//int totalSum;
		//int avg;
		int curLow = 0;
		int curTop = 0;
		int curSub = 0;
		int lowCnt = 0;
		int topCnt = 0;
		flat = new int[100];
		//for (int testcase = 1; testcase <= 10; testcase++) {

			lastNum = 0;
			//totalSum = 0;
			dump = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 100; i++) {
				flat[i] = Integer.parseInt(st.nextToken());
				//totalSum += flat[i];
			}
			//flat[]
			curLow = flat[0];
			curTop = flat[99];
			curSub = curTop - curLow;
			int topSub = 0;
			topCnt = 1;
			int topTotal;
			//while(dump > 0) {
				
				for(int i = 1; i < 100; i++) {
					
					if(flat[100-i] == flat[100-i-1]) {
						curTop  = flat[100 - i];
						for(int j = 100-i; curTop != flat[j]; j--) {
							topCnt++;
						}
					}else {
						topSub = flat[100-i] - flat[100 - i - 1];
					}
					curTop = flat[100-i];
					for(int j = 100-i-1; curTop != flat[j]; j--) {
						topCnt++;
					}
					topSub = 
					
					topTotal = topSub*topCnt;
					
					
					if(flat[i] == curLow) {
						lowCnt++;
					}
					if(flat[100-i] == curTop) {
						topCnt++;
					}
					
					
					i++;
				//}
				
				
				
			}

			Arrays.sort(flat);

			/*
			 * for(int i = 0; i < 50; i++) { flat[i]++; flat[100-i]--; dump--; }
			 */

			dumping(dump);

		}

	//}

	public static void dumping(int d) {

		int sub;

		if (d < 0) {
			lastNum = lastNum - 1;

		}

		for (int i = 0; i < 50; i++) {
			// if(flat[i+1] == flat[i])

		}

	}

}