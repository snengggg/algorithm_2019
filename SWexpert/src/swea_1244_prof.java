
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class swea_1244_prof{
    static int Max;
    static HashSet<Integer> hs;
    static int k;
    public static void main(String[] args) throws FileNotFoundException {
        int tc = 0;
        System.setIn(new FileInputStream("res/1244.txt"));
        Scanner sc = new Scanner(System.in);
        tc = sc.nextInt();
        for(int i = 1;i<=tc;i++){
            StringBuilder number = new StringBuilder();
            number.append(sc.next());
            k = sc.nextInt();
            hs = new HashSet<>();
            Max = Integer.MIN_VALUE;
            dfs(number,0,0);
            System.out.println("#"+i+" "+Max);
        }
    }
 
    public static void dfs(StringBuilder num, int depth, int v){
        int temp = Integer.parseInt(num.toString());
        String x = new String();
        if(depth == k){
            Max = Math.max(Max, temp);
            return;
        }
        if(hs.contains(temp)){
            return;
        }
        hs.add(temp);
        for(int i = v;i<num.length();i++){
            for(int j = i+1;j<num.length();j++){
                x = num.substring(i,i+1);
                num.replace(i,i+1, num.substring(j,j+1));
                num.replace(j,j+1, x);
//              temp = a;
//              a = b;
//              b= temp;
 
                dfs(num, depth+1,i);
 
                x = num.substring(i,i+1);
                num.replace(i,i+1, num.substring(j,j+1));
                num.replace(j,j+1, x);
            }
        }
    }
}