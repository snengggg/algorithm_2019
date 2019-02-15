
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class swea_1244_4 {
	static int[] Num;
	static int[] Num2;
	static int[] NumCopy;
	static int size;

	public static void main(String[] args) throws NumberFormatException, IOException {

		System.setIn(new FileInputStream("res/1244.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb;

		int T = Integer.parseInt(br.readLine());
		String preN;
		int exch;
		for (int t = 1; t <= T; t++) {
			sb = new StringBuilder();
			st = new StringTokenizer(br.readLine());
			preN = st.nextToken();
			exch = Integer.parseInt(st.nextToken());
			size = preN.length();
			Num = new int[size];
			Num2 = new int[size];
			NumCopy = new int[size];
			int curN, toggle;
			boolean sameflag = false;
			for (int i = 0; i < size; i++) {
				curN = preN.charAt(i) - '0';
				Num[i] = curN;
				Num2[i] = curN;
			}
			Arrays.sort(Num2);
			for (int i = 0; i < size; i++) {
				NumCopy[i] = Num2[size - i - 1];
				if(i < size-1 && Num2[i] == Num2[i+1]) {
					sameflag = true;
				}
			}//Desc Sorting

			int len = 1;
			
			for (int i = 0; i < exch; i++) {
				for (int j = 0; j < size; j++) {
					if (Num[j] != NumCopy[j]) {
						for (int k = j; k < size - 1; k++) {
							if (exch - (i + 1) > 0 && NumCopy[k] == NumCopy[k + 1]) {
								len++;
								i++;
							} else {
								break;
							}
						}
						NumChange(j, len);
						break;
					}
					if (j == size - 1) {
						if((exch - i) % 2 == 1  && !sameflag) {
							toggle = Num[size-1];
							Num[size-1] = Num[size-2];
							Num[size-2] = toggle;
						}
						i = 100;
						break;
					}
				}
			}

			sb.append("#");
			sb.append(t);
			sb.append(" ");
			for(int i = 0; i < size; i++) {
				sb.append(Num[i]);
			}
			System.out.println(sb.toString());
		}

	}

	public static void NumChange(int index, int len) {

		int Copytemp;
		if (len == 1) {
			Copytemp = NumCopy[index];
			int temp = Num[index];
			Num[index] = NumCopy[index];
			for (int i = size - 1; i >= 0; i--) {
				if (Num[i] == Copytemp) {
					Num[i] = temp;
					return;
				}
			}
		} else {
			int[] substr = new int[len];
			int[] subindex = new int[len];
			int cnt = 0;
			int indCopy = index;
			Copytemp = NumCopy[index];
			for (int i = 0; i < len; i++) {
				substr[i] = Num[index++];
			}
			for (int i = size - 1; i >= 0; i--) {
				if (Num[i] == Copytemp) {
					subindex[cnt++] = i;
					if (cnt == len) {
						break;
					}
				}
			}

			Arrays.sort(substr);
			for (int i = 0; i < len; i++) {
				Num[subindex[i]] = substr[i];
				Num[indCopy++] = Copytemp;
			}

		}

	}

}
