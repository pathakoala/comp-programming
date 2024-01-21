import java.io.*;
import java.util.*;

public class shell 
{
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new FileReader("shell.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("shell.out")));
		
		StringTokenizer st = new StringTokenizer(r.readLine());
	    int n = Integer.parseInt(st.nextToken());
	    int[][] move = new int[n][3];
	    for(int i = 0; i<n; i++) {
            st = new StringTokenizer(r.readLine());
	        for(int j = 0; j<3; j++) {
	            move[i][j] = Integer.parseInt(st.nextToken());
	        }
	    }

        int[] spos = new int[3];
        spos[0] = 0;
        spos[1] = 0;
        spos[2] = 0;

        int[] gcount = new int[3];
	    for(int i = 0; i<3; i++) {
	        spos[i] = 1;
             for(int j = 0; j<n; j++) {
                int t = spos[move[j][0]-1];
                spos[move[j][0]-1] = spos[move[j][1]];
                spos[move[j][1]] = t;
                if(spos[move[j][2]-1] == 1) {
                    gcount[i] ++;
                }
             }
            spos[0] = 0;
            spos[1] = 0;
            spos[2] = 0;
	    }
        pw.print(Math.max(gcount[2], Math.max(gcount[0], gcount[1])));
        r.close();
        pw.close();
	    
	}
}