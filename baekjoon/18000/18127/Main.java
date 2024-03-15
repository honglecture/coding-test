// https://www.acmicpc.net/problem/18127
// 모형결정
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        long answer = 1;
        long count = n1 - 2;
        long sum = 1;
        for (int i = 0; i < n2; i++) {
            sum += count;
            answer += sum;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
