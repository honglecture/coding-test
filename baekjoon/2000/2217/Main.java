// https://www.acmicpc.net/problem/2217
// 로프
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
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(array);
        int answer = 0;
        int count = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            count += 1;
            int result = count * array[i];
            if(answer < result){
                answer = result;
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}