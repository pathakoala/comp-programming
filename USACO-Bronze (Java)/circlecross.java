import java.io.*;

public class circlecross {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new FileReader("circlecross.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("circlecross.out")));

        String cows = r.readLine();
        int pair = 0;
        
        for(int i =0; i<52; i++) {
            for(int j = i+1; j<52; j++) {
                if(cows.charAt(i) == cows.charAt(j)) {
                    int co = 0;
                    for(int k = i+1; k<j; k++) {
                        for(int m = k+1; m<j; m++) {
                            if(cows.charAt(k) == cows.charAt(m)) {
                                co++;
                            }
                        }
                    }
                    pair += j-i-1 - (2*co);
                }
            }
        }
        
        pw.print(pair/2);

        r.close();
        pw.close();
    }
}
