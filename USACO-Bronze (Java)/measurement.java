import java.io.*;
import java.util.*;

public class measurement {
	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new FileReader("measurement.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("measurement.out")));
		
		StringTokenizer st = new StringTokenizer(r.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		int[] days = new int [n];
		String[] pers = new String[n];
		int[] incc = new int[n];
		
		int[] mildred = new int[100];
		int[] elsie  = new int[100];
		int[] bessie = new int[100];
		for(int i = 0; i<100; i++) {
		    mildred[i] = 7;
		    elsie[i] = 7;
		    bessie[i] = 7;
		}
		for(int i = 0; i<n; i++) {
		    st = new StringTokenizer(r.readLine());
		    days[i] = Integer.parseInt(st.nextToken());
		    pers[i] = st.nextToken();
		    
		    String tempstr = st.nextToken();
		    if(tempstr.charAt(0) == '+') {
		        incc[i] = Integer.parseInt(tempstr.substring(1));
		    }
		    if(tempstr.charAt(0) == '-') {
		        incc[i] = 0 - Integer.parseInt(tempstr.substring(1));
		    }
		}
	
		
		for(int i = 0; i<n; i++) {
		    for(int j = i+1; j<n;j++) {
		      if((days[i] > days[j]) && (i != j)) {
		          int temp = days[i];
		          days[i] = days[j];
		          days[j] = temp;
		          
		          String tempr = pers[i];
		          pers[i] = pers[j];
		          pers[j] = tempr;
		          
		          int temprr = incc[i];
		          incc[i] = incc[j];
		          incc[j] = temprr;
		      }  
		    }
		}
		int curbes = 7;
		int curels = 7;
		int curmil = 7;
		for(int i = 0; i<n; i++) {
		    if(pers[i].equals("Bessie")) {
		        curbes += incc[i];
		        for(int j = days[i]-1; j<100; j++) {
		            bessie[j] = curbes;
		        }
		    }
		    if(pers[i].equals("Mildred")) {
		        curmil += incc[i];
		        for(int j = days[i]-1; j<100; j++) {
		            mildred[j] = curmil;
		        }
		    }
		    if(pers[i].equals("Elsie")) {
		        curels += incc[i];
		        for(int j = days[i]-1; j<100; j++) {
		            elsie[j] = curels;
		        }
		    }
		}
		int max = 7;
		int change = 0; 
        String curmax;
        String maxpers = "";
		for(int i = 0; i<100; i++) {
            curmax = maxpers;
            maxpers = "";
		    max = Math.max(mildred[i], Math.max(elsie[i], bessie[i]));
            if(max == mildred[i]) {
                maxpers += "Mildred";
            } 
            if(max == bessie[i]) {
                maxpers += "Bessie";
            }
            if(max == elsie[i]) {
                maxpers += "Elsie";
            }

            
            if(!maxpers.equals(curmax)) {
                change++;
            }
            if(i==0 && maxpers.equals("MildredBessieElsie")) {
                change =0;
            }
        }
        pw.print(change);
		r.close();
		pw.close();
	}
}


