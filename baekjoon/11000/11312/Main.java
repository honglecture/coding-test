// https://www.acmicpc.net/problem/11312
// 삼각 무늬 - 2
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
            int result = n1 / n2;
            long sum = 0;
            for (int j = 1; j <= result; j++) {
                sum += j + j - 1;
            }
            bw.write(sum + "\n");
         }
        bw.flush();
        bw.close();
    }
}
// 5 + 4 , 2 + 3, 1 + 2, 0 + 1