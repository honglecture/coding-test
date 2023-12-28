// https://www.acmicpc.net/problem/5176
// 대회 자리
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int p = Integer.parseInt(sArray[0]);
            int m = Integer.parseInt(sArray[1]);
            boolean[] array = new boolean[m + 1];
            int answer = 0;
            for (int j = 0; j < p; j++) {
                int n = Integer.parseInt(bf.readLine());
                if(!array[n]){
                    array[n] = true;
                } else {
                    answer++;
                }
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
}