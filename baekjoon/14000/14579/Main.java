// https://www.acmicpc.net/problem/14579
// 덧셈과 곱셈
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int a = Integer.parseInt(sArray[0]);
        int b = Integer.parseInt(sArray[1]);
        int sum = 0;
        int answer = 1;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        answer = sum;
        for (int i = a + 1; i <= b; i++) {
            sum = sum + i;
            answer = (sum * answer) % 14579;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }


    


}