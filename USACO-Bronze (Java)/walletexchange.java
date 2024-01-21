import java.io.*;
import java.util.*;

public class walletexchange {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken()); 
        for(int i = 0; i<n; i++) {
            st = new StringTokenizer(r.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if((Math.max(a,b) - Math.min(a,b)) % 2 == 0) {
                pw.println("Bob");
            } else {
                pw.println("Alice");
            }
        }
        pw.close();
        r.close();
    }
}
