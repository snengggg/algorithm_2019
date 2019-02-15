import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class swea_1491 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bt = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb;
		int T = Integer.parseInt(br.readLine());
		long n, a, b, min;
		for(int t = 1; t <= T; t++) {
			sb = new StringBuilder();
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			min = Long.MAX_VALUE;
			
			for(long i = 1; i <= n/2; i++) {
				for(long j = i; j <= n; j++) {
					if(i*j > n) {
						break;
					}
					min = Math.min(min,a*(j-i) + b*(n-j*i));
					}
				}
			
			
			sb.append("#" + t + " ");
			sb.append(min);
			bt.write(sb.toString() + "\n");
	}
			
		

		bt.close();
		br.close();
		
	}

}
