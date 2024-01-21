import java.io.*;
import java.util.*;

public class creatingstrings {
	static String s;
	static List<String> perms = new ArrayList<String>();
	static int[] charCount = new int[26];

	static void search(String curr) {
		if (curr.length() == s.length()) {
			perms.add(curr);
			return;
		}
		for (int i = 0; i < 26; i++) {
			if (charCount[i] > 0) {
				charCount[i]--;
				search(curr + (char)(i + 'a'));
				charCount[i]++;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		s = r.readLine();

		for (int i = 0; i < s.length(); i++) { charCount[s.charAt(i) - 'a']++; }

		search("");

		pw.println(perms.size());
		for (String perm : perms) { pw.println(perm); }
		pw.close();
	}
}


