import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_ {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		String str = br.readLine().trim();
		int padding;
		String bstr;
		   for (int i = 0, size = str.length(); i < size; i++) {
		   padding = 0;
		    bstr = Integer.toBinaryString(Integer.parseInt(Character.toString(str.charAt(i)), 16));
		    while (bstr.length() + padding < 4) {
		     sb.append("0");
		     padding++;
		    }
		    sb.append(bstr);
		   }
		System.out.println(sb.toString());
	}
	

}
