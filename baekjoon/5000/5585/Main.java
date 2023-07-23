// https://www.acmicpc.net/problem/5585
// 거스름돈
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = 1000 - Integer.parseInt(bf.readLine());
        int[] array = {500, 100, 50, 10, 5, 1};
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if(n / array[i] > 0){
                result += n / array[i];
                n -= (n / array[i]) * array[i];
            }
            if(n == 0){
                break;
            }
        }
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}