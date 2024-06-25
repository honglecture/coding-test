// https://www.acmicpc.net/problem/5427
// 불
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int x = Integer.parseInt(sArray[0]);
            int y = Integer.parseInt(sArray[1]);
            String[][] array = new String[y][x];
            
            for (int j = 0; j < array.length; j++) {
                sArray = bf.readLine().split("");
                for (int k = 0; k < sArray.length; k++) {
                    array[j][k] = sArray[k];
                }
            }
            String result = getAnswer(array);
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static String getAnswer(String[][] array){
        String result = "IMPOSSIBLE";
        int[] array1 = {-1, 0 ,1, 0};
        int[] array2 = {0, -1, 0, 1};
        Queue<int[]> queue = new ArrayDeque<>();
        
        return result;
    }
}