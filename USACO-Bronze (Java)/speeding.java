import java.io.*;
import java.util.*;

public class speeding {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new FileReader("speeding.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("speeding.out")));

        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] cop = new int[100];
        int[] besline = new int[100];

        int off1;
        int off2;
        int bes1;
        int bes2;

        int j = 0;
        int g = 0;

        for(int i = 0; i<n; i++) {
            st = new StringTokenizer(r.readLine());
            off1 = Integer.parseInt(st.nextToken());
            off2 = Integer.parseInt(st.nextToken());
            g = 0;
            while(g<off1) {
                cop[j] = off2;
                g++;
                j++;   
            }
        }

        int k = 0;
        int l = 0;
        for(int i = 0; i<m; i++) {
            st = new StringTokenizer(r.readLine());
            bes1 = Integer.parseInt(st.nextToken());
            bes2 = Integer.parseInt(st.nextToken());
            l = 0;
            while(l<bes1) {
                besline[k] = bes2;
                k++;
                l++;
            }
        }

        int maxdiff = 0;
        for(int i = 0; i<100; i++) {
            maxdiff = Math.max(maxdiff, besline[i]-cop[i]);
        }
        pw.print(maxdiff);

        r.close();
        pw.close();
    }
}
