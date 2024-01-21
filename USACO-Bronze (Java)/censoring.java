import java.io.*;
import java.util.*;

public class censoring {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader("censor.txt"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("censor.out")));

        String word = r.readLine();
        String cen = r.readLine();

        
        for(int i = 0; i<word.length()-cen.length()+2; i++) {
            if(word.substring(i, i+cen.length()).equals(cen)) {
                word = word.substring(0,i) + word.substring(i+cen.length(), word.length());
                i = i+1-cen.length();
            }
        }
        pw.print(word);

        r.close();
        pw.close();
    }
}
