import java.io.*;
import java.util.*;

//There are many important functions that are used in reaeding input and printing output
//  Methods                      Description
// r.readLine()              Reads the next line of the input
// st.nextToken()        Reads the next token (up to a whitespace) and returns as a 'String'
// Integer.parseInt   Converts the 'String' returneeed by the 'StringTokenizer' to an 'int'
//Double.parseDouble   Same thing as with Integer.parseInt but with double
//Long.parseLong         Same thins as with Integer.parseInt but with long
// pw.println()          Prints the argument to designated output stream and adds new line
// pw.print()                    Prints the argument to deesignated output stream

 //in this template; replace the USACO file with the word "template"

public class template {
    public static void main(String[] args) throws IOException {
       
        BufferedReader r = new BufferedReader(new
            FileReader("template.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter (new
            FileWriter("template.out")));

            StringTokenizer st = new StringTokenizer(r.readLine());
            int n = Integer.parseInt(st.nextToken());
            //MUST REDEFINE StringTokenizer for different Data Types
            r.close();
                pw.close();
    }
}
