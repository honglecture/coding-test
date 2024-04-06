// https://www.acmicpc.net/problem/6160
// Election Time
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
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int k = Integer.parseInt(sArray[1]);
        int[][] array = new int[size][3];
        int maxNum = 0;
        int maxIndex = 0;
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            array[i][0] = n1;
            array[i][1] = n2;
            array[i][2] = i + 1;
        }
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] a1, int[] a2) {
                return a2[0] - a1[0];
            }
        });
        for (int i = 0; i < k; i++) {
            int n = array[i][1];
            int index = array[i][2];
            if(maxNum < n){
                maxNum = n;
                maxIndex = index;
            }
        }
        System.out.println(maxIndex);
        bw.flush();
        bw.close();
    }
   
}