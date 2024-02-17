import java.io.*;
import java.util.*;

public class divisibilityby2n {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        StringTokenizer st = new StringTokenizer(r.readLine());
        int t = Integer.parseInt(st.nextToken());

        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.clear();
        for(int i = 0; i<t; i++) {

        }

        r.close();
        pw.close();
    }
    static int divis(int n, int ncount) {
        if(n %2 == 0) {
            n = n/2;
            ncount++;
            return divis(n, ncount);
        } else {
            return ncount;
        }
    }
    static int prod(int n, int index) {
        if(n >= Math.pow(2, index) && n < Math.pow(2, index+1)) {
            return index;
        } else {
            index++;
            return prod(n, index);
        }
    }
    static int total(int n) {
        int index = prod(n, 0);
        int total = 0;
        for(int i = 1; i<=index; i++) {
            if(n % Math.pow(2, i) == 0) {
                total += 1;
            }
        }
        return total;
    }
}