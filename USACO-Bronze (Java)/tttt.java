import java.io.*;
import java.util.*;

public class tttt {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new FileReader("tttt.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("tttt.out")));

        String[] str = new String[3];
        char[][] ttt = new char[3][3];

        for(int i = 0; i<3; i++) {
            str[i] = r.readLine();
            for(int j = 0; j<3; j++) {
                ttt[i][j] = str[i].charAt(j);
            }
        }

        int onec = 0;
        int twoc = 0;

        for(int i = 0; i<3; i++) {
            if(ttt[i][0] == ttt[i][1] && ttt[i][1] == ttt[i][2]) {
                onec++;
            }
            if(ttt[0][i] == ttt[1][i] && ttt[1][i] == ttt[2][i]) {
                onec++;
            }
            if(ttt[i][0] == ttt[i][1] && ttt[i][1] != ttt[i][2]) {
                twoc++;
            }
            if(ttt[i][1] == ttt[i][2] && ttt[i][1] != ttt[i][0]){
                twoc++;
            }
            if(ttt[i][0] == ttt[i][2] && ttt[i][0] != ttt[i][1]) {
                twoc++;
            }
            if(ttt[0][i] == ttt[1][i] && ttt[1][i] != ttt[2][i]) {
                twoc++;
            }
            if(ttt[1][i] == ttt[2][i] && ttt[1][i] != ttt[0][i]){
                twoc++;
            }
            if(ttt[0][i] == ttt[2][i] && ttt[0][i] != ttt[1][i]) {
                twoc++;
            }
        }

        if(ttt[0][0] == ttt[1][1] && ttt[1][1] == ttt[2][2]) {
            onec++;
        }
        if(ttt[2][0] == ttt[1][1] && ttt[1][1] == ttt[0][2]) {
            onec++;
        }
        if(ttt[0][0] == ttt[1][1] && ttt[1][1] != ttt[2][2]) {
                twoc++;
            }
        if (ttt[0][0] == ttt[2][2] && ttt[2][2] != ttt[1][1]) {
            twoc++;
        }
        if(ttt[1][1] == ttt[2][2] && ttt[1][1] != ttt[0][0]) {
            twoc++;
        }
        if(ttt[2][0] == ttt[1][1] && ttt[1][1] != ttt[0][2]){
            twoc++;
            }
        if(ttt[2][0] == ttt[0][2] && ttt[0][2] != ttt[1][1]) {
            twoc++;
        }
        if(ttt[1][1] == ttt[0][2] && ttt[0][2] != ttt[2][0]) {
            twoc++;
        }

        pw.println(onec);
        pw.println(twoc);
        r.close();
        pw.close();
    }
}