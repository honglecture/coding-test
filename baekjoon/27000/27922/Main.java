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
        int n = Integer.parseInt(sArray[0]);
        int m = Integer.parseInt(sArray[1]);
        int[][] array =  new int[n][3];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        int[] sumArray = new int[n];
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            sumArray[i] = sum;
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < sumArray.length; i++) {
            list1.add(sumArray[i] - array[i][0]);
            list2.add(sumArray[i] - array[i][1]);
            list3.add(sumArray[i] - array[i][2]);
        }
        Collections.sort(list1);
        Collections.sort(list2);
        Collections.sort(list3);
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int answer = 0;
        for (int i = list1.size() - 1; i >= list1.size() - m; i--) {
            sum1 += list1.get(i);
            sum2 += list2.get(i);
            sum3 += list3.get(i);
        }
        answer = Integer.max(sum1, Integer.max(sum2, sum3));
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
