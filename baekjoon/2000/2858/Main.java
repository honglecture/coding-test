// https://www.acmicpc.net/problem/2858
// 기숙사 바닥
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = n1 + n2;
        int answer1 = 0;
        int answer2 = 0;
        for (int i = n3 - 1; i >= 1; i--) {
            if(n3 % i == 0){
                int result1 = i - 2;
                int result2 = n3 / i - 2;
                if(result1 * result2 == n2){
                    answer1 = i;
                    answer2 = n3 /i;
                    break;
                }
            }
        }
        System.out.println(answer1 + " " + answer2);
        bw.flush();
        bw.close();
    }
}