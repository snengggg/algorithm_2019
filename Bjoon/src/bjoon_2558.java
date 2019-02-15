import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bjoon_2558 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = Integer.parseInt(br.readLine());
		System.out.println(sum + Integer.parseInt(br.readLine()));
	}

}
