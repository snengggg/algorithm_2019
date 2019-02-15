

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class swea_1244 {
	static int[] Num;
	static int[] NumCopy;
	static int MaxN;
	static int size;
	public static void main(String[] args) throws NumberFormatException, IOException {

		System.setIn(new FileInputStream("res/1244.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		String preN;
		
		int exch;
		for(int t = 1; t<= T; t++) {
			st = new StringTokenizer(br.readLine());
			preN = st.nextToken();
			exch = Integer.parseInt(st.nextToken());
			size = preN.length();
			Num = new int[size];
			NumCopy = new int[size];
			MaxN = 0;
			for(int i = 0; i < size; i++) {
				Num[i] = preN.charAt(i) - '0';
			}
			
			NumChange(exch);
			
			
			System.out.println(MaxN);
		}
		
	}
	public static void NumChange(int cnt) {
		
		int temp;
	
		
		if(cnt == 0) {
			String imsi = "";
			for(int i = 0 ; i < size; i++) {
				imsi += Num[i];
			}
			if(Integer.parseInt(imsi) > MaxN) {
				MaxN = Integer.parseInt(imsi); 
			}
			return;
		}
		
		
		for(int i = 0; i < size; i++) {
			for(int j = i+1; j< size; j++) {
				NumCopy = Arrays.copyOf(Num, size);
				temp = Num[i];
				Num[i] = Num[j];
				Num[j] = temp;
				NumChange(cnt-1);
				Num = Arrays.copyOf(NumCopy, size);
			}
		}
		
	}

}
