import java.io.*;
import java.util.*;

public class photoshoot {
    static int icount;
    static int n;
    static Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    public static void main(String[] args) throws IOException {
        BufferedReader r  = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        n = Integer.parseInt(r.readLine());
        String str = r.readLine();
        
        r.close();
        pw.close();
    }
}