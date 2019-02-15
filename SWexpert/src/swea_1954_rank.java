import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class swea_1954_rank{
    static int[] dx = { 0, 1, 0, -1 };
    static int[] dy = { -1, 0, 1, 0 };
    static int[][] arr;
    static int N;
 
    static class Snail {
        public int x, y, count, direction;
 
        public Snail(int x, int y, int count, int direction) {
            this.x = x;
            this.y = y;
            this.count = count;
            this.direction = direction;
        }
 
        public void go() {
            this.x = x + dx[direction];
            this.y = y + dy[direction];
            arr[x][y] = count++;
        }
 
    }
 
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int T = Integer.parseInt(br.readLine());
 
        for (int z = 1; z <= T; z++) {
            N = Integer.parseInt(br.readLine());
            arr = new int[N][N];
            StringBuilder sb = new StringBuilder();
            Snail snail = new Snail(0, -1, 1, 2);
 
            while (true) {
                int nx = snail.x + dx[snail.direction];
                int ny = snail.y + dy[snail.direction];
                 
                if (nx < 0 || ny < 0 || nx >= N || ny >= N || arr[nx][ny] != 0) {
                    if (snail.direction == 0) {
                        snail.direction = 3;
                    } else {
                        snail.direction -= 1;
                    }
                    continue;
                }
 
                snail.go();
                if(snail.count==N*N+1) {
                    break;
                }
 
            }
            sb.append("#"+z + "\n");
            for(int i=0; i<N; i++) {
                for(int j=0; j<N; j++) {
                    sb.append(arr[i][j] + " ");
                }
                sb.append("\n");
            }
            System.out.print(sb);
             
 
        }
 
    }
 
}