// https://www.acmicpc.net/problem/3059
// 등장하지 않는 문자의 합
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            boolean[] visitArray = new boolean[26];
            int answer = 0;
            for (int j = 0; j < str.length(); j++) {
                int c = str.charAt(j) - 65;
                visitArray[c] = true;
            }
            for (int j = 0; j < visitArray.length; j++) {
                if(!visitArray[j]){
                    answer += j + 65;
                }
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
}