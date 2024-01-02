// https://www.acmicpc.net/problem/5054
// 주차의 신
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            int size = Integer.parseInt(bf.readLine());
            String[] sArray = bf.readLine().split(" ");
            int[] array = new int[size];
            for (int j = 0; j < size; j++) {
                array[j] = Integer.parseInt(sArray[j]);
            }
            int answer = 0;
            Arrays.sort(array);
            for (int j = 1; j < array.length; j++) {
                int n1 = array[j - 1];
                int n2 = array[j];
                answer += n2 - n1;
            }
            answer *= 2;
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
}