// https://www.acmicpc.net/problem/18409
// 母音を数える (Counting Vowels)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
