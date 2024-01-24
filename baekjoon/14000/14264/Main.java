// https://www.acmicpc.net/problem/14264
// 정육각형과 삼각형
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double n = Double.parseDouble(bf.readLine());
        double n1 = n / 2;
        double n2 = (n * Math.sqrt(3)) / 2;
        System.out.println((n1 * n2 / 2) * 2);
        bw.flush();
        bw.close();
    }


}