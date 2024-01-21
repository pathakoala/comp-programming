import java.io.*;
import java.util.*;

public class balancing {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader("balancing.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("balancing.out")));

        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] ogxvals = new int[n];
        int[] xvals = new int[n];
        int[] yvals = new int[n];
        int[] ogyvals = new int[n];
        for(int i =0; i<2; i++) {
            st = new StringTokenizer(r.readLine());
            ogxvals[i] = Integer.parseInt(st.nextToken());
            xvals[i] = ogxvals[i];
            ogyvals[i] = Integer.parseInt(st.nextToken());
            yvals[i] = ogyvals[i];
        }
        Arrays.sort(xvals);
        Arrays.sort(yvals);
        int lwr = n/2;
        int x;
        int y;
        if(n%2 == 1) {
            x = xvals[lwr];
            y = yvals[lwr];
        }
        else {
            if(xvals[lwr] != xvals[lwr-1]) {
                x = (xvals[lwr] + xvals[lwr-1])/2;
              
            } else {
                x = xvals[lwr]-1;
            }
            if(yvals[lwr] != yvals[lwr-1]) {
                y = (yvals[lwr] + yvals[lwr-1])/2;
               
            } else {
                y = yvals[lwr]-1;
            }
        }
        int[] arr = new int[4];
        for(int i = 0; i<4; i++) {
            arr[i] = 0;
        }
        for(int i = 0; i<n; i++) {
            if(ogxvals[i] > x && ogyvals[i]>y) {
                arr[0] ++;
            }
            if(ogxvals[i] > x && ogyvals[i]<y) {
                arr[1] ++;
            }
            if(ogxvals[i] < x && ogyvals[i]>y) {
                arr[2] ++;
            }
            if(ogxvals[i] < x && ogyvals[i]<y) {
                arr[3] ++;
            }
        }
        int max = arr[0];
        for(int i = 1; i<4; i++) {
            pw.println(arr[i]);
            max = Math.max(max, arr[i]);
        }
        pw.print(max);
        r.close();
        pw.close();
    }
}
