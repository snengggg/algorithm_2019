package math_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bjoon_2018 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int first = 0, last = 0;
		int sum = 0, cnt = 0;
		
		while(first <= N) {
			
			if(sum <= N) {
				if(sum == N) {
					cnt++;
				}
				sum += ++first;
			}else {
				sum -= ++last;
			}
		}
		System.out.println(cnt);
		
		
	}

}
