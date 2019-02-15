

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class swea_1244_3 {
	static int[] Num;
	static int[] Num2;
	static int[] NumCopy;
	static int MaxN;
	static int size;
	static int[] excharr;
	public static void main(String[] args) throws NumberFormatException, IOException {

		System.setIn(new FileInputStream("res/1244.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		String preN;
		Comparator<Integer> comp = Collections.reverseOrder();
		
		int exch;
		for(int t = 1; t<= T; t++) {
			st = new StringTokenizer(br.readLine());
			preN = st.nextToken();
			exch = Integer.parseInt(st.nextToken());
			size = preN.length();
			Num = new int[size];
			Num2 = new int[size];
			NumCopy = new int[size];
			MaxN = 0;
			excharr = new int[exch];
			int curN;
			for(int i = 0; i < size; i++) {
				curN = preN.charAt(i) - '0';
				Num[i] = curN;
				Num2[i] = curN;
			}
			Arrays.sort(Num2);
			for(int i = 0; i < size; i++) {
				NumCopy[i] = Num2[size-i-1];
			}

			
			int len = 1;
			for(int i = 0; i < exch; i++) {
				for(int j = 0; j < size; j++) {
					if(Num[j] != NumCopy[j]) {
						for(int k = j; k < size-1; k++) {
							if(NumCopy[k] == NumCopy[k+1] && exch-i >0) {
								len++;
								i++;
							}
						}
						NumChange(j, len);
						break;
					}
					if(j == size-1) {
						i = 100;
						break;
					}
				}
			}
			
			System.out.println(Arrays.toString(Num));
		}
		
	}
	public static void NumChange(int index, int len) {
		
		
		if(len == 1) {
			int Copytemp = NumCopy[index];
			int temp = Num[index];
			Num[index] = NumCopy[index];
			for(int i = size-1; i >=0; i--) {
				if(Num[i] == Copytemp) {
					Num[i] = temp;
					return;
				}
			}
		}else {
			
		}
		
	}
	

}
