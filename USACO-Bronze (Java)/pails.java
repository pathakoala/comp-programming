import java.io.*;
import java.util.*;

public class pails {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader("pails.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("pails.out")));

        StringTokenizer st = new StringTokenizer(r.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int gr = Math.max(x, y); 
        int le = Math.min(x, y);

        int m = Integer.parseInt(st.nextToken());
        int divis = m/gr;

        int[] div = new int[divis+1];
        int max = 0;
        for(int i = divis; i>=0; i--) {
            if(m - i*gr >= le) {
                int temp = (m-i*gr)/le;
                div[i] = (i*gr + temp*le);
            } else {
                div[i] = i*gr;
            }
            max = Math.max(max, div[i]);
        }
        pw.print(max);
    r.close();
    pw.close();   
    }
}
