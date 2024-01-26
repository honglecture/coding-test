// https://www.acmicpc.net/problem/13416
// 주식 투자
import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            int size = Integer.parseInt(bf.readLine());
            int sum = 0;
            for (int j = 0; j < size; j++) {
                String[] sArray = bf.readLine().split(" ");
                int n1 = Integer.parseInt(sArray[0]);
                int n2 = Integer.parseInt(sArray[1]);
                int n3 = Integer.parseInt(sArray[2]);
                int[] array = {n1, n2, n3};
                Arrays.sort(array);
                if(array[2] > 0){
                    sum += array[2];
                }
            }
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
    }
}