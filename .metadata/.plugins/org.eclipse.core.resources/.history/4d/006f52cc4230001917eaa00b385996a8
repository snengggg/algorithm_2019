//package d3;
//
//import java.io.BufferedReader;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.StringTokenizer;
//
//public class Solution_D3_1244_2 {
//	static ArrayList<Nums> Num;
//	static int[] NumCopy;
//	static int MaxN;
//	static int size;
//	public static void main(String[] args) throws NumberFormatException, IOException {
//
//		System.setIn(new FileInputStream("res/1244.txt"));
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st;
//		
//		int T = Integer.parseInt(br.readLine());
//		
//		String preN;
//		Comparator<Integer> comp = Collections.reverseOrder();
//		
//		int exch;
//		for(int t = 1; t<= T; t++) {
//			st = new StringTokenizer(br.readLine());
//			preN = st.nextToken();
//			exch = Integer.parseInt(st.nextToken());
//			size = preN.length();
//			Num = new ArrayList<>();
//			NumCopy = new int[size];
//			MaxN = 0;
//			int curN;
//			for(int i = 0; i < size; i++) {
//				curN = preN.charAt(i) - '0';
//				NumCopy[i] = curN;
//				Num.add(new Nums(curN));
//			}
//			Collections.sort(Num);
//
//			
//			for(int i = 0; i < exch; i++) {
//				for(int j = size-1; j >0; j--) {
//					if(Num.get(j).num != NumCopy[j]) {
//						NumChange(j);
//						break;
//					}
//				}
//			}
//		}
//		
//	}
//	public static void NumChange(int index) {
//		
//		int Copytemp = NumCopy[index];
//		int temp = Num[index];
//		Num[index] = NumCopy[index];
//		for(int i = size-1; i >=0; i--) {
//			if(Num[i] == Copytemp) {
//				Num[i] = temp;
//			}
//		}
//		
//	
//		
//	}
//	class Nums implements Comparable<Nums>{
//
//		int num;
//		
//		Nums(int n){
//			this.num= num;
//		}
//
//		@Override
//		public int compareTo(Nums o) {
//	
//			return o.num-num;
//		}
//		
//	}
//	
//
//}
