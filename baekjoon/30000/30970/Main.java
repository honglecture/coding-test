// https://www.acmicpc.net/problem/30970
// 선택의 기로
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[][] array1 = new int[size][2];
        int[][] array2 = new int[size][2];
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            array1[i][0] = n1;
            array1[i][1] = n2;
            array2[i][0] = n1;
            array2[i][1] = n2;
        }
        Arrays.sort(array1, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o1[1] - o2[1];
                } else {
                    return o2[0] - o1[0];
                }
            }
        });
        Arrays.sort(array2, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){
                    return o2[0] - o1[0];
                } else {
                    return o1[1] - o2[1];
                }
            }
        });
        System.out.println(array1[0][0] + " " + array1[0][1] + " " + array1[1][0] + " " + array1[1][1]);
        System.out.println(array2[0][0] + " " + array2[0][1] + " " + array2[1][0] + " " + array2[1][1]);
        bw.flush();
        bw.close();
    }

    

}
