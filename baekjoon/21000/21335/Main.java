// https://www.acmicpc.net/problem/21335
// Another Eruption
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double n = Double.parseDouble(bf.readLine());
        double result1 = n / Math.PI;
        double result2 = Math.sqrt(result1) * 2 * Math.PI;
        System.out.println(result2);
        // 반지름 반지름 3.14
        // 2 3.14 반지름
        bw.flush();
        bw.close();
    }

}
