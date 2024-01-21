import java.io.*;
import java.util.*;

public class cownditioning {
    
    public static void main(String[] args) throws IOException {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
     
    StringTokenizer st = new StringTokenizer(r.readLine());
     
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int[] cowin = new int[n];
    int[] cowfin = new int[n];
    int[] cowtemp = new int[n];
    int[] airin = new int[m];
    int[] airfin = new int[m];
    int[] airtemp = new int[m];
    int[] airprice = new int[m];
    int max;
    
    
    st = new StringTokenizer(r.readLine());
        cowin[0] = Integer.parseInt(st.nextToken());
        cowfin[0] = Integer.parseInt(st.nextToken());
        cowtemp[0] = Integer.parseInt(st.nextToken());
    max = cowfin[0];
    for(int i =1; i<n; i++) {
        st = new StringTokenizer(r.readLine());
        cowin[i] = Integer.parseInt(st.nextToken());
        cowfin[i] = Integer.parseInt(st.nextToken());
        cowtemp[i] = Integer.parseInt(st.nextToken());
        max = Math.max(max, cowfin[i]);
    }
    for(int i = 0; i<m; i++) {
        st = new StringTokenizer(r.readLine());
        airin[i] = Integer.parseInt(st.nextToken());
        airfin[i] = Integer.parseInt(st.nextToken());
        airtemp[i] = Integer.parseInt(st.nextToken());
        airprice[i] = Integer.parseInt(st.nextToken());
        
    }
    int[] temps = new int[max+1];
    
    for(int i = 0; i<n;i++) {
        for(int j = cowin[i]; j<=cowfin[i];j++) {
            temps[j]  = Math.max(cowtemp[i], temps[j]);
            pw.println(temps[j]);
        }
    }
    ArrayList<Integer> a = new ArrayList<Integer>();
    pw.print(minpos(0, a, temps, max, airprice, m, airtemp, airin, airfin));
    r.close();
    pw.close();
    }
    static int minpos(int q, ArrayList<Integer> a, int[] temps, int max, int[] airprice, int m, int[] airtemp, int[] airin, int[] airfin) {
        int[] temp = temps;
        if(q == m) {
            boolean f = true;
            for(int j = 0; j<a.size(); j++) {
            for(int i = airin[a.get(j)]; i<=airfin[a.get(j)]; i++) {
                temp[i]  = Math.min(temp[i], temps[i] - airtemp[a.get(j)]);
            }
        }
            for(int i = 0; i<=max; i++) {
                if(temp[i] >0) {
                    f = false;
                }
            }
            if(f) {
                int sum = 0;
                for(int i = 0; i<a.size(); i++) {
                    sum += airprice[a.get(i)];
                }
                
                return sum;
            } else {
                return Integer.MAX_VALUE;
            }
        } else {
       
        int x = minpos(q+1, a, temps,  max,  airprice,  m,  airtemp, airin, airfin);
        a.add(q);
        int y = minpos(q+1, a, temps,  max,  airprice,  m,  airtemp, airin, airfin);
        a.remove(a.size()-1);
        return Math.min(x,y);
        }
    }
}
