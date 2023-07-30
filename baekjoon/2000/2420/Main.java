// https://www.acmicpc.net/problem/2420
// 사파리월드
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
        long n1 = Long.parseLong(sArray[0]);
        long n2 = Long.parseLong(sArray[1]);
        long result = Math.abs(n1 - n2);
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}