package parcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {

	public static void main(String[] args) throws IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		
		while(true) {
			
			str = br.readLine();
			System.out.println(str);
			if(str == null) {
				break;
			}
		}
	}
}
