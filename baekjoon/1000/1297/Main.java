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
        double a = Integer.parseInt(sArray[0]);
        double b = Integer.parseInt(sArray[1]);
        double c = Integer.parseInt(sArray[2]);
        int n1 = (int)(a * a);
        int n2 = (int)(n1 / (b + c));
        int n3 = (int) (n2 * b);
        int n4 = (int) (n2 * c);
        System.out.println((int)Math.sqrt(n3));
        System.out.println((int)Math.sqrt(n4));
        // 49 9 25
        bw.flush();
        bw.close();
    }
}