// https://www.acmicpc.net/problem/2822
// 점수 계산
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] array = new int[8][2];
        for (int i = 0; i < array.length; i++) {
            array[i][0] = Integer.parseInt(bf.readLine());
            array[i][1] = i + 1;
        }
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });
        int[] answerArray = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += array[i][0];
            answerArray[i] = array[i][1];
        }
        Arrays.sort(answerArray);
        bw.write(sum + "\n");
        for (int i = 0; i < answerArray.length; i++) {
            bw.write(answerArray[i] + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}