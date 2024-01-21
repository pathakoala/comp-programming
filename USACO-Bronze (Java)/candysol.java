import java.io.*;
import java.util.*;
public class candysol {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int q = Integer.parseInt(st.nextToken());
    long[] h = new long[n];
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < n; i++) {
      h[i] = Long.parseLong(st.nextToken());
    }
    st = new StringTokenizer(br.readLine());
    while(q-- > 0) {
      long curr = Long.parseLong(st.nextToken());
      long taken = 0;
      for(int i = 0; i < n && taken < curr; i++) {
        long inc = Math.min(curr, h[i]) - taken;
        if(inc > 0) {
          h[i] += inc;
          taken += inc;
        }
      }
    }
    for(int i = 0; i < n; i++) pw.println(h[i]);
    pw.close();  
  }
}