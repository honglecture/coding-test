// https://www.acmicpc.net/problem/20341
// Moderate Pace
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[][] array = new int[3][size];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        for (int i = 0; i < array[0].length; i++) {
            List<Integer> innerList = new ArrayList<>();
            for (int j = 0; j < array.length; j++) {
                innerList.add(array[j][i]);
            }
            Collections.sort(innerList);
            list.add(innerList.get(1));
        }
        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i) + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }

}
