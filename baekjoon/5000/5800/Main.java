// https://www.acmicpc.net/problem/5800
// 성적 통계
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
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int[] array = new int[sArray.length - 1];
            for (int j = 0; j < array.length; j++) {
                array[j] = Integer.parseInt(sArray[j + 1]);
            }
            Arrays.sort(array);
            int gap = 0;
            for (int j = array.length - 1; j >= 1; j--) {
                gap = Integer.max(gap, Math.abs(array[j] - array[j - 1]));
            }
            int max = array[array.length - 1];
            int min = array[0];
            bw.write("Class "+(i + 1)+"\n");
            bw.write("Max "+max+", Min "+min+", Largest gap "+gap+"\n");
        }
        bw.flush();
        bw.close();
    }
}