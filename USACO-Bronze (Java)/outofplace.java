import java.io.*;
import java.util.*;

public class outofplace {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader("outofplace.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("outofplace.out")));

        int n = Integer.parseInt(r.readLine()); 
        int[] places = new int[n];
        for(int i = 0; i<n; i++) {
            places[i] = Integer.parseInt(r.readLine());
        }
        int[] copy = new int[n];
        for(int i = 0; i<n; i++) {
            copy[i] = places[i];
        }
        Arrays.sort(copy);
        int count = 0;
        for(int i = 0; i<n; i++) {
            if(places[i] != copy[i]) {
                count++;
            }
        }
        pw.print(Math.max(0, count-1));

        pw.close();
        r.close();
    }    
}   
