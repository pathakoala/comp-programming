import java.io.*;
import java.util.*;

public class cownomics {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader("cownomics.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("cownomics.out")));

        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken()); 
        String[] spot = new String[n];
        String[] spotless = new String[n]; 
        for(int i =0 ; i<n; i++) {
            st = new StringTokenizer(r.readLine());
            spot[i] = st.nextToken();
        }
        for(int i =0 ; i<n; i++) {
            st = new StringTokenizer(r.readLine());
            spotless[i] = st.nextToken();
        }
        int pairwise = 0;
        
        for(int i = 0; i<m; i++) {
            for(int j = i+1; j<m; j++) {
                for(int k = j+1; k<m; k++) {
                    int[][] exis = new int[n][3];
                    int[][] oppexis = new int[n][3];
                    
                   boolean f = false;
                    for(int h = 0; h<n; h++) {
                        int a = 0;
                     int b = 0;
                        exis = add(h, i, a,exis, spot);
                        a++;
                        exis = add(h, j, a,exis, spot);
                        a++;
                        exis = add(h, k, a,exis, spot);
                        oppexis = add(h, i, b,oppexis, spotless);
                        b++;
                        oppexis = add(h, j, b,oppexis, spotless);
                        b++;
                        oppexis = add(h, k, b,oppexis, spotless);
                        if(exis[h][0] == oppexis[h][0] && exis[h][1] == oppexis[h][1] && exis[h][2] == oppexis[h][2]) {
                            f = true;
                        }
                    }
                    if(!f) {
                        pairwise++;
                    }
                }
            }
        }
        pw.print(pairwise);
        
        r.close();
        pw.close();
    }
    public static int[][] add(int n, int i, int a, int[][] exis, String[] spot) {
            if(spot[n].charAt(i) == 'A') {
                            exis[n][a] = 1;
                        }
            if(spot[n].charAt(i) == 'T') {
                            exis[n][a] = 2;
                        }
            if(spot[n].charAt(i) == 'C') {
                            exis[n][a] = 3;
                        }
            if(spot[n].charAt(i) == 'G') {
                            exis[n][a] = 4;
                        }
        return exis;
    }
}
