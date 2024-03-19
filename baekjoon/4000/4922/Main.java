// https://www.acmicpc.net/problem/4922
// Walk Like an Egyptian
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array = new int[1000];
        array[1] = 1;
        int count = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + (count * 2);
            count++;
        }
        while (true) {
            int n = Integer.parseInt(bf.readLine());
            if(n == 0){
                break;
            }
            bw.write(n + " => " + array[n] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
