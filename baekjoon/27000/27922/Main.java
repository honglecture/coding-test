// https://www.acmicpc.net/problem/27922
// 현대모비스 입사 프로젝트
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size1 = Integer.parseInt(sArray[0]);
        int size2 = Integer.parseInt(sArray[1]);
        int answer = 0;
        int[][] array = new int[size1][3];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        int[] sumArray = new int[size1];
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            sumArray[i] = sum;
        }
        for (int i = 0; i < 3; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < sumArray.length; j++) {
                list.add(sumArray[j] - array[j][i]);
            }
            Collections.sort(list);
            answer = Integer.max(answer, list.get(list.size() - 1) + list.get(list.size() - 2));
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
