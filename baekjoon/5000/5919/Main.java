// https://www.acmicpc.net/problem/5919
// Hay Bales
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
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        int sum = 0;
        int answer = 0;
        int avg;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
            sum += array[i];
        }
        avg = sum / size;
        Arrays.sort(array);
        for (int i = array.length - 1; i >= 0; i--) {
            if(array[i] > avg){
                answer += array[i] - avg;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}