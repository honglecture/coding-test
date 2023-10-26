// https://www.acmicpc.net/problem/1297
// TV 크기
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
        double a = Integer.parseInt(sArray[0]); // 대각선 길이
        double b = Integer.parseInt(sArray[1]); // 높이 비율
        double c = Integer.parseInt(sArray[2]); // 너비 비율
        double n1 = (a * a);
        double n2 = (n1 / ((b * b) + (c * c)));
        double n3 =  (n2 * (b * b));
        double n4 =  (n2 * (c * c));
        System.out.println((int)Math.sqrt(n3));
        System.out.println((int)Math.sqrt(n4));
        bw.flush();
        bw.close();
    }
}