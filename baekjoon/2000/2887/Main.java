// https://www.acmicpc.net/problem/2887
// 행성 터널
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int[][] array = new int[n][4];
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            array[i][0] = i;
            array[i][1] = Integer.parseInt(sArray[0]);
            array[i][2] = Integer.parseInt(sArray[1]);
            array[i][3] = Integer.parseInt(sArray[2]);
        }
        
        bw.flush();
        bw.close();
    }
}