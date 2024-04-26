// https://www.acmicpc.net/problem/13229
// Selection Sum
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bf.readLine();
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[sArray.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        int[] sumArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            sumArray[i + 1] = sumArray[i] + array[i];
        }
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int start = Integer.parseInt(sArray[0]);
            int end = Integer.parseInt(sArray[1]);
            int result = sumArray[end + 1] - sumArray[start];
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
    
}