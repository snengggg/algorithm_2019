import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bjoon_10950 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			System.out.println(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
		}
	}
}
