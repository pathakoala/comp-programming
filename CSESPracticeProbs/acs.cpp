#include <bits/stdc++.h>

using namespace std;


/*
 * Complete the 'decodeMessage' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. STRING text
 *  2. STRING message
 */

string decodeMessage(string text, string message) {
    vector<vector<string>> words;
    int cur = 0;
    vector<string> sen;
    for(int i = 0; i<text.length(); i++) {
        if(text[i] == '.') {
            sen.push_back(text.substr(cur, i-cur+1));
            words.push_back(sen);
            sen.clear();
            cur = i+3;
            i+=2;
        } else if(text[i] == ' ') {
            sen.push_back(text.substr(cur, i-cur+1));
            cur = i+1;
        }
    }
    
    vector<vector<int>> code;
    cur = 0;
    vector<int> coder;
    for(int i = 0;i<message.length(); i++) {
        if(message[i] == '.') {
            string x = message.substr(cur, i-cur);
            coder.push_back(stoi(x));
            cur= i+1;
        } else if(message[i] == ' ') {
            string x = message.substr(cur, i-cur);
            coder.push_back(stoi(x));
            code.push_back(coder);
            coder.clear();
            cur = i+1;
        }
    }
    string x = message.substr(cur, message.length()-cur);
    coder.push_back(stoi(x));
    code.push_back(coder);
    string ans = "";
    for(int i = 0; i<code.size(); i++) {
        if(code[i][1] <= words[code[i][0]].size()) {
            if(code[i][2] <= words[code[i][0]][code[i][1]].length()) {
                ans += words[code[i][0]-1][code[i][1]-1][code[i][2]-1];
            } else {
                ans += " ";
            }
        } else {
            ans += " ";
        }
    }
    for(int i = 0; i<code.size(); i++) {
        for(int j = 0; j<code[i].size(); j++) {
            cout << code[i][j] << " ";
        }
        cout << "\n";
    }
    return "a";

}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string text;
    getline(cin, text);

    string message;
    getline(cin, message);

    string result = decodeMessage(text, message);

    fout << result << "\n";

    fout.close();

    return 0;
}
