import java.io.*;
import java.util.*;

    public class FencePainting {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader("paint.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("paint.out")));

        StringTokenizer st = new StringTokenizer(r.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
       
        st = new StringTokenizer(r.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int[] cover = new int [100];
        for(int i = a; i<b; i++) {cover[i] = 1;}
        for(int j = c; j<d; j++) {cover[j] = 1;}

        int ans = 0;
        for(int i = 0; i<cover.length; i++) {ans += cover[i];}
        pw.println(ans);
            pw.close();
    }
}

