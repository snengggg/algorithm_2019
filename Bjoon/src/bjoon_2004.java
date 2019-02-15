
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class bjoon_2004 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int two = 0;
		int five = 0;
		
		two += twoCnt(N);
		five += fiveCnt(N);
		
		if(M != 0) {
			two -= twoCnt(M);
			five -= fiveCnt(M);
		}
		if(N != M) {
			two -= twoCnt(N-M);
			five -= fiveCnt(N-M);
		}
		
		System.out.print(Math.min(two, five));
	}
	
	public static int twoCnt(int Num) {
		int cnt_2 = 0;
		for (int i = 2; i <= Num; i *= 2) {
			cnt_2 += Num / i;
		}
		return cnt_2;
	}
	public static int fiveCnt(int Num) {
		int cnt_5 = 0;
		for (int i = 5; i <= Num; i *= 5) {
			cnt_5 += Num / i;
		}
		return cnt_5;
	}
}