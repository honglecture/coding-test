// https://www.acmicpc.net/problem/1259
// 팰린드롬수
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            int n = Integer.parseInt(bf.readLine());
            if(n == 0){
                break;
            }
            String str = String.valueOf(n);
            boolean flag = true;;
            for (int i = 0; i < str.length() / 2; i++) {
                char c1 = str.charAt(i);
                char c2 = str.charAt(str.length() - i - 1);
                if(c1 != c2){
                    flag = false;
                    break;
                }
            }
            if(flag){
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
        }
        bw.flush();
        bw.close();
    }
}