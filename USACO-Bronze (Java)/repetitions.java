import java.util.*;
import java.io.*;

public class repetitions {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(r.readLine());
        String str = st.nextToken();
        int i = 0;
        int count =0;
        while(str.charAt(i) == str.charAt(i+1)) {
            count++;
            i++;
        }
        pw.print(count);
        pw.close();
    } 
}
