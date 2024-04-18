// https://www.acmicpc.net/problem/11680
// Dice Cup
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int max = Integer.max(n1, n2);
        int min = Integer.min(n1, n2);
        int size = max - min + 1;
        for (int i = 1; i <= size; i++) {
            System.out.println(min + i);
        }
        bw.flush();
        bw.close();
    }
}