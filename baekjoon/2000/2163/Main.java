// https://www.acmicpc.net/problem/2156
// 초콜릿 자르기
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int result = 0;
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int min = Integer.min(n1, n2);
        int max = Integer.max(n1, n2);
        result += (min - 1);
        result += (min *  (max - 1));
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}