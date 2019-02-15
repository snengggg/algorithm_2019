import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_1954 {

	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.setIn(new FileInputStream("res/1954.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int N;
		int[][] map;
		int dir, cnt, cntMax, cy, cx; 
		for (int t = 1; t <= T; t++) {
			dir = 0;
			cy = 0;
			cx = 0;
			N = Integer.parseInt(br.readLine());
			map = new int[N][N];
			cnt = 0;
			cntMax = N*N;
			while(cnt < cntMax) {
				
				map[cy][cx] = ++cnt;
				
				if(cy+dy[dir] >= 0 && cy+dy[dir] < N && cx+dx[dir] >= 0 && cx+dx[dir] < N &&
						map[cy+dy[dir]][cx+dx[dir]] == 0) {
					cy = cy+dy[dir];
					cx = cx+dx[dir];
				}else {
					if(dir == 3) {
						dir = -1;
					}
					dir++;
					cy = cy+dy[dir];
					cx = cx+dx[dir];
				}
			}
			System.out.println("#" + t);
			for (int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					System.out.print(map[i][j] + " ");
				}
				System.out.println();
			}

		}

	}

}
