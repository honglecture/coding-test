// https://www.acmicpc.net/problem/25426
// 일차함수들
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[][] array = new int[size][2];
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            array[i][0] = Integer.parseInt(sArray[0]);
            array[i][1] = Integer.parseInt(sArray[1]);
        }
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        long answer = 0;
        for (int i = 0; i < array.length; i++) {
            answer += array[i][1];
        }
        for (int i = 0; i < array.length; i++) {
            long index = i + 1;
            long num = array[i][0];
            long result = index * num;
            answer += result;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
