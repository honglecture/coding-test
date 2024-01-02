// https://www.acmicpc.net/problem/3062
// 수 뒤집기
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
            String str1 = bf.readLine();
            String str2 = new StringBuilder(str1).reverse().toString();
            String result1 = (Integer.parseInt(str1) + Integer.parseInt(str2)) + "";
            String result2 = new StringBuilder(result1).reverse().toString();
            if(result1.equals(result2)){
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }

        }
        bw.flush();
        bw.close();
    }
}