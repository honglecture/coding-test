// https://www.acmicpc.net/problem/24420
// ピアノコンクール (Piano Competition)
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 0;
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        for (int i = 1; i < array.length - 1; i++) {
            answer += array[i];
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

}
