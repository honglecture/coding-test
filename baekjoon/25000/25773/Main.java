// https://www.acmicpc.net/problem/25773
// Number Maximization
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split("");
        int[] array = new int[sArray.length];
        String answer = "";
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        for (int i = array.length - 1; i >= 0; i--) {
            answer += array[i];
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
