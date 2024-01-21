import java.io.*;
import java.util.*;

public class triangles {
    public static void main(String[] args) throws IOException {
       BufferedReader r = new BufferedReader(new FileReader("triangles.in"));
       PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("triangles.out")));
       
       StringTokenizer st = new StringTokenizer(r.readLine());
       int n = Integer.parseInt(st.nextToken());
       int[] x = new int[n];
       int[] y = new int[n];
       for(int i =0; i<n; i++) {
        st = new StringTokenizer(r.readLine());
        x[i] = Integer.parseInt(st.nextToken());
        y[i] = Integer.parseInt(st.nextToken());
       }
      ArrayList<Integer> xvals = new ArrayList<Integer>();
      ArrayList<Integer> yvals = new ArrayList<Integer>();
       ArrayList<Integer> areas = new ArrayList<Integer>();
       for(int i = 0; i<n; i++) {
        xvals.clear();
        yvals.clear();
        boolean xt = false;
        boolean yt = false;
        for(int j = 0; j<n; j++) {
            if(j != i) {
                if(x[i] == x[j]) {
                    yvals.add(y[j]);
                    xt = true;
                }
                if(y[i] == y[j]) {
                    xvals.add(x[j]);
                    yt=true;
                }
            }
        }
        for(int k = 0; k<xvals.size(); k++) {
            for(int m = 0; m<yvals.size(); m++) {
                if(xt && yt) {
                int arr = (Math.abs(xvals.get(k) - x[i])) * (Math.abs(yvals.get(m) - y[i]));
                areas.add(arr);
                }
            }
        }
       }
       int max = areas.get(0);
       for(int i =1 ;i<areas.size(); i++) {
            max = Math.max(max, areas.get(i));
            
       }
       pw.print(max);
       r.close();
       pw.close();
    }
}
