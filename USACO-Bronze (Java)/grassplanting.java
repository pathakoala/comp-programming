import java.io.*;
import java.util.*;

public class grassplanting {
    public static void main(String[] args) throws IOException { 
        BufferedReader r = new BufferedReader(new FileReader("planting.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("planting.out")));

        StringTokenizer st = new StringTokenizer(r.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] degrees = new int[n];
        for(int i = 0; i<n-1; i++) {
            st = new StringTokenizer(r.readLine());
            degrees[Integer.parseInt(st.nextToken()) -1]++;
            degrees[Integer.parseInt(st.nextToken())-1] ++;
        }
        int max = degrees[0];
        for(int i = 1; i<n; i++) {
            max = Math.max(max, degrees[i]);
        }
        pw.print(max+1);

        pw.close();
        r.close();
    }
}
