// https://www.acmicpc.net/problem/5236
// Longest Decreasing Suffix
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
            String answer = "";
            int currentNum = str.charAt(str.length() - 1);
            answer += String.valueOf(str.charAt(str.length() - 1));
            for (int j = str.length() - 2; j >= 0; j--) {
                int n = str.charAt(j);
                if(currentNum >= n){
                    break;
                }
                answer = String.valueOf(str.charAt(j)) + answer;
                currentNum = n;
            }
            bw.write("The longest decreasing suffix of abcdbca is "+answer +"\n");
        }
        bw.flush();
        bw.close();
    }
}