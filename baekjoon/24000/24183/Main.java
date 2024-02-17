// https://www.acmicpc.net/problem/24183
// Affischutskicket
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        double d1 = ((0.229 * 0.324) * 2) * n1;
        double d2 = ((0.297 * 0.420) * 2) * n2;
        double d3 = ((0.210 * 0.297)) * n3;
        double result = d1 + d2 + d3;
        System.out.println(result);
        bw.flush();
        bw.close();
    }

}
