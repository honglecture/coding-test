// https://www.acmicpc.net/problem/5939
// Race Results
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
        int[][] array = new int[size][3];
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int n3 = Integer.parseInt(sArray[2]);
            array[i][0] = n1;
            array[i][1] = n2;
            array[i][2] = n3;
        }
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] a1, int[] a2) {
                if(a1[0] == a2[0]){
                    if(a1[1] ==  a2[1]){
                        return a1[2] - a2[2];
                    } else {
                        return a1[1] - a2[1];
                    }
                } else {
                    return a1[0] - a2[0];
                }
            }
        });
        for (int i = 0; i < array.length; i++) {
            bw.write(array[i][0] + " " + array[i][1] + " " + array[i][2] + "\n");
        }
        bw.flush();
        bw.close();
    }
}