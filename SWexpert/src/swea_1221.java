import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class swea_1221 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.setIn(new FileInputStream("res/GNS_test_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb;
		int[] arr;
		String str, res;

		int T = Integer.parseInt(br.readLine());
		String trash;
		int N;
		for (int t = 1; t <= T; t++) {
			sb = new StringBuilder();
			st = new StringTokenizer(br.readLine());
			trash = st.nextToken();
			N = Integer.parseInt(st.nextToken());
			arr = new int[10];
			st = new StringTokenizer(br.readLine());
			
			for (int i = 0; i < N; i++) {
				str = st.nextToken();
				switch(str) {
				case "ZRO": arr[0]++;
					break;
				case "ONE": arr[1]++;
					break;
				case "TWO": arr[2]++;
					break;
				case "THR": arr[3]++;
					break;
				case "FOR": arr[4]++;
					break;
				case "FIV": arr[5]++;
					break;
				case "SIX": arr[6]++;
					break;
				case "SVN": arr[7]++;
					break;
				case "EGT": arr[8]++;
					break;
				case "NIN": arr[9]++;
					break;
				}
			}
			sb.append("#");
			sb.append(t);
			sb.append(" ");
			for (int i = 0; i < 10; i++) {
				res = curNum(i);
				for(int j = 0; j < arr[i]; j++) {
					sb.append(res);
					sb.append(" ");	
				}
			}

			System.out.println(sb.toString());
		}
	}
	public static String curNum(int n) {
		switch (n) {
		case 0:
			return "ZRO";
		case 1:
			return "ONE";
		case 2:
			return "TWO";
		case 3:
			return "THR";
		case 4:
			return "FOR";
		case 5:
			return "FIV";
		case 6:
			return "SIX";
		case 7:
			return "SVN";
		case 8:
			return "EGT";
		case 9:
			return "NIN";
		default:
			return "";
		}
	}

}
