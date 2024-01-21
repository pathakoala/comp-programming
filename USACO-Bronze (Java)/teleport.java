import java.io.*;
import java.util.*;

public class teleport {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader("teleport.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter (new FileWriter("teleport.out")));

        StringTokenizer st = new StringTokenizer(r.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
    
        int answer = Math.abs(a-b);
        answer = Math.min(answer, Math.abs(a-x) + Math.abs(b-y));
        answer = Math.min(answer, Math.abs(a-y) + Math.abs(b-x));
        pw.print(answer);
        pw.close();
    }
}
