import java.io.*;
import java.util.*;

public class MissingNumber {
    public static void main(String[] args) throws IOException {
       
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

            StringTokenizer st = new StringTokenizer(r.readLine());
            int n = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(r.readLine());
            int[] range = new int[n];
            for(int i = 0; i<n-1; i++) {range[Integer.parseInt(st.nextToken())-1] = 1;}
            for(int i = 0; i<n; i++) {if(range[i] == 0) {pw.print(i+1);}}
                pw.close();
    }
}

