import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bjoon_2438 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String str = "";
		for(int i = 1; i <= n; i++) {
			str += "*";
			System.out.println(str);
		}
		
	}

}
