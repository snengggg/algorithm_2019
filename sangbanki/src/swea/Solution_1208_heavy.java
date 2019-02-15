package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1208_heavy {
	static int[] flat;
	static int lastNum;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int dump;

		flat = new int[100];
		for (int testcase = 1; testcase <= 10; testcase++) {

			lastNum = 0;
			//totalSum = 0;
			int sub = 0;
			dump = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 100; i++) {
				flat[i] = Integer.parseInt(st.nextToken());
				//totalSum += flat[i];
			}
			Arrays.sort(flat);
			
			while(dump > 0) {
				flat[99]--;
				flat[0]++;
				Arrays.sort(flat);
				sub = flat[99] - flat[0];
				dump--;
			}
			System.out.println("#" + testcase + " " + sub);	
				
			}



		}



}