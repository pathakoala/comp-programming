import java.util.*;
import java.io.*;

public class block {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        StringTokenizer st = new StringTokenizer(r.readLine());
        String str = st.nextToken();

        System.out.println((int)str.charAt(0));

    }
}
