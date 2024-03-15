// https://www.acmicpc.net/problem/11522
// Sum Kind of Problem
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int sum1 = 0;
            int sum2 = 1;
            int sum3 = 2;
            for (int j = 1; j <= n2; j++) {
                sum1 += j;
            }
            for (int j = 1; j <= n2 - 1; j++) {
                sum2 += (2 * j) + 1;
            }
            for (int j = 1; j <= n2 - 1; j++) {
                sum3 += (2 * j) + 2;
            }
            bw.write(n1 + " " + sum1 + " " + sum2 + " " + sum3 + "\n");
        }
        bw.flush();
        bw.close();
    }


    
}