import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class swea_1221_2 {
	
	public static final int ZRO = 0;
	public static final int ONE = 1;
	public static final int TWO = 2;
	public static final int THR = 3;
	public static final int FOR = 4;
	public static final int FIV = 5;
	public static final int SIX = 6;
	public static final int SVN = 7;
	public static final int EGT = 8;
	public static final int NIN = 9;

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.setIn(new FileInputStream("res/GNS_test_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb;
		int[] arr;

		int T = Integer.parseInt(br.readLine());
		String trash;
		int N;
		for (int t = 1; t <= T; t++) {
			sb = new StringBuilder();
			st = new StringTokenizer(br.readLine());
			trash = st.nextToken();
			N = Integer.parseInt(st.nextToken());
			arr = new int[N];
			st = new StringTokenizer(br.readLine());

			for (int i = 0; i < N; i++) {
				arr[i] = exchangeNum(st.nextToken());
			}
			Arrays.sort(arr);
			sb.append("#");
			sb.append(t);
			sb.append(" ");
			for (int i = 0; i < N; i++) {
				sb.append(exchangeNum2(arr[i]));
				sb.append(" ");
			}

			System.out.println(sb.toString());
		}
	}

	public static int exchangeNum(String str) {

		if (str.equals("ZRO")) {
			return 0;
		} else if (str.equals("ONE")) {
			return 1;
		} else if (str.equals("TWO")) {
			return 2;
		} else if (str.equals("THR")) {
			return 3;
		} else if (str.equals("FOR")) {
			return 4;
		} else if (str.equals("FIV")) {
			return 5;
		} else if (str.equals("SIX")) {
			return 6;
		} else if (str.equals("SVN")) {
			return 7;
		} else if (str.equals("EGT")) {
			return 8;
		} else {
			return 9;
		}
	}

	public static String exchangeNum2(int n) {

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
