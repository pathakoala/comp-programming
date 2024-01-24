import java.io.*;
import java.util.*;

public class tttt {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new FileReader("tttt.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("tttt.out")));

        String[] str = new String[3];
        int onec = 0;
        int twoc = 0;
        Set<Character> h1 = new TreeSet<>();
        Set<Character> h2 = new TreeSet<>();
        Set<Character> h3 = new TreeSet<>();
        Set<Character> v1 = new TreeSet<>();
        Set<Character> v2 = new TreeSet<>();
        Set<Character> v3 = new TreeSet<>();
        Set<Character> d1 = new TreeSet<>();
        Set<Character> d2 = new TreeSet<>();
        
        for(int i = 0; i<3; i++) {
            str[i] = r.readLine();
            for(int j = 0; j<3; j++) {
                if(i == 0) {
                    h1.add(str[i].charAt(j));
                }
                if(i == 1) {
                    h2.add(str[i].charAt(j));
                }
                if(i == 2) {
                    h3.add(str[i].charAt(j));
                }
            }
        }
        for(int i = 0; i <3; i++) {
            for(int j = 0; j<3; j++) {
                if(i == 0) {
                    v1.add(str[j].charAt(i));
                }
                if(i== 1) {
                    v2.add(str[j].charAt(i));
                }
                if(i == 2) {
                    v3.add(str[j].charAt(i));
                }
            }
        }

        for(int i = 0; i<3; i++) {
            d1.add(str[i].charAt(i));
            d2.add(str[2-i].charAt(0));
        }

        ArrayList<String> st = new ArrayList<String>();
        for(int i = 0; i<8; i++) {
            st.add("");
        }
        for(char element: h1) {
            st.set(0, st.get(0) + element);
        }
        for(char element: h2) {
            st.set(1, st.get(1) + element);
        }
        for(char element: h3) {
            st.set(2, st.get(2) + element);
        }
        for(char element: v1) {
            st.set(3, st.get(3) + element);
        }
        for(char element: v2) {
            st.set(4, st.get(4) + element);
        }
        for(char element: v3) {
            st.set(5, st.get(5) + element);
        }
        for(char element: d1) {
            st.set(6, st.get(6) + element);
        }
        for(char element: d2) {
            st.set(7, st.get(7) + element);
        }

        for(int i  = 1; i < 8; i++) {
            for(int j = i-1; j>=0; j--) {
                if(st.get(i).equals(st.get(j))) {
                    st.set(j, "0000");
                }
            }
        }
        for(int i = 0; i<st.size(); i++) {
            if((st.get(i)).length() == 2) {
                twoc++;
            }
            if((st.get(i)).length() == 1) {
                onec++;
            }
        }

        pw.println(onec);
        pw.println(twoc);
        r.close();
        pw.close();
    }
}