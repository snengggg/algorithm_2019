import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 
 * 작은 것 왔을때 작은곳부터 앞으로 (해당 숫자 변동없이 && 범위 벗어나지 않고)visit x칸만큼 찍을수 있어야하고
 * 큰것 왔을때 뒤로 (해당숫자변동없이 && 범위 벗어나지 않고) visit x 칸만큼 찍을 수 있어야 함.
 *
 */
public class swea_4014 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[][] map;
		
		int T = Integer.parseInt(br.readLine());
		
		int n, x;
		
		for(int t = 1; t<=T; t++) {
		
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			x = Integer.parseInt(st.nextToken());
			map = new int[n][n];
			
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < n; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			
		}
		
		
		
		
		
		

	}

}
