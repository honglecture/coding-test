// https://www.acmicpc.net/problem/15905
// 스텔라(STELLA)가 치킨을 선물했어요
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[][] array = new int[size][2];
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            array[i][0] = Integer.parseInt(sArray[0]);
            array[i][1] = Integer.parseInt(sArray[1]);
        }
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o1[1] - o2[1];
                } else {
                    return o2[0] - o1[0];
                }
            }}
        );
        if(size <= 5){
            System.out.println(answer);
        } else {
            int keyNum = array[4][0];
            for (int i = 5; i < array.length; i++) {
                if(array[i][0] == keyNum){
                    answer++;
                }
            }
            System.out.println(answer);
        }
        bw.flush();
        bw.close();
    }
    
}