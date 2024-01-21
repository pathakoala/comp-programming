import java.io.*;
import java.util.*;
public class kayaking {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(r.readLine());
        int[] weights = new int[2*n];
        for(int i = 0; i<n*2; i++) {
            weights[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(weights);
        int maxgap = 0;
        int gapval = 0;
        for(int i =0; i<n; i++) {
            if(maxgap !=  weights[2*i+1] - weights[2*i]) {
            maxgap = Math.max(maxgap, weights[2*i+1] - weights[2*i]);
            gapval = i;
            }
        }
        int summer=0;
        for(int i =0; i<n; i++) {
            if(i == gapval) {
                continue;
            }
            summer+=weights[2*i+1] - weights[2*i];
        }
        pw.print(summer);
        r.close();
        pw.close();
    }
}
