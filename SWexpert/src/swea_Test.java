import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_Test {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
//		System.setIn(new FileInputStream("res/");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			
			int N = Integer.parseInt(br.readLine());
			int [][] a = new int [N][N];
					
			for(int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < N; j++) {
					a[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			System.out.print("#" + t + " \n");
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
			
			
		}
		
		
	}

}
