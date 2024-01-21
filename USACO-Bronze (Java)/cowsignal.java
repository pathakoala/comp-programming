import java.io.*;
import java .util.*;

public class cowsignal {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader("cowsignal.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("cowsignal.out")));

        StringTokenizer st = new StringTokenizer(r.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        String[][] lister = new String[m][n];
        String[][] finale = new String[k*m][k*n];

        for(int i = 0; i<m; i++ ) {
             st = new StringTokenizer(r.readLine());
             String str = st.nextToken();
             for(int j = 0; j<n; j++) {
                lister[i][j] = str.substring(j,j+1);
             }
        }

        for(int i = 0; i<m; i++) {
            for(int j=0; j<n; j++) {
                for(int g = 0; g<k; g++) {
                    for(int f = 0; f<k; f++) {
                        finale[k*i+g][k*j+f] = lister[i][j];
                    }
                }
            }
        }

        for(int i = 0; i<k*m; i++) {
            for(int j = 0; j<k*n; j++) {
                pw.print(finale[i][j]);
            }
            pw.println();
        }
        r.close();
        pw.close();
    }
    
}
