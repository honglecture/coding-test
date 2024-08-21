// https://www.acmicpc.net/problem/25487
// 단순한 문제 (Large)
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
            int n3 = Integer.parseInt(sArray[2]);
            int result = getAnswer(n1, n2, n3);
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }



    private static int getAnswer(int n1, int n2, int n3){
        int result = 0;
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                for (int k = 1; k <= n3; k++) {
                    int result1 = i % j;
                    int result2 = j % k;
                    int result3 = k % i;
                    if(result1 == result2 && result2 == result3){
                        result++;
                    }
                }
            }
        }
        return result;
    }
}
