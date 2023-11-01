// https://www.acmicpc.net/problem/2965
// 캥거루 세마리
import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        int n1 = array[0];
        int n2 = array[1];
        int n3 = array[2];
        int result = Integer.max(n2 - n1, n3 - n2) - 1;

        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}