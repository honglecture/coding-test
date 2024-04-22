// https://www.acmicpc.net/problem/26500
// Absolutely
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            double n1 = Double.parseDouble(sArray[0]);
            double n2 = Double.parseDouble(sArray[1]);
            double result = Math.abs(n1 - n2);
            String answer = String.format("%.1f", result);
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

}
