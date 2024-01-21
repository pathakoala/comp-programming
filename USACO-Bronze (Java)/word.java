import java.io.*;
import java.util.*;

public class word {
	public static void main(String[] args) throws IOException {
	
	BufferedReader r = new BufferedReader(new FileReader("word.in"));
	PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("word.out")));
	
	StringTokenizer st = new StringTokenizer(r.readLine());
	int n = Integer.parseInt(st.nextToken());
	int k = Integer.parseInt(st.nextToken());
	
	st = new StringTokenizer(r.readLine());
	
    String[] list = new String[n];
    
    for(int i = 0; i<n; i++) {
        list[i] = st.nextToken();
    }
	String totaler = "";
	int words = 0;
	int i = 0;
    int lcount;
	while(words<n) {
	    totaler = "";
        lcount = 0;
	    while (i<=n-1 && totaler.length() + list[i].length() <= k) {
            totaler = totaler+list[i];
            if(lcount ==0) {pw.print(list[i]);} else {pw.print(" " + list[i]);}
            words++;
            i++; 
            lcount++;
	    }
	    pw.println();
	}
        r.close();
		pw.close();
}
}
