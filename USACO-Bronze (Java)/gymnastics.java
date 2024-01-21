import java.io.*;
import java.util.*;
public class gymnastics {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new FileReader("gymnastics.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("gymnastics.out")));

        StringTokenizer st = new StringTokenizer(r.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[][] list = new int[k][n];
        for(int i = 0; i<k; i++) {
            st = new StringTokenizer(r.readLine());
            for(int j = 0; j<n; j++) {
                list[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int count = 0;
        for(int i = 1; i<n+1; i++) {
            for(int j = i+1; j<n+1; j++) {
                if(consis(i, j, k, n, list)) {
                    count++;
                }
            }
        }

        pw.print(count);
        r.close();
        pw.close();

        
    }
    public static boolean consis(int a, int b, int k , int n, int[][] list) {
            int c = 0;
            int co = 0;
            int d = 0;
            int e = 0;
            for(int i = 0; i<k; i++) {
                for(int j = 0; j<n; j++) {
                    if(list[i][j] == a) {
                        d = j;
                    }
                    if(list[i][j] == b) {
                        e = j;
                    }
                }
                if(d>e) {
                    c++;
                } 
                if(e>d) {
                    co++;
                }
            }
            if(c == k || co == k) {
                return true;
            } else {
                return false;
            }
        }
}
