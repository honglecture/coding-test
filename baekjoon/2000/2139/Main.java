// https://www.acmicpc.net/problem/2139
// 나는 너가 살아온 날을 알고 있다
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] array2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        while (true) {
            String[] sArray = bf.readLine().split(" ");
            int d = Integer.parseInt(sArray[0]);
            int m = Integer.parseInt(sArray[1]);
            int year = Integer.parseInt(sArray[2]);
            if(d == 0 && m == 0 && year == 0){
                break;
            }
            int sum = 0;
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                for (int i = 0; i < m - 1; i++) {
                    sum += array2[i];
                }
                sum += d;
            } else {
                for (int i = 0; i < m - 1; i++) {
                    sum += array1[i];
                }
                sum += d;
            }
            bw.write(sum + "\n");
            
        }
        bw.flush();
        bw.close();
    }
}
