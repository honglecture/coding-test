// https://www.acmicpc.net/problem/10203
// Count Vowels
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String s = bf.readLine();
            int answer = 0;
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    answer++;
                }
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
}


