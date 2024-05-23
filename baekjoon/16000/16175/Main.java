// https://www.acmicpc.net/problem/16175
// General Election
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int x = Integer.parseInt(sArray[0]);
            int y = Integer.parseInt(sArray[1]);
            int[][] array = new int[y][x];
            for (int j = 0; j < array.length; j++) {
                sArray = bf.readLine().split(" ");
                for (int k = 0; k < array[j].length; k++) {
                    array[j][k] = Integer.parseInt(sArray[k]);
                }
            }
            int[] sumArray = new int[x];
            int max = 0;
            int answer = 0;
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array[j].length; k++) {
                    sumArray[k] += array[j][k];
                }
            }
            for (int j = 0; j < sumArray.length; j++) {
                if(max < sumArray[j]){
                    max = sumArray[j];
                    answer = j + 1;
                }
            }
            bw.write(answer +"\n");
        }
        bw.flush();
        bw.close();
    }

}
