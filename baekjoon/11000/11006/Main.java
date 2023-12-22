// https://www.acmicpc.net/problem/11006
// 남욱이의 닭장
import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int answer1 = (n2 * 2) - n1;
            int answer2 = n2 - answer1;
            bw.write(answer1 + " " + answer2 + "\n");
        }
        bw.flush();
        bw.close();
    }
}