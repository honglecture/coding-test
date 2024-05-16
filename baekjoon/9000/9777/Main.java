// https://www.acmicpc.net/problem/9777
// Birthday Statistics
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[13];
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int result = Integer.parseInt(sArray[1].split("/")[1]);
            array[result]++;
        }
        for (int i = 1; i < array.length; i++) {
            bw.write(i + " " + array[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

}