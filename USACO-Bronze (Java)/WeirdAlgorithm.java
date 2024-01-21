import java.io.*;

    public class WeirdAlgorithm {
    public static void main(String[] args) throws IOException {
       
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

            long n = Long.parseLong(r.readLine());
            
            while(n != 1) {
                pw.print(n + " ");
                if(n % 2 == 0) {
                    n = n/2;
                } else {
                    n = n*3 + 1;
                }
                
            }
                pw.print(1);
                pw.close();
    }
}
