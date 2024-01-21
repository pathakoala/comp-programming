import java.io.*;
import java.util.*;

public class maximumdistance {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] xval = new int[n];
        int[] yval = new int[n];
        int count = 0;
        st = new StringTokenizer(r.readLine());
        for(int i = 0; i<n; i++) {
            xval[i] = Integer.parseInt(st.nextToken());
            count+=i;
        }
        st = new StringTokenizer(r.readLine());
        for(int i = 0; i<n; i++) {
            yval[i] = Integer.parseInt(st.nextToken());
        }

        double[] leng = new double[count];
        int c = 0;
        for(int i =0; i<n; i++) {
            for(int j = i+1; j<n; j++) {
                leng[c] = Math.pow(xval[j] - xval[i],2) + Math.pow(yval[j] - yval[i], 2);
                c++;
            }
        }   
        
        double max = 0;
        for(int i =1; i<count; i++) {
            max = Math.max(max, leng[i]);
        }
        pw.print((int)max);
        r.close();
        pw.close();

    }
    
}
