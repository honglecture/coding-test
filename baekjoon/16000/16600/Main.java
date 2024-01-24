// https://www.acmicpc.net/problem/16600
// Contemporary Art
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double n = Double.parseDouble(bf.readLine());
        double result1 = Math.sqrt(n);
        double result2 = result1 * 4;
        System.out.println(result2);
        bw.flush();
        bw.close();
    }

    


}
