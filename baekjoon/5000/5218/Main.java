// https://www.acmicpc.net/problem/5218
// 알파벳 거리
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
            String answer = "Distances: ";
            String[] sArray = bf.readLine().split(" ");
            String str1 = sArray[0];
            String str2 = sArray[1];
            for (int j = 0; j < str1.length(); j++) {
                int c1 = str1.charAt(j);
                int c2 = str2.charAt(j);
                int result = c2 - c1;
                if(result < 0){
                    answer += (26 + result) + " ";
                } else {
                    answer += result + " ";
                }
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
}