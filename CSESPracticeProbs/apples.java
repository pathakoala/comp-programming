import java.io.*;
import java.util.*;

public class apples {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(r.readLine());
        int[] weights = new int[n];
        for(int i =0; i<n; i++) {weights[i] = Integer.parseInt(st.nextToken()); }
        long answer = Long.MAX_VALUE;
        for(int mask = 0; mask<(1<<n); mask++) {
            long sum1 =0; 
            long sum2 =0;
            for(int i = 0; i<n; i++) {
                if((mask & (1<<i)) >0) {
                    sum1+=weights[i];
                } else {
                    sum2+=weights[i];
                }
            }
            answer = Math.min(answer, Math.abs(sum1-sum2));
        }
        pw.println(answer);
        pw.close();
        r.close();
    }
}
