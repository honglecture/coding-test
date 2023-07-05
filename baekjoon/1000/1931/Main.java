// https://www.acmicpc.net/problem/1931
// 회의실 배정
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
                if(o1[1] == o2[1]){
                    return o1[0] - o2[0];
                } else {
                    return o1[1] - o2[1]; 
                }
            }
        });
        int count = 1;
        int currentStartTime = array[0][0];
        int nextStartTime = array[0][1];
        for (int i = 1; i < array.length; i++) {
            int startTime = array[i][0];
            int endTime = array[i][1];
            if(currentStartTime == nextStartTime){
                if(endTime == nextStartTime){
                    count++;
                    continue;
                }
            }
            if(startTime >= nextStartTime){
                count++;
                nextStartTime = endTime;
            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}