// https://www.acmicpc.net/problem/25858
// Divide the Cash
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int m = Integer.parseInt(sArray[1]);
        int sum = 0;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(bf.readLine());
            sum += array[i];
        }
        int result = m / sum;
        for (int i = 0; i < array.length; i++) {
            int answer = array[i] * result;
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

}
