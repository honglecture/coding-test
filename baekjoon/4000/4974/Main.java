// https://www.acmicpc.net/problem/4974
// ICPC Score Totalizer Software
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
        while (true) {
            int size = Integer.parseInt(bf.readLine());
            if(size == 0){
                break;
            }
            int[] array = new int[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(bf.readLine());
            }
            Arrays.sort(array);
            int sum = 0;
            for (int i = 1; i < array.length - 1; i++) {
                sum += array[i];
            }
            bw.write((sum / (size - 2)) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
