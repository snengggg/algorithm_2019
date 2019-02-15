import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;

public class swea_1215 {

	static int pLen;
	static Stack<Character> s = new Stack<>();
	static String line[];
	static int total;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		line = new String[8];
		int bound;
		for (int t = 1; t <= 10; t++) {

			sb = new StringBuilder();
			pLen = Integer.parseInt(br.readLine());
			bound = 8 - pLen;
			total = 0;

			for (int i = 0; i < 8; i++) {
				line[i] = br.readLine();
			}

			for (int i = 0; i < 8; i++) {
				for (int j = 0; j <= bound; j++) {
					pelindromR(i, j);
					s.clear();
				}
			}
			for (int i = 0; i <= bound; i++) {
				for (int j = 0; j < 8; j++) {
					pelindromD(i, j);
					s.clear();
				}
			}
			sb.append("#");
			sb.append(t);
			sb.append(" ");
			sb.append(total);
			System.out.println(sb.toString());
		}

	}

	public static void pelindromR(int y, int x) {
		int i, j = pLen/2;
		char curc;
		for(i = 0; i < pLen/2; i++) {
			s.push(line[y].charAt(x + i));
		}
		if(pLen%2 == 1) {
			j = pLen/2+1;
		}
		for(; j < pLen; j++) {
			curc = line[y].charAt(x + j);
			if(s.peek() == curc) {
				s.pop();
			}else {
				return;
			}
		}
		total++;
	}
	public static void pelindromD(int y, int x) {
		int i, j = pLen/2;
		char curc;
		for(i = 0; i < pLen/2; i++) {
			s.push(line[y+i].charAt(x));
		}
		if(pLen%2 == 1) {
			j = pLen/2+1;
		}
		for(; j < pLen; j++) {
			curc = line[y+j].charAt(x);
			if(s.peek() == curc) {
				s.pop();
			}else {
				return;
			}
		}
		total++;
	}
	
}
