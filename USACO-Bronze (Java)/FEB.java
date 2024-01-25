import java.io.*;
import java.util.*;

public class FEB {
    static int n;
    static String str;
    static Set<Integer> set = new HashSet<Integer>();
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        n = Integer.parseInt(r.readLine()); 
        str = r.readLine(); 
        char[] arr = new char[n];

        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        int j = 0;
        for(int i = 0; i<n; i++) {
            arr[i] = str.charAt(i);
            if(str.charAt(i) == 'F') {
                map.put(j, i);
                j++;
            }
        }
        excited(0, arr, map);
        pw.println(set.size());
        for(int element: set) {
            pw.println(element);
        }
        pw.close();
        r.close();

    }
    static void excited(int a, char[] arr, Map<Integer, Integer> map) {
        int m = map.size();
        int count = 0;
        if(a >= m) {
            for(int i = 1; i<n; i++) {
                if(arr[i] == arr[i-1]) {
                    count++;
                }
            }
            set.add(count);
        } else {
        arr[map.get(a)] = 'E';
        excited(a+1, arr, map);
        arr[map.get(a)] = 'B';
        excited(a+1, arr, map);
        }
        
        
    }
}
