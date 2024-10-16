// https://www.acmicpc.net/problem/23278
// 영화 평가
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int n1 = Integer.parseInt(sArray[1]);
        int n2 = Integer.parseInt(sArray[2]);
        sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        double sum = 0;
        double count = 0;
        for (int i = n1; i < array.length - n2; i++) {
            sum += array[i];
            count++;
        }
        double answer = sum / count;
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}
