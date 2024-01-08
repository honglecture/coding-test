// https://www.acmicpc.net/problem/9076
// 점수 집계
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int[] array = new int[sArray.length];
            for (int j = 0; j < array.length; j++) {
                array[j] = Integer.parseInt(sArray[j]);
            }
            Arrays.sort(array);
            int n1 = array[1];
            int n2 = array[3];
            if(n2 - n1 >= 4){
                bw.write("KIN\n");
            } else {
                bw.write((array[1] + array[2] + array[3]) + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}