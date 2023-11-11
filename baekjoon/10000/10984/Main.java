// https://www.acmicpc.net/problem/10984
// 내 학점을 구해줘
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            int size = Integer.parseInt(bf.readLine());
            int sum1 = 0;
            double sum2 = 0.0;
            for (int j = 0; j < size; j++) {
                String[] sArray = bf.readLine().split(" ");
                int n1 = Integer.parseInt(sArray[0]);
                double n2 = Double.parseDouble(sArray[1]);
                sum1 += n1;
                sum2 += (double) n1 * n2;
            }
            double result = sum2 / (double) sum1;
            bw.write(sum1 + " " + Math.round(result*10)/10.0 + "\n");
        }
        bw.flush();
        bw.close();
    }

}