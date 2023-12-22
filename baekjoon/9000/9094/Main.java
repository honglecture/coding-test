// https://www.acmicpc.net/problem/9094
// 수학적 호기심
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n = Integer.parseInt(sArray[0]);
            int m = Integer.parseInt(sArray[1]);
            int count = 0;
            for (int j = 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int n1 = j;
                    int n2 = k;
                    int result1 = (n1 * n1) + (n2 * n2) + m;
                    int result2 = n1 * n2;
                    if(result1 % result2 == 0){
                        count++;
                    }
                }
            }
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
    }
}