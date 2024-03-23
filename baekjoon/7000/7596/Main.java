// https://www.acmicpc.net/problem/7596
// MP3 Songs
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
        int count = 1;
        while (true) {
            int size = Integer.parseInt(bf.readLine());
            if(size == 0){
                break;
            }
            String[] array = new String[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = bf.readLine();
            }
            Arrays.sort(array);
            bw.write(count + "\n");
            for (int i = 0; i < array.length; i++) {
                bw.write(array[i] + "\n");
            }
            count++;
        }
        bw.flush();
        bw.close();
    }
}