// https://www.acmicpc.net/problem/21146
// Rating Problems
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        double sum = 0;
        double maxSum = 0;
        double minSum = 0;
        for (int i = 0; i < n2; i++) {
            sum += Integer.parseInt(bf.readLine());
        }
        maxSum += sum;
        minSum += sum;
        for (int i = 0; i < n1 - n2; i++) {
            maxSum += 3;
            minSum += -3;
        }
        double result1 = maxSum / (double) n1;
        double result2 = minSum / (double) n1;
        System.out.println(result2 + " " + result1);
        bw.flush();
        bw.close();
    }

}
