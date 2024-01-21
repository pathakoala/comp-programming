import java.io.*;
import java.util.*;

public class mixmilk {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader("mixmilk.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("mixmilk.out")));

        int[] limit = new int[3];
        int[] ibucket = new int[3];

        for(int i = 0; i<3; i++) {
        StringTokenizer st = new StringTokenizer(r.readLine());
        limit[i] = Integer.parseInt(st.nextToken());
        ibucket[i] = Integer.parseInt(st.nextToken());
        }
    

        for(int i = 0; i<100;i++) {
                if(i%3==0 || i%3==1) {
                    ibucket[(i+1)%3] += ibucket[i%3];
                    ibucket[i%3] = 0;
                    if(ibucket[(i+1)%3]>limit[(i+1)%3]) {
                        ibucket[i%3] = ibucket[(i+1)%3] - limit[(i+1)%3];
                        ibucket[(i+1)%3] = limit[(i+1)%3];
                    }
                 
                }
                if(i%3==2) {
                    ibucket[0] += ibucket[2];
                    ibucket[2] = 0;
                    if(ibucket[0]>limit[0]) {
                        ibucket[2] = ibucket[0] - limit[0];
                        ibucket[0]  = limit[0];
                    }
                   
                }
            }
        
        for(int i = 0; i<3; i++) {
            pw.println(ibucket[i]);
        }
        r.close();
        pw.close();
    }  
}
