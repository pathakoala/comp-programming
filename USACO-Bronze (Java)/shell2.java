import java.io.*;
import java.util.*;

public class shell2 
{
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new FileReader("shell.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("shell.out")));
		
		StringTokenizer st = new StringTokenizer(r.readLine());
	    int n = Integer.parseInt(st.nextToken());
	    
        int[] spos = new int[3];
        
        for(int i = 0; i<3; i++) {
            spos[i] = i;
        }

        int[] gcount = new int[3];

        for(int i = 0; i<n; i++) {
            st  = new  StringTokenizer(r.readLine());
            int f = Integer.parseInt(st.nextToken()) -1;
            int l = Integer.parseInt(st.nextToken())-1;
            int g = Integer.parseInt(st.nextToken())-1;

            int t = spos[l];
            spos[l] = spos[f];
            spos[f] = t;

            gcount[spos[g]]++;

            
        }
	    
        pw.print(Math.max(gcount[2], Math.max(gcount[0], gcount[1])));
        r.close();
        pw.close();
	    
	}
}
