import java.io.*;
import java.util.*;

public class photoshoot {
    static int icount;
    static int n;
    static Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    public static void main(String[] args) throws IOException {
        BufferedReader r  = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        n = Integer.parseInt(r.readLine());
        char[] order = r.readLine().toCharArray();
        int count  = 0;
        for(int i = n-2; i>=0; i-=2) {
            if(order[i] != order[i+1] && (order[i] == 'G') == (count%2 == 0)) {
                count++;
            }
        }
        pw.print(count);
        
        r.close();
        pw.close();
    }
}