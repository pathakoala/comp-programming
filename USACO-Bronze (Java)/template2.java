//For CodeForces, CSES, and other contests that use standard input and output, here is a nicer template, which essentially functions as a faster Scanner:

// Here's a brief description of the methods in our InputReader class, with an instance r, and PrintWriter with an instance pw.
//    Method                      Description
// r.next()             Reads the next token(up to a whitespace) and returns a String
// r.nextInt()        Reads the next token (up to a whitespace) and returns as an int
// r.nextLong()      Reads the next token (up to a whitespace) and returns as a long
// r.nextDouble()   Reads the next tokeen (up to a whitespace) and returns as a double
// pw.println()     Prints the argument to designated output stream and adds new line
// pw.print()            Prints the argument to designated output stream

import java.io.*;
import java.util.*;

public class template2 {
    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        String next() { //this reads in the next String
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        public int nextInt() { // reads in the next int
            return Integer.parseInt(next());
        }
        public long nextLong() {// reads in the next Long
            return Long.parseLong(next());
        }
        public double nextDouble() {//reads in the next double
            return Double.parseDouble(next());
        }
    }

    static InputReader r = new InputReader(System.in);
    static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) {
        //YOUR CODE HERE

        pw.close();
    }
}
