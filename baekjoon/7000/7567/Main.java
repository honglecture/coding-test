// https://www.acmicpc.net/problem/7567
// 그릇
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int sum = 10;
        for (int i = 1; i < str.length(); i++) {
            char c1 = str.charAt(i - 1);
            char c2 = str.charAt(i);
            if(c1 == c2){
                sum += 5;
            } else {
                sum += 10;
            }
        }
        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }
    
}