import java.util.*;
import java.io.*;

public class block {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new FileReader("blocks.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("blocks.out")));
        
        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());

        String[][] boards = new String[n][2];
        int[] counter = new int[26];

        for(int i = 0; i<26; i++ ) {
            counter[i] = 0;
        }

        for(int i = 0; i<n; i++) {
            st = new StringTokenizer(r.readLine());
            for(int j = 0 ; j<2; j++) {
                boards[i][j] = st.nextToken();
                for(int k = 0; k<boards[i][j].length(); k++) {
                    if(boards[i][j].charAt(k) == 'a') {
                        counter[0]++;
                    }
                    if(boards[i][j].charAt(k) == 'b') {
                        counter[1]++;
                    }
                    if(boards[i][j].charAt(k) == 'c') {
                        counter[2]++;
                    }
                    if(boards[i][j].charAt(k) == 'd') {
                        counter[3]++;
                    }
                    if(boards[i][j].charAt(k) == 'e') {
                        counter[4]++;
                    }
                    if(boards[i][j].charAt(k) == 'f') {
                        counter[5]++;
                    }
                    if(boards[i][j].charAt(k) == 'g') {
                        counter[6]++;
                    }
                    if(boards[i][j].charAt(k) == 'h') {
                        counter[7]++;
                    }
                    if(boards[i][j].charAt(k) == 'i') {
                        counter[8]++;
                    }
                    if(boards[i][j].charAt(k) == 'j') {
                        counter[9]++;
                    }
                    if(boards[i][j].charAt(k) == 'k') {
                        counter[10]++;
                    }
                    if(boards[i][j].charAt(k) == 'l') {
                        counter[11]++;
                    }
                    if(boards[i][j].charAt(k) == 'm') {
                        counter[12]++;
                    }
                    if(boards[i][j].charAt(k) == 'n') {
                        counter[13]++;
                    }
                    if(boards[i][j].charAt(k) == 'o') {
                        counter[14]++;
                    }
                    if(boards[i][j].charAt(k) == 'p') {
                        counter[15]++;
                    }
                    if(boards[i][j].charAt(k) == 'q') {
                        counter[16]++;
                    }
                    if(boards[i][j].charAt(k) == 'r') {
                        counter[17]++;
                    }
                    if(boards[i][j].charAt(k) == 's') {
                        counter[18]++;
                    }
                    if(boards[i][j].charAt(k) == 't') {
                        counter[19]++;
                    }
                    if(boards[i][j].charAt(k) == 'u') {
                        counter[20]++;
                    }
                    if(boards[i][j].charAt(k) == 'v') {
                        counter[21]++;
                    }
                    if(boards[i][j].charAt(k) == 'w') {
                        counter[22]++;
                    }
                    if(boards[i][j].charAt(k) == 'x') {
                        counter[23]++;
                    }
                    if(boards[i][j].charAt(k) == 'y') {
                        counter[24]++;
                    }
                    if(boards[i][j].charAt(k) == 'z') {
                        counter[25]++;
                    }
                    
                }
            }
        }



    }
}
