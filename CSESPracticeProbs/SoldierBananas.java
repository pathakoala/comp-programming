import java.io.*;
import java.util.*;

public class SoldierBananas {
    public static void main(String[] args) throws IOException {
       
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
       
            StringTokenizer st = new StringTokenizer(r.readLine());
            int k = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int f = 0;
           for(int i = 0; i<n; i++) { f += (i+1) * k;}
           if(f > w) {pw.print(f-w);} else {pw.print(0);}
            r.close();
                pw.close();
    }
}