// https://www.acmicpc.net/problem/20352
// Circus
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double n = Double.parseDouble(bf.readLine()) / Math.PI;
        double n1 = Math.sqrt(n);
        double n2 = n1 * 2 * Math.PI;
        System.out.println(n2);
        bw.flush();
        bw.close();
    }

}
