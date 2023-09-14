// https://www.acmicpc.net/problem/2693
// N번째 큰 수
import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int[] array = new int[sArray.length];
            for (int j = 0; j < sArray.length; j++) {
                array[j] = Integer.parseInt(sArray[j]);
            }
            Arrays.sort(array);
            bw.write(array[array.length - 3] + "\n");
            
        }
        bw.flush();
        bw.close();
    }

}