// https://www.acmicpc.net/problem/2783
// 삼각 김밥
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(bf.readLine());
        int[][] array = new int[size + 1][2];
        array[0][0] = Integer.parseInt(sArray[0]);
        array[0][1] = Integer.parseInt(sArray[1]);
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            array[i + 1][0] = Integer.parseInt(sArray[0]);
            array[i + 1][1] = Integer.parseInt(sArray[1]);
            
        }
        for (int i = 0; i < array.length; i++) {
            int n1 = array[i][0];
            int n2 = array[i][1];
            double result = (1000.0 / n2) * n1;
            list.add(result);
        }
        
        Collections.sort(list);
        System.out.println(String.format("%.2f", list.get(0)));
        bw.flush();
        bw.close();
    }
}