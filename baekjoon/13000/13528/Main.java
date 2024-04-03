// https://www.acmicpc.net/problem/13528
// Grass Seed Inc.
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double answer = 0;
        double n = Double.parseDouble(bf.readLine());
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            double n1 = Double.parseDouble(sArray[0]);
            double n2 = Double.parseDouble(sArray[1]);
            answer += n1 * n2 * n;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}