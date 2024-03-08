// https://www.acmicpc.net/problem/23246
// Sport Climbing Combined
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[][] array = new int[size][4];
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] a1, int[] a2) {
                int m1 = a1[1] * a1[2] * a1[3];
                int m2 = a2[1] * a2[2] * a2[3];
                if(m1 == m2){
                    int s1 = a1[1] + a1[2] + a1[3];
                    int s2 = a2[1] + a2[2] + a2[3];
                    if(s1 == s2){
                        if(a1[0] < a2[0]){
                            return -1;
                        } else {
                            return 1;
                        }
                    } else {
                        if(s1 < s2){
                            return -1;
                        } else {
                            return 1;
                        }
                    }
                } else {
                    if(m1 < m2){
                        return -1;
                    } else {
                        return 1;
                    }
                }
            }
        });
        System.out.println(array[0][0] + " " + array[1][0] + " " + array[2][0]);
        bw.flush();
        bw.close();
    }
    

}
