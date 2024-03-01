// https://www.acmicpc.net/problem/20215
// Cutting Corners
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int max = Integer.max(n1, n2);
        int min = Integer.min(n1, n2);
        double result1 = max + min;
        double result2 = Math.sqrt((n1 * n1) + (n2 * n2));
        System.out.println(result1 - result2);

        bw.flush();
        bw.close();
    }

}
