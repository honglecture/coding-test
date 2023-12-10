// https://www.acmicpc.net/problem/10539
// 수빈이와 수열
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] answerArray = new int[size];
        answerArray[0] = Integer.parseInt(sArray[0]);
        int sum = answerArray[0];
        for (int i = 1; i < sArray.length; i++) {
            int n = Integer.parseInt(sArray[i]);
            int sum1 = n * (i + 1); // 평균 합
            int result = sum1 - sum;
            answerArray[i] = result;
            sum += result;
        }
        for (int i = 0; i < answerArray.length; i++) {
            bw.write(answerArray[i] + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }


    

}