// https://www.acmicpc.net/problem/14039
// Magic Squares
import java.io.*;
import java.util.HashSet;
import java.util.Set;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] array = new int[4][4];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        for (int i = 0; i < array.length; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < array.length; j++) {
                sum1 += array[j][i];
                sum2 += array[i][j];
            }
            set.add(sum1);
            set.add(sum2);
        }
        if(set.size() == 1){
            System.out.println("magic");
        } else {
            System.out.println("not magic");
        }
        bw.flush();
        bw.close();
    }


}